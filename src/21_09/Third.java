import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        double x = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        double y = scanner2.nextDouble();
        System.out.println(comparison(x, y));
    }

    public static int comparison(double x, double y) {

//        if (x > y) {
////            System.out.println(2);
//            return 2;
//        } else {
////            System.out.println(1);
//            return 1;

        return x > y ? 2 : 1;

    }
}
