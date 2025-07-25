package linearSearch;

import java.util.Arrays;

public class searchIn2DArray {

    public static void main(String[] args) {
        int[][] arr={
                {1,2,4},
                {3,5,6},
                {7,8,9}
        };
        int target=9;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] ar,int target){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                if(ar[i][j]==target){
                    return new int[]{i,j};
                }
            }
        } return new int[]{-1,-1};
    }
}
