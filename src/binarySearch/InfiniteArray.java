package binarySearch;
//infinite Array Size is There..!!

public class InfiniteArray {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,9};
        int target=2;
        System.out.println(ans(ar,target));
    }
    static int ans(int[]ar,int target){
        int start=0;
        int end=1;

        while((target >ar[end])){
            int temp=end+1;

            end=end+(end-start+1)*2;
             start=temp;
        }
        return binarySearch(ar,target,start,end);
    }
    static int binarySearch(int[] ar,int target,int start,int end){

        while(start <=end){
            int mid=start+(end-start)/2;
            if(target <ar[mid]){
                end=mid-1;
            }else if(target >ar[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        } return -1;

    }
}
