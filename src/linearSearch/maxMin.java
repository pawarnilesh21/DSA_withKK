package linearSearch;

public class maxMin {
    public static void main(String[] args) {
        int[] ar={8,10,3,7,4,5,6,2,9};
        System.out.println("Minimum :"+minimum(ar));
    }
    static int minimum(int[] ar){
        int min=ar[0];
        if(ar.length==0){
            return -1;
        }
        for(int element:ar){
            if(element<min){
                min=element;
            }

        }
        return min;
    }
}
