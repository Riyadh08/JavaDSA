
import java.util.ArrayList;
import java.util.Collection;


public class Demo1{
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        for(Object n : nums) System.out.println(n);

        nums.forEach(n->System.out.println(n));
        
    }

    
}