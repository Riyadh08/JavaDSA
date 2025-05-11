
class Student {
    String name;
    static String school;
}


public class Ryad_Static {

    public static void main(String ryad[]){
        Student.school = "ABC";
        Student st1 = new Student();
        st1.name = "tony";
        System.out.println(st1.school);


    }
    
}