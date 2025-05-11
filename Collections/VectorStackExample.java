
import java.util.*;

public class VectorStackExample {
    public static void main(String kuet[]){

        Vector<String> vv = new Vector<>();
        vv.add("java");
        vv.add("Python");

        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);

        System.out.println("Vector: " + vv);
        System.out.println("Stack Pop: " + stack.pop());
        System.out.println("Stack Pop: " + stack.pop());

    }
}