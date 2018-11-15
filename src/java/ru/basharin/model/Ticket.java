package ru.basharin.model;

public class Ticket {
    private Route route;
    private Wagon wagon;
    private User user;
    private int place;
    private int price;
    private boolean sell;

    public Ticket(Route route, Wagon wagon, User user, int place, int price, boolean sell) {
        this.route = route;
        this.wagon = wagon;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
        return "Ticket{" +
                "route=" + route +
                ", wagon=" + wagon +
                ", user=" + user +
                ", place=" + place +
                ", price=" + price +
                ", sell=" + sell +
                '}';
    }
}
