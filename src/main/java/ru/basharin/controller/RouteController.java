package ru.basharin.controller;

import ru.basharin.io.IORouteRepositoryImpl;
import ru.basharin.io.RouteRepository;
import ru.basharin.model.Route;

import java.util.List;

public class RouteController {
    private RouteRepository repo;

    public RouteController() {
        repo = new IORouteRepositoryImpl();
    }

    public void saveRoute(Route route) {
        if (route ==null) throw new IllegalArgumentException();

        repo.save(route);
    }

    public List<Route> readAllRoute() {
        return repo.readAll();  
    }

    public List<String> searchRoute(String arrivalPlace, String departureData, String arrivalData) {
        return repo.searchRoute(arrivalPlace, departureData, arrivalData);
    }
}
