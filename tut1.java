interface ryad{
    final int a = 10;

    void display();
}


class Test implements ryad{
    public void display(){
        System.out.println("ryad");
    }
}


public class tut1{
    public static void main(String args[]){

        Test tt = new Test();
        tt.display();
     
    }
}