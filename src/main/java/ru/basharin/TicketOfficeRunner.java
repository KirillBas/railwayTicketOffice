package ru.basharin;

import ru.basharin.controller.RouteController;
import ru.basharin.controller.TicketController;
import ru.basharin.model.Route;
import ru.basharin.model.Ticket;
import ru.basharin.model.Wagon;
import ru.basharin.view.TicketView;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Scanner;

public class TicketOfficeRunner {
    public static void main(String[] args) throws ParseException {
//        RouteController rc = new RouteController();
//        TicketController tc = new TicketController();
        Scanner scanner = new Scanner(System.in);
        TicketView start = new TicketView(scanner);
        // TODO: 22.11.2018 для проверки можете задать любое количество билетов и маршрутов

//        Route route1 = new Route("Новороссийск", "Москва", "2018-01-01", "2018-01-03");
//        Route route2 = new Route("Новороссийск", "Киев", "2018-01-02", "2018-01-05");
//        Route route3 = new Route("Новороссийск", "Ростов", "2018-01-01", "2018-01-02");
//        Route route4 = new Route("Новороссийск", "Минск", "2018-01-01", "2018-01-04");
//
//        Ticket ticket1 = new Ticket(route1, Wagon.COMPARTMENT, 1, null, 12, new BigDecimal(125.25), false);
//        Ticket ticket2 = new Ticket(route2, Wagon.RESERVED_SEATS, 1, null, 2, new BigDecimal(100.45), false);
//        Ticket ticket3 = new Ticket(route3, Wagon.SV, 1, null, 5, new BigDecimal(423.25), false);
//        Ticket ticket4 = new Ticket(route4, Wagon.SV, 1, null,6, new BigDecimal(423.25), false);

        start.selectMenu();
    }
}
