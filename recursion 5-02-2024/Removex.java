import java.util.Scanner;

public class Removex {
    public static String removex(String res,String str,int i) {
        if(i==str.length()){
            return res;
        }
        if(str.charAt(i)!='x'){
            res+=str.charAt(i);
        }
        return removex(res, str, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String res="";
        res+=removex(res,str,0);
        System.out.println(res);
        sc.close();
    }
}
