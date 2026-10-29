package lab02algs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First {

    public static void main(String[] args) {
        double[][] tests = {
                {0.9, 0.2, 0.7, 0.1},
                {0.44, 0.12, 0.88},
                {0, 0.99, 0.05, 0.5, 0.33}
        };
        for (double[] test : tests) {
            double[] arr = Arrays.copyOf(test, test.length);
            sort(arr);
            System.out.println(Arrays.toString(test) + " -> " + Arrays.toString(arr));
        }
    }

    public static void sort(double[] arr) {
        if (arr.length == 0) return;

        int bucketCount = arr.length;
        List<List<Double>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (double val : arr) {
            if (!(val >= 0 && val < 1.0)) {
                throw new IllegalArgumentException("значение " + val + " вне [0; 1)");
            }
            int index = Math.min(bucketCount - 1, (int) (val * bucketCount));
            buckets.get(index).add(val);
        }

        int index = 0;
        for (List<Double> bucket : buckets) {
            insertionSort(bucket);
            for (double val : bucket) {
                arr[index++] = val;
            }
        }
    }

    private static void insertionSort(List<Double> bucket) {
        for (int i = 1; i < bucket.size(); i++) {
            double key = bucket.get(i);
            int j = i - 1;
            while (j >= 0 && bucket.get(j) > key) {
                bucket.set(j + 1, bucket.get(j));
                j--;
            }
            bucket.set(j + 1, key);
        }
    }

}
