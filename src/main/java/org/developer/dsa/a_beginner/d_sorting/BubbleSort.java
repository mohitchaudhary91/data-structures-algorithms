package org.developer.dsa.a_beginner.d_sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{4, 6, 8, 3, 9, -1, 5, 2};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // want to sort in descending order reverse the greater than sign
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
