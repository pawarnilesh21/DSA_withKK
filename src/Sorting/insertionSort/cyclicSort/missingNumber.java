package Sorting.insertionSort.cyclicSort;

//amazone Question EASY Level
//https://leetcode.com/problems/missing-number/submissions/1715821236

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr={4,0,2,1};

        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr){
        int i=0;
        int temp;
        while(i <arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i] !=arr[correct]){
                temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        for(int k=0;k<arr.length;k++){
            if(k != arr[k]){

                return k;   //case 1
            }
        }
       // case2
      return arr.length;
    }
}
