package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateArray {
    public static void run() {
        int n = 5;
        int d = 2;
        Integer[] arr = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(rotateArr(arr, d, n));
        System.out.println(list);
    }

    //Function to rotate an array by d elements in counter-clockwise direction.
    static Integer[] rotateArr(Integer arr[], int d, int n) {
        // add your code here
        int i=0;
        while(i<(n-d)){
            int j=0;
            while(j<d && (i+d)<n){
                int temp = arr[i];
                arr[i]=arr[i+d];
                arr[i+d]=temp;
                j++;
                i++;
            }
        }
        return arr;
    }
}
