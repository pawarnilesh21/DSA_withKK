package binarySearch;

public class search {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=1;
        System.out.println(binarySearch(arr,target));
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
