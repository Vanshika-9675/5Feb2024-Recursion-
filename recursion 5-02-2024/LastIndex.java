import java.util.ArrayList;
import java.util.Scanner;

public class LastIndex {
    public static int LastOccurence(ArrayList<Integer> arr,int i,int x,int ind){
        if(i==arr.size()){
            return ind;
        }
        if (arr.get(i)==x) {
           ind = i;
        }
       return LastOccurence(arr, i+1, x,ind);       
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr:");
        int n = sc.nextInt();
       ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the element whose last position needs to be find:");
        int x = sc.nextInt();
        int ind = -1;
        ind = LastOccurence(arr,0,x,ind);
        System.out.println(ind);
        sc.close();
    }
}
