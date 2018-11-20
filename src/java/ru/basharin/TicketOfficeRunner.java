package ru.basharin;

import ru.basharin.controller.RouteController;
import ru.basharin.controller.TicketController;
import ru.basharin.model.Route;
import ru.basharin.model.Ticket;
import ru.basharin.model.Wagon;

import java.math.BigDecimal;
import java.text.ParseException;

public class TicketOfficeRunner {
    public static void main(String[] args) throws ParseException {
        RouteController rc = new RouteController();
        TicketController tc = new TicketController();

        Route route1 = new Route("Новороссийск", "Москва", "2018-01-01", "2018-01-03");
        Route route2 = new Route("Новороссийск", "Киев", "2018-01-01", "2018-01-03");
        Route route3 = new Route("Новороссийск", "Ростов", "2018-01-01", "2018-01-02");
        Route route4 = new Route("Новороссийск", "Минск", "2018-01-01", "2018-01-04");

//        rc.saveRoute(route1);
//        rc.saveRoute(route2);
//        rc.saveRoute(route3);
//        rc.saveRoute(route4);

        Ticket ticket1 = new Ticket(route1, Wagon.COMPARTMENT, 1, null, 12, new BigDecimal(125.25), false);
        Ticket ticket2 = new Ticket(route2, Wagon.RESERVED_SEATS, 1, null, 2, new BigDecimal(100.45), false);
        Ticket ticket3 = new Ticket(route3, Wagon.SV, 1, null, 5, new BigDecimal(423.25), false);
        Ticket ticket4 = new Ticket(route4, Wagon.SV, 1, null,6, new BigDecimal(423.25), false);

//        tc.saveTicket(ticket1);
//        tc.saveTicket(ticket2);
//        tc.saveTicket(ticket3);
//        tc.saveTicket(ticket4);
//        tc.buyTicket("Минск", "Ruben");
        tc.returnTicket("Ruben");


//        System.out.println(rc.readAllRoute());
    }
}
