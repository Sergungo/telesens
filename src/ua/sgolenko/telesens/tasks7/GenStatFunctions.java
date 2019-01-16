package ua.sgolenko.telesens.tasks7;

import java.util.Arrays;
import java.util.Collections;

public class GenStatFunctions {

    private Object[] arr = {};

    public static <E> E[] exchangeValues(E[] arr, int a, int b) {
        E temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return arr;
    }

    public static <E> E[] backSort(E[] arr) {

        Arrays.sort(arr, Collections.reverseOrder());

        return arr;
    }

    public static <E> void countMatching(E el, E[] arr) {
        int count = 0;
        for (E e : arr) {
            if (e.equals(el))
                count++;
        }

        System.out.println(count);
    }

    public static <E> void printAll(E[] arr) {
        for (E e : arr) {
            System.out.print(e + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] nums = {2, 4, 55, 12, 4};
        printAll(exchangeValues(nums, 0, 2));
        printAll(backSort(nums));
        countMatching(4, nums);

        String[] str = {"mam", "dad", "mam", "son", "gran", "mam"};
        printAll(exchangeValues(str, 3, 1));
        printAll(backSort(str));
        countMatching("mam", str);

    }

}
