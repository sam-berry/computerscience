package org.computerscience.berrysa.calc.heap;

/**
 * @author berrysa
 */
public class Main {
    public static void main(String[] args) {
        int size = 11;
        int[] testArray = buildTestArray2();

        System.out.println("Pre-Heapified array: ");
        for (int i=0; i < size; i++) {
            System.out.println(testArray[i]);
        }

        buildHeap(testArray, size);

        System.out.println("Heapified array: ");
        for (int i=0; i < size; i++) {
            System.out.println(testArray[i]);
        }
    }

    private static void buildHeap(int[] a, int size) {
        int start = (size / 2);

        for (; start > 0; start--) {
            heapify(a, start, size-1);
        }
    }

    private static void heapify(int[] a, int i, int size) {
        int smallest;

        int left = 2 * i;
        int right = left + 1;

        if (left <= size && a[left] < a[i]) {
            smallest = left;
        } else {
            smallest = i;
        }

        if (right <= size && a[right] < a[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
            heapify(a, smallest, size);
        }
    }

    private static int[] buildTestArray1() {
        int[] testArray = new int[10];
        testArray[0] = 28;
        testArray[1] = 19;
        testArray[2] = 31;
        testArray[3] = 42;
        testArray[4] = 12;
        testArray[5] = 14;
        testArray[6] = 92;
        testArray[7] = 35;
        testArray[8] = 11;
        testArray[9] = 24;
        return testArray;
    }

    private static int[] buildTestArray2() {
        int[] testArray = new int[11];
        testArray[0] = 6;
        testArray[1] = 5;
        testArray[2] = 4;
        testArray[3] = 3;
        testArray[4] = 2;
        testArray[5] = 1;
        testArray[6] = 11;
        testArray[7] = 9;
        testArray[8] = 8;
        testArray[9] = 10;
        testArray[10] = 7;
        return testArray;
    }
}