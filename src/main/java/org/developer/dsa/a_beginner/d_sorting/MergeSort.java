package org.developer.dsa.a_beginner.d_sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = new int[]{4, 6, 8, 3, 9, -1, 5, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }

    private static int[] mergeSort(int[] arr, int s, int e) {
        if (e - s + 1 <= 1) {
            return arr;
        }

        int m = (e + s) / 2;
        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);

        mergeBack(arr, s, e, m);
        return arr;
    }

    private static void mergeBack(int[] arr, int s, int e, int m) {
        int leftLength = m - s + 1;
        int rightLength = e - m;

        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = arr[s + i];
        }

        for (int i = 0; i < rightLength; i++) {
            rightArray[i] = arr[m + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = s;

        while (i < leftLength && j < rightLength) {
            // want to sort in descending order reverse the below if condition sign
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else if (leftArray[i] > rightArray[j]) {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
