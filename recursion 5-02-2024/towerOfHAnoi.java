import java.util.Scanner;

public class towerOfHAnoi {
    public static void TOH(int n,char source , char destination , char aux){
        if(n==0){
            return;
        }
        TOH(n-1,source,aux,destination);
        System.out.println(source+" "+destination);
        TOH(n-1,aux,destination,source);
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the no.of disks:");
          int n = sc.nextInt();
          TOH(n,'a','c','b');
          sc.close();
    }
}
