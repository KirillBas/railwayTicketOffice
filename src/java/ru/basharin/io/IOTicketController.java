package ru.basharin.io;

import ru.basharin.model.Ticket;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOTicketController implements TicketRepository {
    private final String FILE_NAME = "src\\java\\ru\\basharin\\resources\\ticket.txt";
    private final File file = new File(FILE_NAME);

    @Override
    public void buy(String arrivalPlace, String userName) {
        List<String> tickets = new ArrayList<>();
        String line;
        String temp;
        String temp2;
        try(BufferedReader bReader = new BufferedReader(new FileReader(file))) {
            while ((line = bReader.readLine()) != null) {
                String[] arrOfStr = line.split(" ");
                if (arrOfStr[1].equals(arrivalPlace)) {
                    temp = line.replaceAll("false", "true");
                    temp2 = temp.replaceAll("null", userName);
                    tickets.add(temp2);
                } else {
                    tickets.add(line);
                }
            }
            try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(file, false))) {
                for (String res: tickets) {
                    bWriter.write(res + "\n");
                }
            }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ticket> allSellsTicket() {
        return null;
    }

    @Override
    public List<Ticket> allFreeTicket() {
        return null;
    }

    @Override
    public void save(Ticket ticket) {
        try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(file, true))) {
            bWriter.write(String.valueOf(ticket));
            bWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void returnTicket(String userName) {
        List<String> tickets = new ArrayList<>();
        String line;
        String temp;
        String temp2;
        try(BufferedReader bReader = new BufferedReader(new FileReader(file))) {
            while ((line = bReader.readLine()) != null) {
                String[] arrOfStr = line.split(" ");
                if (arrOfStr[7].equals(userName)) {
                    temp = line.replaceAll("true", "false");
                    temp2 = temp.replaceAll(userName, "null");
                    tickets.add(temp2);
                } else {
                    tickets.add(line);
                }
            }
            try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(file, false))) {
                for (String res: tickets) {
                    bWriter.write(res + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
