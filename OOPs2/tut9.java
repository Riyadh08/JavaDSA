
import java.util.ArrayList;


public class tut9{
    public static void main(String[] args) {
        

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        for(Object it : cars){
            System.out.println(it);
        }
    }
}