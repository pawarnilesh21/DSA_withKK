package linearSearch;
public class linearSearch13 {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        int target=9;
        System.out.println("Number is found at :"+linearSearch(ar,target));
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element==target) {
                return element;
            }

       } return -1;
    }
}
