package linearSearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigit {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(8765));
    }

     static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits=digits(num);
        return numberOfDigits%2==0;
    }

    static int digits2(int num){
        return (int)(Math.log10(num))+1;
    }
     static int digits(int num) {
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
