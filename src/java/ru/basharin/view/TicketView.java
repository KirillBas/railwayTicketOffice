package ru.basharin.view;

import java.util.Scanner;

public class TicketView {
    private Scanner scanner;

    public void greetingMenu() {
        System.out.println("Это железнодорожная касса");
        System.out.println("Вам доступны следующие функции");
        System.out.println("1: Промотр маршрутов");
        System.out.println("2: Покупка билета");
    }

    public void selectMenu() {
        String input;
        while (true) {
            greetingMenu();
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    printRoute();
                    break;
                case "2":
//                    buyTicket();
                    break;
            }
        }
    }

    public void printRoute() {

    }
}
