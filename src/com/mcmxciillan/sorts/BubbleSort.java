package com.mcmxciillan.sorts;

public class BubbleSort {

    public int [] sortAscend(int [] numbers) {

        // As many times as 1 less than the length of the array
        for (int i = 0; i < numbers.length-1; i++) {
            // As many times as 1 less than the length of the array minus the current index
            for (int k = 0; k < numbers.length-i-1; k++) {
                // If the number at the current index is less than the number after it
                if (numbers[k] > numbers[k+1]) {
                    // Swap the position of the two numbers
                    numbers = swap(numbers, k, k+1);
                }
            }
        }

        return numbers;
    }

    public int [] sortDescend(int [] numbers) {

        for (int i = 0; i < numbers.length-1; i++) {
            for (int k = 0; k < numbers.length-i-1; k++) {
                if (numbers[k] < numbers[k+1]) {
                    numbers = swap(numbers, k+1, k);
                }
            }
        }

        return numbers;
    }

    public int [] swap(int [] array, int i, int k) {
        int bucket = array[i];
        array[i] = array[k];
        array[k] = bucket;
        return array;
    }
}
