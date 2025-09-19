package org.developer.dsa.a_beginner.e_binary_search;

import java.util.Arrays;

public class BinarySearch1 {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 8, 3, 9, -1, 5, 2};
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int index = myBinarySearch(arr, 2);
        System.out.println("Found index: " + index);
    }

    private static int myBinarySearch(int[] arr, int value) {
        int low = arr[0];
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (value > arr[mid]) {
                low = mid + 1;
            } else if (value < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
