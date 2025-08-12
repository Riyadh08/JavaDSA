

public class tut1{
    int x=5;
    public static void main(String[] args) {
        
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 7;
        arr[3] = 5;
        String ss = arr.toString();
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
        for (int it : arr) System.out.println(it);
        
        
        
    }
}