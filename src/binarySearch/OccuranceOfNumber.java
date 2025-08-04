package binarySearch;

public class OccuranceOfNumber {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,4,5};
      int target =0;
        System.out.println(countFreq(arr,target));
    }
      static int countFreq(int[] arr, int target) {
            int lower = lowerBound(arr, target);
            int upper = upperBound(arr, target);
            return upper - lower;


        }
       static int lowerBound(int[] arr, int target) {
            int low = 0, high = arr.length;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] < target)
                    low = mid + 1;
                else
                    high = mid;
            }
            return low;
        }
      static   int upperBound(int[] arr, int target) {
            int low = 0, high = arr.length;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] <= target)
                    low = mid + 1;
                else
                    high = mid;
            }
            return low;
        }



}


