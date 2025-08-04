package binarySearch;

public class search2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int target=4;
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
                return mid;
            }
        }
        return -1;
    }
}
