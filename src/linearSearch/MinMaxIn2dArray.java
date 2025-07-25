package linearSearch;

public class MinMaxIn2dArray {
    public static void main(String[] args) {
        int[][] ar={
                {1,2,3,5},
                {90,9,8},
                {6,10,11},
                {0,34}
        };
        System.out.println("MinimumIn2DArray :"+search(ar));
    }
    static int search(int[][] arr){
       int min=arr[0][0];
        for(int[] row:arr){
            for(int c:row){
                if(c<min){
                    min=c;
                }
            }

        }
        return min;
    }
}
