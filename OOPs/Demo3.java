class Ryad{
    public int x;
    public int y;

    public Ryad(){
        System.out.println("Ryad constructor is called");
    }
    public void oncrate(String rr){
        System.out.println("oncreate metod is called" + rr);
    }
    public static void hi(){
        System.out.println("hi ryad");
    }
    public void print(){
        System.out.println(x + " "+y);
    }
}



public class Demo3 extends Ryad{

    public Demo3(int x, int y){
        super.oncrate("ryad");
        super.x = x;
        super.y = y;
    }


    public static void main(String[] args) {

        Demo3 dd = new Demo3(2,3);
        dd.print();

        Ryad.hi();
        
        
    }
}