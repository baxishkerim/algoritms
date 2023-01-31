package main.java.org;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {346, 34686, 17452, 12, 1, 90, 200, 250, 1200, 1000};
//       bubbleSort(array);
//        findMinIndexOfMassive(array);
 //       sortBubble(array);


        for (int step = 0; step < array.length; step++){
            System.out.println(Arrays.toString(array));

            int index  =  selectionSort(array,step);

            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;

        }
    }


    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[i] = array[j + 1];
                    array[j + 1] = t;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void findMinIndexOfMassive(int[] array) {
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println(minValue + " min value");
        System.out.println(minIndex + " min index");
    }


    public static void sortBubble(int[] array) {

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    private static int selectionSort(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
return minIndex;
    }
}
