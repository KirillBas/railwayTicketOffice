package ru.basharin.model;

import java.math.BigDecimal;

public class Ticket {
    private Route route;
    private Wagon wagon;
    private int wagonNumber;
    private String userName;
    private int place;
    private BigDecimal price;
    private boolean sell;

    public Ticket(Route route, Wagon wagon, int wagonNumber, String userName, int place, BigDecimal price, boolean sell) {
        this.route = route;
        this.wagon = wagon;
        this.wagonNumber = wagonNumber;
        this.userName = userName;
        this.place = place;
        this.price = price;
        this.sell = sell;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public int getWagonNumber() {
        return wagonNumber;
    }

    public void setWagonNumber(int wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isSell() {
        return sell;
    }

    public void setSell(boolean sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return route + " "
                + wagonNumber + " "
                + place + " "
                + wagon + " "
                + userName + " "
                + price + " "
                + sell;
    }
}
