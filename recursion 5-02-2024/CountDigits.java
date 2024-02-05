import java.util.Scanner;
public class CountDigits {
    public static int Count(int n, int digits){
        if(n<=0){
            return digits;
        }
        // System.out.println(n);
       return Count(n/10,digits+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
       int digits=Count(n,0);
       System.out.println(digits);
       sc.close();
    }
}
