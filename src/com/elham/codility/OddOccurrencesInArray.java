package com.elham.codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.IntStream;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int elem = 0;

        for (int i = 0; i < A.length; i++) {
            
        }
        return elem;
    }
    /*  public static int solution(int[] A) {
        // write your code in Java SE 8
        int elem = 0;

        for (int i = 0; i < A.length; i++) {
            elem ^= A[i];
            System.out.println("A[i] = "+A[i]);
            System.out.println("elem = "+elem);
        }
        return elem;
    }*/
   /* public static int solution(int[] A) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int oddElement = 0;

        if(A.length > 0 && A.length < 1_000_000){

            for(int ctr=0; ctr < A.length; ctr++){
                if(frequencyMap.containsKey(A[ctr])){
                    frequencyMap.put(A[ctr], frequencyMap.get(A[ctr]) + 1);
                    System.out.println("key = "+A[ctr]);
                    System.out.println("value = "+frequencyMap.get(A[ctr]) + 1);


                } else {
                    System.out.println("key else = "+A[ctr]);
                    frequencyMap.put(A[ctr], 1);
                }
            }

            for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
                System.out.println("map = "+entry.getKey() + "****" + entry.getValue());
                if(entry.getValue() % 2 != 0){
                    oddElement = entry.getKey();
                    break;
                }
            }
        }

        return oddElement;
    }*/
  /* */
//    public static void solution(int[] a){
//        int unpairedValue = 0;
//        Arrays.sort(a);
//
//        while (a.length > 0)
//        {
//            int i =0;
//            int searchResult = -1;
//
//            if(a.length == 1 || a[i] != a[i+1]){
//                unpairedValue = a[i];
//                break;
//            }
//            else{
//                searchResult =1;
//              a = removeElement(a,i,searchResult);
//
//                System.out.println(Arrays.toString(a));
//
//            }
//
//
//        }
//
//        System.out.println(unpairedValue);
//    }
//
//    private static int[] removeElement(int[] a , int i, int searchResult){
//        return Arrays.copyOf(IntStream.range(i+1, a.length)
//                .filter(ii -> ii != searchResult)
//                .map(ii -> a[ii])
//                .toArray(),a.length-(i+2));
//    }
}
