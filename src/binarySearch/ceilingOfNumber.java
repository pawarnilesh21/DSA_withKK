package binarySearch;

public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(cealingNumber(arr,target));
    }
    static int cealingNumber(int[] ar,int target){
        //cealing means : A smallest number which is  greater that  or equal to target element
        int start=0;
        int end=ar.length-1;

        if(target <ar[0]){
            return -1;
        }
        while(start <=end) {
            int mid = start + (end - start) / 2;

            if (target < ar[mid]) {
                end = mid - 1;

            } else if (target > ar[mid]) {
                    start=mid+1;
            }else{
                return ar[mid];
            }

        } return ar[start];
    }

}
