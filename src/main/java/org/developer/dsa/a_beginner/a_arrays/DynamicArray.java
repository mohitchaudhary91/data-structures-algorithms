package org.developer.dsa.a_beginner.a_arrays;

public class DynamicArray {

    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        arr = new int[this.capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushOnBack(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popFromBack() {
        if (size > 0) {
            size--;
        }
        return arr[size];
    }

    private void resize() {
        this.capacity = this.capacity * 2;
        int[] newArr = new int[this.capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
