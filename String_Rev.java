import java.util.*;

public class String_Rev{

    public static void Rev(String ss, int i){

        if(i==0){
            System.out.print(ss.charAt(i));
            return;
        }
        
        System.out.print(ss.charAt(i));
        Rev(ss,i-1);
    }

    public static void main(String args[]){

        Rev("abcd",3);

    }
}