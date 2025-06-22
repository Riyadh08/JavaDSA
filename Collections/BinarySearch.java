
import java.util.Scanner;


public class BinarySearch{

    public static int bnSearch(int si,int ei,int arr[],int tar){

        int mid = si + (ei - si)/2;

        if(arr[mid] == tar){
            return mid;
        }
        
        else if(arr[mid] > tar){
            ei = mid - 1;
            return bnSearch(si, ei, arr, tar);
        }
        
        else{
            si = mid + 1;
            return bnSearch(si, ei, arr, tar);
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int si = 0, ei = arr.length-1;
        System.out.println(bnSearch(si,ei,arr, tar));
        
    }
}