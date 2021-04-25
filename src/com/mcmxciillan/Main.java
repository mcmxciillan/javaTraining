package com.mcmxciillan;

import com.mcmxciillan.sorts.BubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] array = {2, 5, 1, 8, 9, 4, 6, 7, 3, 0};

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Original Array: " + Arrays.toString(array));

        System.out.println("Ascended Bubble Sorted Array: " + Arrays.toString(bubbleSort.sortAscend(array)));
        System.out.println("Descended Bubble Sorted Array: " + Arrays.toString(bubbleSort.sortDescend(array)));
    }
}
