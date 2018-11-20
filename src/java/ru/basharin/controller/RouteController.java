package ru.basharin.controller;

import ru.basharin.io.IORouteController;
import ru.basharin.model.Route;

import java.util.List;

public class RouteController {
    private IORouteController ioRouteController = new IORouteController();

    public void saveRoute(Route route) {
        if (route ==null) throw new IllegalArgumentException();

        ioRouteController.save(route);
    }

    public List<Route> readAllRoute() {
        return ioRouteController.readAll();
    }
}
