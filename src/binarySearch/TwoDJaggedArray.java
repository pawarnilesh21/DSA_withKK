package binarySearch;

public class TwoDJaggedArray {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int target=7;

        //For Jagged array
        int start = 0;
        int end = arr.length - 1;
        while(start <=end){
            int mid = start + (end - start) / 2;

            if(target >= arr[mid][0] && target <= arr[mid][arr[mid].length - 1]){
                start=mid+1;
            }else if(target < arr[mid][0]){
                    end=mid-1;
            }else{
                int index=binarySearch(arr[mid],target);
                if(index !=-1){
                    System.out.println("element at "+index+" :"+mid);
                }else{
                    System.out.println("elemt is not found");
                }return;
            }
        }

    }

    static int binarySearch(int[] ar,int target) {
        int start = 0;
        int end = ar.length - 1;

        while (start <= end) {
            //   int mid=(start+end)/2; this may be exceed the int range
            int mid = start + (end - start) / 2;

            if (target < ar[mid]) {
                end = mid - 1;
            } else if (target > ar[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
        }return -1;
    }

}
