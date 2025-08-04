package binarySearch;

public class findKPostion {
    public static void main(String[] args) {
        int [] arr={1,4,7,9};
        int target=8;
        System.out.println(searchB(arr,target));


    }
    static int searchB(int []arr,int target){
        int low=0;
        int high=arr.length-1;

        while(low <=high){
            int mid=low+(high-low)/2;


            if(arr[mid] <target){
                low=mid+1;
            }else if(arr[mid] >target){
                high=mid-1;
            }else{
                return -1;
            }
        }
        return low;
    }

}
