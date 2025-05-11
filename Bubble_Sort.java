import java.util.*;

public class Bubble_Sort{

    public static void main(String args[]){
        // ArrayList<Integer>arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    //    int arr[] = new int[]{3,4,6,4,2,1};
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]) {
                    arr[j] = arr[j]+arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] = arr[j]-arr[j+1];
                }
            }
        }

        for(int x : arr) System.out.println(x);
    }
    
}