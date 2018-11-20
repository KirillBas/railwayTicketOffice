package ru.basharin.io;

import ru.basharin.model.Ticket;

import java.util.List;

public interface TicketRepository {
    void buy(String arrivalPlace, String userName);
    List<Ticket> allSellsTicket();
    List<Ticket> allFreeTicket();
    void save(Ticket ticket);
    void returnTicket(String userName);
}
