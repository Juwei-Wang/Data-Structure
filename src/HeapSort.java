import java.io.*;
import java.util.Comparator;


public class HeapSort<E extends Comparable<E>> {
    private static Array A;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    public HeapSort(Array a){
        A = a;
        n = A.length() - 1;
    }

    // Build-Heap Function
    public static void buildheap(Array A) {
        for (int i = n / 2; i >= 0; i--) {
            System.out.println(i);
            maxheap(A, i);
        }
    }

    // Max-Heap Function
    public static void maxheap(Array A, int i) {
        left = 2 * i;
        right = 2 * i + 1;
        System.out.println(i + " " + left + " " + right);
        if (left <= n && A.get > A.get(i)) {
            largest = left;
        } else {
            largest = i;
        }

        if (right <= n && A.get(right) > A.get(largest)) {
            largest = right;
        }
        if (largest != i) {
            exchange(i, largest);
            maxheap(A, largest);
        }
    }

    // Exchange Function
    public static void exchange(int i, int j) {
        <E> t = A.get(i);
        A.set(i, A.get(j));
        A.set(j, t);
    }

}