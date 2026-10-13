package lab03langs.lab2updated;

import java.util.Scanner;

public class FourthLab2Updated {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольное приложение 'Расчет расстояния между 2мя точками' ===");
        System.out.println("Доступные команды: info, do, exit");
        runMenu(scanner);
    }

    public static void runMenu(Scanner scanner) {
        while (true) {
            System.out.print("\nВведите команду: ");
            String command = scanner.next().trim().toLowerCase();

            switch (command) {
                case "info" -> {
                    System.out.println("\n--- Информация о программе ---");
                    System.out.println("Программа выводит расстояние между 2мя точками в 3D");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск программы ---");
                    System.out.println(calculateDistance(inputPoint("point1"), inputPoint("point2")));
                }
                case "exit" -> {
                    System.out.println("Выход из программы. Пока!");
                    return;
                }
                default -> System.out.println("Ошибка: неизвестная команда! Используйте: info, do или exit.");
            }
        }
    }

    public static double input(String title) {
        Scanner scanner = new Scanner(System.in);
        double value = 0;
        while (true) {
            System.out.printf("Введите %s:%n", title);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                break;
            } else {
                System.out.println("Ошибка: введите число, а не текст!");
                scanner.next();
            }
        }
        return value;
    }

    public static double[] inputPoint(String title) {
        double x = input("x for " + title);
        double y = input("y for " + title);
        double z = input("z for " + title);
        double[] point = new double[] {x, y, z};
        return point;
    }

    public static double calculateDistance(double[] point1, double[] point2) {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += Math.pow(point1[i] - point2[i], 2);
        }
        return Math.sqrt(sum);
    }

}
