import java.util.ArrayList;
import java.util.Scanner;

public class mergeSort {

    public static void merge(ArrayList<Integer> arr,int low, int mid,int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
       
        while (left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr.get(left));
            left++;
        }
        while (right <= high) {
            temp.add(arr.get(right));
            right++;
        }
        
        for (int i = 0; i < temp.size(); i++) {
            arr.set(low+i,  temp.get(i));
        }
    }
    public static void mergesort(ArrayList<Integer> arr,int start,int end) {
        if (start>=end) {
            return;
        }
        int mid=(start+end)/2;
        mergesort(arr, start,mid);
        mergesort(arr, mid+1, end);
        merge(arr,start,mid,end);
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
        mergesort(arr,0,n-1);
        System.out.println(arr);
        sc.close();
    }
}
