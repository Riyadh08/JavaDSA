public class Array{

    public static int GCD(int a, int b){
        if(b==0) return a;

        return GCD(b,a%b);
    }

    public static void main(String args[]){
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);

        System.out.println(
            GCD(10,20)
        );

    }
}