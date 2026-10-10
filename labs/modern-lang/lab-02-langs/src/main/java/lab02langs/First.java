package lab02langs;

public class First {

    public static void main(String[] args) {
        for (double degrees = 0; degrees <= 90; degrees += 5 ) {
            if (degrees == 90.0) {
                System.out.printf("tg(%.0f) не существует (не определён)%n", degrees);
            } else {
                double radians = Math.toRadians(degrees);
                double result = Math.tan(radians);
                System.out.printf("tg(%.0f) = %.5f%n", degrees, result);
            }
        }
    }

}
