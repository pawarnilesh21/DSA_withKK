package binarySearch;
//744 Find Smallest Letter Greater Than Target
public class GreaterThanTarget {
    public static void main(String[] args) {

        char[] ch={'c','f','j'};
        char target='i';
        System.out.println(nextGreatestLetter(ch,target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        while(start <=end){
            int mid=start+(end-start)/2;


            if(target <letters[mid]){
                end=mid-1;
            }else if(target >letters[mid]){
                start=mid+1;
            }else{
                return letters[0];
            }
        } return letters[start];
    }

}
