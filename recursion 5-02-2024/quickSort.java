import java.util.*;
import java.util.Scanner;
public class quickSort {
    public static int partition(ArrayList<Integer> arr,int low,int high){
        int pivot  = arr.get(low);
        int i= low;
        int j= high;
        while (i<j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }
    
            while(arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) Collections.swap(arr,i,j);
        }
        Collections.swap(arr,low,j);
        return j;
    }
    public static void QuickS(ArrayList<Integer> arr,int low,int high){
        if(low>=high){
           return;
        }
        int p = partition(arr,low,high);
        QuickS(arr, low, p-1);
        QuickS(arr, p+1, high);
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
        QuickS(arr,0,n-1);
        System.out.println(arr);
        sc.close();
    }
}
