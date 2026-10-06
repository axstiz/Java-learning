package Lab_1_algorithms;

public class SecondTask {

    public static void main(String[] args) {

        // Проверка из условия: first = 12, difference = -3, n = 4 -> Ожидается: 0
        System.out.println("signalPower(12, -3, 4) = " + signalPower(12, -3, 4));

        // Проверка из условия: first = 5, difference = 2, n = 3 -> Ожидается: 11
        System.out.println("signalPower(5, 2, 3) = " + signalPower(5, 2, 3));

        // n = 0 -> Ожидается: first
        System.out.println("signalPower(13, 7, 0) = " + signalPower(13, 7, 0));
    }

    public static int signalPower(int signal, int difference, int n) {
        if (n == 0) {
            return signal;
        }
        return signalPower(signal, difference, n - 1) + difference;
    }
}
