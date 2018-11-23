package ru.basharin.model;

import java.util.Calendar;
import java.util.Date;

public class Route {
    private String departurePlace;
    private String arrivalPlace;
    private String departureTime;
    private String arrivalTime;

    public Route(String departurePlace, String arrivalPlace, String departureTime, String arrivalTime) {
        this.departurePlace = departurePlace;
        this.arrivalPlace = arrivalPlace;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Route() {
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return departurePlace +
                " " + arrivalPlace +
                " " + departureTime +
                " " + arrivalTime;
    }
}
