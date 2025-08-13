package SlidingWindow;
public class MaximumAddition {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int widthOfSliding=3;
        System.out.println("Highest Addition of 3 :"+(slideTheWindow(arr,widthOfSliding)));
    }
    static int slideTheWindow(int [] arr,int w){
        int current=0;
        for(int i=0;i< w;i++){
            current +=arr[i];
        }
        int maxAddition=current;
        for(int i=1;i<=arr.length -w;i++){
            current=current-arr[i-1]+arr[i+w-1];

            if(current >maxAddition){
                maxAddition=current;
            }
        }
        return maxAddition;
    }
}



