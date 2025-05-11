import java.util.HashSet;
import java.util.*;

public class HashSetExample {
    public static void main(String args[]){

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");

        System.out.println(set);
    }
}