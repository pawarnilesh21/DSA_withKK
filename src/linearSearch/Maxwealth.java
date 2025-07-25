package linearSearch;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class Maxwealth {
    public static void main(String[] args) {
         int[][] ar={{1,2,3},{3,2,1,5},{0,0,9}};
        System.out.println("Max wealth:"+maximumWealth(ar));
    }
    static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] costomer:accounts){
            int sum=0;
            for(int ac:costomer){
                sum+=ac;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

}
