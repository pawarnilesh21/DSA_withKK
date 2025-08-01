package Sorting.insertionSort.cyclicSort;

import java.util.Arrays;
//KK Aproach
//Cyclic Sort

public class cyclicsort2 {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] cyclicSort(int[] arr){
        int i=0;
        int temp;
        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] !=arr[correct]){
                temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        return  arr;




    }
}
