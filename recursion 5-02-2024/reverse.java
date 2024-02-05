import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * reverse
 */
public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of stack:");
                int n = sc.nextInt();
               Stack<Integer> st = new Stack();
                System.out.println("Enter the elements");
                for(int i=0;i<n;i++){
                    st.push(sc.nextInt());
                }
                for(int i=0;i<n;i++){
                    System.out.print(st.pop()+" ");
                }
    }
}

// class reverse{
// public static void Reverse(ArrayList<Integer> arr,int i,int n){
//     if (i>=arr.size()/2) {
//         return;
//     }
//     if(i<n/2){
//         Collections.swap(arr,i,n-i-1);
//     }
//     Reverse(arr,i+1,n);
// }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of stack:");
//         int n = sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//         System.out.println("Enter the elements");
//         for(int i=0;i<n;i++){
//             arr.add(sc.nextInt());
//         }
//         Reverse(arr,0,n);
//         System.out.println(arr);
//         sc.close();
//     }
// }
