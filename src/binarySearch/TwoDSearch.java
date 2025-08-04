package binarySearch;



public class TwoDSearch {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4,},
                {5,6,7,8},
                {9,10,11,12}
        };
        int target=20;
        System.out.println(TwoDSearch(arr,target));

    }
    static boolean TwoDSearch(int[][]arr, int target){
        int row=arr.length;
        int col=arr[0].length;
        int low=0;int high=row*col-1;

        while(low <=high){
            int mid=(low+high)/2;
            int r=mid/col;
            int c=mid%col;

            if(arr[r][c]==target){
                return true;
            }else if(arr[r][c] >target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }


}
