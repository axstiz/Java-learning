import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = scanner.nextDouble();
        System.out.println(calculateY(x));
    }
    public static double calculateY(double x) {
        return 4 * Math.pow(x, 3) + 23*x - 55;
    }
}
