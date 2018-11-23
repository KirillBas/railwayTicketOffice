package ru.basharin.io;

import ru.basharin.model.Route;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IORouteRepositoryImpl implements RouteRepository{
    private final String FILE_NAME = "src\\main\\resources\\route.csv";
    private final File file = new File(FILE_NAME);


    @Override
    public void save(Route route) {
        try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(file, true))) {
            bWriter.write(String.valueOf(route));
            bWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Route> readAll() {
        List<Route> routeList = new ArrayList<>();
        String line;
        try(BufferedReader bReader = new BufferedReader(new FileReader(file))) {
            while ((line = bReader.readLine()) != null) {
                String[] result = line.split(" ");
                Route route = new Route();
                route.setDeparturePlace(result[0]);
                route.setArrivalPlace(result[1]);
                route.setDepartureTime(result[2]);
                route.setArrivalTime(result[3]);
                routeList.add(route);
            }
            return routeList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // TODO: 21.11.2018 Продумать сравнение периодов
    @Override
    public List<String> searchRoute(String arrivalPlace, String departureData, String arrivalData) {
        List<String> resultList = new ArrayList<>();
        String line;
        try(BufferedReader bReader = new BufferedReader(new FileReader(file))) {
            while ((line = bReader.readLine()) != null) {
                String[] result = line.split(" ");
                LocalDate departureDate = LocalDate.parse(departureData);
                LocalDate arrivalDate = LocalDate.parse(arrivalData);
                LocalDate dateResult2 = LocalDate.parse(result[2]);
                LocalDate dateResult3 = LocalDate.parse(result[3]);
                if ((result[1].equals(arrivalPlace))
                        && (dateResult2.isBefore(departureDate))
                        && (dateResult3.isAfter(arrivalDate))) {
                    resultList.add(line);
                } else {
                    continue;
                }
            }
            return resultList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
