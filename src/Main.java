public class Main {
    public static void main(String[] args) {
        String str="Akash K Patil";

        seperateCharBySpace(str);
    }
    static void  seperateCharBySpace(String str ){
        System.out.println("full String : "+str);
        char [] str1=str.toCharArray();
        String a = "", b = "", c = "";
        int spaceCount =0;
        for(char ch:str1){
            if(ch== ' '){
                spaceCount++;
            }else{
                if(spaceCount==0){
                    a=a+ch;
                } else if (spaceCount==1) {
                    b=b+ch;
                }else{
                    c=c+ch;
                }
            }
        }
        System.out.println("A: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }
}
