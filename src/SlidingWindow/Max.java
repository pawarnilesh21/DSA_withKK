package SlidingWindow;

public class Max {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int widthOfSliding = 3;
        System.out.println("Highest Addition of 3 :" + (slideTheWindow(arr, widthOfSliding)));
    }

    static int slideTheWindow(int[] arr, int w) {

    return 1;
    }
}

 /*
        int max=0;
        for(int i=0;i< w;i++){
            if(arr[i] >max){
                max=arr[i];
            }
        }

        for(int i=1;i<=arr.length -w;i++){
            max=arr[i];
            if(arr[i+w-1] > max){
                max=arr[i+w-1];
            }

   */







