package PlayToys;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        store.addToy(new Toy(1, "LegoCity", 5, 25));
        store.addToy(new Toy(2, "Barby&Ken", 3, 42));
        store.addToy(new Toy(3, "MostarTruck", 8, 23));
        store.addToy(new Toy(4, "BigBool", 4, 50));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Введите номер команды (1-read, 2-add, 3-update, 4-play, 5-exit)");

            String choice = scanner.next();

            switch (choice) {
                case "1":
                    System.out.println("Игрушки в магазине:");
                    store.showToys();
                    break;
                case "2":
                    System.out.println("Введите id игрушки");
                    int id = scanner.nextInt();
                    System.out.println("Введите имя игрушки");
                    String name = scanner.next();
                    System.out.println("Введите кол-во игрушек");
                    int quantity = scanner.nextInt();
                    System.out.println("Введите вероятность выпадения игрушки (от 0 до 100)");
                    int probability = scanner.nextInt();
                    store.addToy(new Toy(id, name, quantity, probability));
                    break;
                case "3":
                    System.out.println("Введите id игрушки");
                    int toyId = scanner.nextInt();
                    System.out.println("Введите вероятность выпадения игрушки (от 0 до 100)");
                    int toyProbability = scanner.nextInt();
                    store.updateToyProbability(toyId, toyProbability);
                    break;
                case "4":
                    store.play();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Недопустимая команда");
            }
        }
    }
    
}
