

public class Demo2{

    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];

        try {
            j = 18/i;
            System.out.println(nums[2]);
            System.out.println(nums[5]);
            
        } catch (Exception e) {
           
            System.out.println("Something Went Wrong. "+e);
        }
        System.out.println(j);
    }
}