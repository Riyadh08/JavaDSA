
@FunctionalInterface
//It contain only one method
interface A{
    void show();
}

// class B extends Object implements A{

//     @Override
//     public void show(){
//         System.out.println("HI");
//     }
// }

public class Ryad{

    public static void main(String[] args) {

        A obj = ()-> System.out.println("hi in show");   
        obj.show();
    
    }
}