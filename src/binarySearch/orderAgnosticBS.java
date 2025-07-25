package binarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 2;
        System.out.println(orderAgnosticBS(arr, target));

    }
        static int orderAgnosticBS(int[] arr,int target){
        int st=0;
        int end=arr.length-1;

        //find whether the array is sorted in ascending or descending
            boolean isAsc=arr[st]<arr[end];

        while(st <=end){
           int mid=st+(end-st)/2;

           if(arr[mid]==target){
               return mid;
           }

           if(isAsc){
               if(target <arr[mid]){
                   end=mid-1;
               }
               else {
                   st=mid+1;
               }
           }else{
               if(target >arr[mid]){
                   end=mid-1;
               }
               else {
                   st=mid+1;
               }
           }
        } return -1;
    }
}
