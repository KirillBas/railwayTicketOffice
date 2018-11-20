package ru.basharin.io;

import ru.basharin.model.Route;

import java.util.List;

public interface RouteRepository {
    void save(Route route);
    List<Route> readAll();
}
