import java.util.*;

public class Selection_Sort {
     public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++){

            int min_idx = i;

            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    min_idx = j;
                }

            }
            //swap only one time
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }

        for(int x : arr) System.out.println(x);
        
    }
}