package com.elham.codility;

import java.util.Arrays;

public class CycleRotation {

    public static void cycleRotation(int[] a, int k) {
        int endIndex = a.length-1;
        if(endIndex >0 && k>0) {
            while (k > 0) {
                int temp = a[endIndex];
                for (int i = endIndex ; i > 0; i--)
                    a[i] = a[i-1];
                a[0] = temp;
                k--;
            }
        }
    }
}
