package ru.basharin.controller;

import ru.basharin.io.IOTicketRepositoryImpl;
import ru.basharin.model.Ticket;

public class TicketController {
    private IOTicketRepositoryImpl ioTicketController = new IOTicketRepositoryImpl();

    public void saveTicket(Ticket ticket) {
        if (ticket == null) throw new IllegalArgumentException();
        ioTicketController.save(ticket);
    }

    public void buyTicket(String arrivalPlace, String userName) {
        ioTicketController.buy(arrivalPlace, userName);
    }

    public void returnTicket(String userName) {
        ioTicketController.returnTicket(userName);
    }
}
