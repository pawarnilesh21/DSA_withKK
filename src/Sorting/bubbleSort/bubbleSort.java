package Sorting.bubbleSort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
            //run the step n-1;
        boolean swapped=false;
        for(int i=0;i<arr.length;i++){

            //For Each Step,Max item at pushed at The Last
            for(int j=1;j <arr.length-i;j++){
                //Swap if the item is smaller than previos Item
                if(arr[j-1]> arr[j]){
                    int temp=arr[j-1];
                     arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
                //if you did not  swap for a particular  value of i  it means The array is sorted manner
                //so dont go for Next passes

            }
            if(!swapped){
                break;
            }
        }
    }
}
