import java.util.Scanner;

/**
 * ConsecutiveDupli
 */
public class consecutiveDupli {

    public static String removeDupli(String res, int i , String str){
         if (i==str.length()-1) {
            return res;
         }
         if(i+1<str.length() && str.charAt(i)!=str.charAt(i+1)){
             res+=str.charAt(i);
         }
        return removeDupli(res, i+1, str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        str+='$';
        String res ="";
        res+=removeDupli(res,0,str); 
        System.out.println(res);
        sc.close();
    }
}