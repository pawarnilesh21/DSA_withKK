    package Sorting.selectionSort;
    //My Aproach
    import java.util.Arrays;

    public class selectionSort {
        public static void main(String[] args) {
            int[] arr={6,5,4,1,3};
            System.out.println(Arrays.toString(arr));

            selectionSort(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void selectionSort(int[] arr){
            int min=0;

            for(int i=0;i<arr.length;i++){
                min=i;
                boolean isSort=true;
                for(int j=i+1;j<arr.length;j++){

                    if(arr[min] >arr[j]){
                        min=j;
                        isSort=false;
                    }
                }
                if(!isSort) {
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }


