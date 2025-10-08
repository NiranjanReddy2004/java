package Array;

import java.util.Arrays;
import java.util.Random;

public class insertionSort {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
        insertionsort(a);

        System.out.println(Arrays.toString(a));
    }

    static void insertionsort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int j = i-1;
            int key = a[i];
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
}

