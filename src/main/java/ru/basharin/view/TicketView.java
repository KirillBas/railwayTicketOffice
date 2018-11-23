package ru.basharin.view;

import ru.basharin.controller.RouteController;
import ru.basharin.controller.TicketController;

import java.util.Scanner;

public class TicketView {
    private Scanner scanner;
    private RouteController routeController = new RouteController();
    private TicketController tc = new TicketController();

    public TicketView(Scanner scanner) {
        this.scanner = scanner;
    }

    private void greetingMenu() {
        System.out.println("Это железнодорожная касса");
        System.out.println("Вам доступны следующие функции");
        System.out.println("1: Промотр маршрутов");
        System.out.println("2: Поиск маршрутов");
        System.out.println("3: Покупка билета");
        System.out.println("4: Возврат билета");
        System.out.println("#: Выход");
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
                    searchRoutes();
                    break;
                case  "3":
                    buyTicket();
                    break;
                case "4":
                    returnTicket();
                    break;
                case "#":
                    return;
            }
        }
    }

    // TODO: 23.11.2018 в этом методе по идее просто снимается привязка билета к юзеру, но для простоты юзера здесь нет
    private void returnTicket() {
        String userName;
        while (true) {
            System.out.println("Для возврата введите имя указаное на билете");
            System.out.println("Для выхода нажмите #");
            userName = scanner.nextLine();
            if (userName.equals("#")) {
                return;
            }
            break;
        }
        tc.returnTicket(userName);
        System.out.println(userName + " Вы вернули билет.");
    }

    private void printRoute() {
        System.out.println("Список маршрутов:");
        String input;
        while (true) {
            System.out.println("Для выхода нажмите #");
            System.out.println(routeController.readAllRoute());
            input = scanner.nextLine();
            if (input.equals("#")) {
                return;
            }
        }

    }

    private void buyTicket() {
        String arrivalPlace;
        while (true) {
            System.out.println("Для выбора маршрута укажите место прибытия");
            System.out.println("Для выхода нажмите #");
            arrivalPlace = scanner.nextLine();
            if (arrivalPlace.equals("#")) {
                return;
            }
            break;

        }

        String name;

        while (true) {
            System.out.println("Введите свое имя.");
            System.out.println("Для выхода нажмите #");
            name = scanner.nextLine();
            if (name.equals("#")) {
                return;
            }
            break;
        }

        tc.buyTicket(arrivalPlace, name);
        System.out.println(name + " Вы купили билет до " + arrivalPlace);
    }

    private void searchRoutes() {
        String arrivalPlace;
        while (true) {
            System.out.println("Для выбора маршрута укажите место прибытия");
            System.out.println("Для выхода нажмите #");
            arrivalPlace = scanner.nextLine();
            if (arrivalPlace.equals("#")) {
                return;
            }
            break;

        }

        String departureData;
        while (true) {
            System.out.println("Укажите время отбытия в формате гггг-мм-дд");
            System.out.println("Для выхода нажмите #");
            departureData = scanner.nextLine();
            if (departureData.equals("#")) {
                return;
            }
            break;

        }

        String arrivalData;
        while (true) {
            System.out.println("Укажите время прибытия в формате гггг-мм-дд");
            System.out.println("Для выхода нажмите #");
            arrivalData = scanner.nextLine();
            if (arrivalData.equals("#")) {
                return;
            }
            break;

        }

        System.out.println(routeController.searchRoute(arrivalPlace, departureData, arrivalData));
    }
}
