package linearSearch;

public class searchInRange {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,9,7,10};
        int target=1;
        int start=3;
        int end=7;
        System.out.println("Number is found at :"+linearSearch(ar,target,start,end));

    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target) {
                return i;
            }

        } return -1;
    }

}
