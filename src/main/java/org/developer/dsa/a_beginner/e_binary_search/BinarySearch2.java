package org.developer.dsa.a_beginner.e_binary_search;

public class BinarySearch2 {

    public static void main(String[] args) {
        int element = secondBinarySearch(0, 100);
        System.out.println("Found element: " + element);
    }

    private static int secondBinarySearch(int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (isCorrect(mid) > 0) {
                low = mid + 1;
            } else if (isCorrect(mid) < 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // this type of binary search is useful when you are not given target but still you
    // have to search through search range based on some logic and condition given in question
    private static int isCorrect(int mid) {
        if (mid > 47) {
            return -1;
        } else if (mid < 47) {
            return 1;
        } else {
            return 0;
        }
    }
}
