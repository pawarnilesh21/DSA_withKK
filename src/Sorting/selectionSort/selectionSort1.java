package Sorting.selectionSort;

import java.util.Arrays;

// KK's Aproach
public class selectionSort1 {
    public static void main(String[] args) {
        int[] arr={-5,2,45,68};
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
            for(int i=0;i<arr.length;i++){
                //Find the max item in the remaining array ans swap with correct index
                int last= arr.length-i-1;
                int maxIndex=getMaxIndex(arr,0,last);
                swap(arr,maxIndex,last);
            }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[max] <arr[i]){
                max=i;
            }
        }return max;
    }
}
