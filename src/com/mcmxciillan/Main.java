package com.mcmxciillan;

import com.mcmxciillan.sorts.BubbleSort;
import com.mcmxciillan.sorts.SelectionSort;

public class Main {

    public static void main(String[] args) {

        int [] array = {2, 5, 1, 8, 9, 4, 6, 7, 3, 0};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortAscending(array);

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortAscending(array);
    }
}
