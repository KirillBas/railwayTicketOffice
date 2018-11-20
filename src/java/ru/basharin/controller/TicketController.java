package ru.basharin.controller;

import ru.basharin.io.IOTicketController;
import ru.basharin.model.Ticket;

public class TicketController {
    private IOTicketController ioTicketController = new IOTicketController();

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
