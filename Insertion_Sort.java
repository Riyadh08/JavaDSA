import java.util.*;

public class Insertion_Sort{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //Insertion sort
        for(int i = 1;i<n;i++){

            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
        //Placement
        arr[j+1] = current;

        }

        for(int x : arr) System.out.println(x);
        
    }

}