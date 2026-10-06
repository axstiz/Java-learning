import java.util.Arrays;
import java.util.Random;

public class MergeSortBenchmark {

    public static void sort(int[] array, int from, int to) {
        if (to - from <= 1) {
            return;
        }
        int mid = (from + to) / 2;
        sort(array, from, mid);
        sort(array, mid, to);
        merge(array, from, mid, to);
    }

    public static void merge(int[] array, int from, int mid, int to) {
        int[] left = Arrays.copyOfRange(array, from, mid);
        int[] right = Arrays.copyOfRange(array, mid, to);

        int i = 0;
        int j = 0;
        int k = from;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int size = 100;

        while (size <= 10_000_000) {
            int[] array = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt();
            }

            long start = System.currentTimeMillis();
            sort(array, 0, size);
            long finish = System.currentTimeMillis();

            System.out.println(size + " -> " + (finish - start) + " мс");

            size = size * 10;
        }
    }
}
