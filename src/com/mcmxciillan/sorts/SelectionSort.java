package com.mcmxciillan.sorts;

import java.util.Arrays;

public class SelectionSort {

    public void sortAscending(int [] numbers) {
        System.out.println("Original array: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            int smallest = i;
            for (int k = i+1; k < numbers.length; k++) {
                if (numbers[k] < numbers[i]) {
                    smallest = k;
                }
            }
            int bucket = numbers[i];
            numbers[i] = numbers[smallest];
            numbers[smallest] = bucket;
        }
        System.out.println("Selection sorted ascending array: " + Arrays.toString(numbers));
    }
}

// [ 100, 90, 91, 70 ]
// smallest = 100
// array[3] = 70
// smallest = 3
// bucket = 100
// array[i] = array[smallest]
// array[smallest] = bucket