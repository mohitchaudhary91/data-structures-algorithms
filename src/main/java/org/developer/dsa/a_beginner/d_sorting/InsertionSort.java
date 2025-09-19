package org.developer.dsa.a_beginner.d_sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{4, 6, 8, 3, 9, -1, 5, 2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            // want to sort in descending order reverse the greater than sign
            while (j >= 0 && arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
