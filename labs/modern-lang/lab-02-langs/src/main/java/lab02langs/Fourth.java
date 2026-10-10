package lab02langs;
import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {
        double x1 = input("x1");
        double y1 = input("y1");
        double z1 = input("z1");
        double x2 = input("x2");
        double y2 = input("y2");
        double z2 = input("z2");
        System.out.println(calculateDistance(x1, y1, z1, x2, y2, z2));
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

    public static double calculateDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

}
