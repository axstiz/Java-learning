import java.util.Arrays;
import java.util.Random;

public class ArraysSortBenchmark {

    public static void main(String[] args) {
        int size = 100;

        while (size <= 10_000_000) {
            int[] array = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt();
            }

            long start = System.currentTimeMillis();
            Arrays.sort(array);
            long finish = System.currentTimeMillis();

            System.out.println(size + " -> " + (finish - start) + " мс");

            size = size * 10;
        }
    }
}
