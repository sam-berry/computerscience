package org.computerscience.berrysa.calc.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author berrysa
 */
public class Main {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.println("Enter the size of the array: ");
            String inputSize = bufferedReader.readLine();
            int size = Integer.parseInt(inputSize);
            int[] testArray = buildTestArray(size);

            System.out.println("Pre-heapify array: ");
            printArray(testArray);

            System.out.println("Heapified array: ");
            buildHeap(testArray, size);
            printArray(testArray);
        } catch (IOException e) {
            System.out.println("IOException caught.");
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

    private static int[] buildTestArray(int size) {
        int[] testArray = new int[size];
        Random generator = new Random(76576L);

        for (int i = 0; i < size; i++) {
            testArray[i] = generator.nextInt();
        }

        return testArray;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}