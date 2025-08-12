
public class tut4{
    static void mystatic(){
        System.out.println("Hi this is a static method");
    }

    public void mypublic(){
        System.out.println("Hi this is a public method");
    }
    public static void main(String[] args) {
       tut4.mystatic();
       tut4 tt = new tut4();
       tt.mypublic();
        
    }
}