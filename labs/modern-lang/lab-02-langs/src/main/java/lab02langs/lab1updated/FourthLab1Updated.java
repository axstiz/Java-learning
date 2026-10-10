package lab02langs.lab1updated;
import java.util.Scanner;

public class FourthLab1Updated {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольное приложение 'Кинетическая энергия' ===");
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
                    System.out.println("Программа вычисляет кинетическую энергию тела по формуле: E = m * v^2 / 2");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск расчета ---");
                    double mass = input("масса");
                    double velocity = input("скорость");

                    double energy = calculateEnegry(mass, velocity);
                    System.out.printf("Результат -> Кинетическая энергия: %.2f Дж%n", energy);
                }
                case "exit" -> {
                    System.out.println("Выход из программы. Пока!");
                    return;
                }
                default -> System.out.println("Ошибка: неизвестная команда! Используйте: info, do или exit.");
            }
        }
    }
    public static double calculateEnegry(double mass, double velocity) {
        return mass * Math.pow(velocity, 2) / 2.0;
    }

    public static double input(String title) {
        Scanner scanner = new Scanner(System.in);
        double value = 0;
        while (true) {
            System.out.printf("Введите значение (%s): ", title);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();

                boolean isValid = switch (title) {
                    case "масса" -> value > 0;
                    case "скорость" -> value >= 0;
                    default -> true;
                };

                if (isValid) {
                    break;
                } else {
                    if (title.equals("масса")) {
                        System.out.println("Ошибка: масса должна быть строго положительной (> 0).");
                    } else {
                        System.out.println("Ошибка: скорость не может быть отрицательной (>= 0).");
                    }
                }
            } else {
                System.out.println("Ошибка: введите число, а не текст!");
                scanner.next();
            }
        }
        return value;
    }
}
