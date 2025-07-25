package binarySearch;
public class MountainArray {
    public static void main(String[] args) {
        int[] ar={1,4,6,7,5,3,2,1};
        System.out.println(peakIndexInMountainArray(ar));
    }
    static int peakIndexInMountainArray(int[] ar){
        int start=0;
        int end=ar.length-1;

        while(start <end){
            int mid=start+(end-start)/2;
            if(ar[mid] > ar[mid+1]){
                //you are in deC part of array
                //This may be the ans, but look at left
                //this is why end !=mid-1;
                end=mid;
            }else{
                //you are of an Ascending part of array
                start=mid+1; // because we know the mid+1 element is >mid element
            }
        }
        //in the end,start== end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above checks
        //hence, when they are pointing to
        return start;
    }
}

