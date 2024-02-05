import java.util.ArrayList;
import java.util.Scanner;

public class SumOfElememts {
    public static int Reverse(ArrayList<Integer> arr,int i,int n,int sum){
    if (i==n) {
        return sum;
    }
    return Reverse(arr,i+1,n,sum+arr.get(i));
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr:");
        int n = sc.nextInt();
       ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        
        int sum = Reverse(arr,0,n,0);
        System.out.println(sum);
        sc.close();
    }
}
