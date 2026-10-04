import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner scannerX = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = scannerX.nextDouble();
        System.out.println("y = " + calculateY(x));
    }
    public static double calculateY(double x) {
        return 4 * Math.pow(x, 3) + 23*x - 55;
    }
}
