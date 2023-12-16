package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 76, 32, 76,  85, 43, 18, 76};
        int target = 76;
        int index = 0;
        System.out.println(linSearch(arr, index, target));
        duplicate(arr, index, target);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static int linSearch(int[] arr, int index, int target) {

        if(index==arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        else {
            return linSearch(arr, index+1, target);
        }
    }

    static void duplicate(int[] arr, int index, int target) {

        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        duplicate(arr, index+1, target);
    }
}

