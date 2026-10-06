import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа вычисляет кинетическую энергию тела.");
        System.out.println("Формула: E = m * v^2 / 2");
        System.out.println("Введите массу тела (кг) и скорость (м/с):");

        System.out.print("Масса: ");
        double mass = scanner.nextDouble();

        System.out.print("Скорость: ");
        double velocity = scanner.nextDouble();
        scanner.close();

        if (mass <= 0) {
            System.out.println("Ошибка: масса должна быть положительной.");
            return;
        }
        if (velocity < 0) {
            System.out.println("Ошибка: скорость не может быть отрицательной.");
            return;
        }

        double energy = mass * velocity * velocity / 2.0;

        System.out.printf("Кинетическая энергия: %.2f Дж%n", energy);

        scanner.close();
    }
}
