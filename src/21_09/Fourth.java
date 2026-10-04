import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Приглашение: объясняем, что делает программа
        System.out.println("Программа вычисляет кинетическую энергию тела.");
        System.out.println("Формула: E = m * v^2 / 2");
        System.out.println("Введите массу тела (кг) и скорость (м/с):");

        // 2. Приглашение ввести данные
        System.out.print("Масса: ");
        double mass = scanner.nextDouble();

        System.out.print("Скорость: ");
        double velocity = scanner.nextDouble();

        // 3. Валидация введённых данных
        if (mass <= 0) {
            System.out.println("Ошибка: масса должна быть положительной.");
            return; // прекращаем выполнение
        }
        if (velocity < 0) {
            System.out.println("Ошибка: скорость не может быть отрицательной.");
            return; // прекращаем выполнение
        }

        // 4. Выполнение расчёта по формуле
        double energy = mass * velocity * velocity / 2.0;

        // 5. Вывод результата
        System.out.printf("Кинетическая энергия: %.2f Дж%n", energy);

        scanner.close();
    }
}