package ru.basharin.io;

import ru.basharin.model.Route;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IORouteController implements RouteRepository{
    private final String FILE_NAME = "src\\java\\ru\\basharin\\resources\\route.txt";
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
                Route route = new Route(null, null, null, null);
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
}
