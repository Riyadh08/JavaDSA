import java.util.ArrayList;
import java.util.*;

public class ArrayListExample {

    public static void main(String args[]){

        List<String>list = new ArrayList<>();
        list.add("apple");
        list.add("Banana");

        for(String item : list){
            System.out.println(item);
        }
        
        }
}