
class Human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

  

}

public class Demo{
    public static void main(String args[]){
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Ryad");
        // obj.age = 11;
        // obj.name = "Navin";

        System.out.println(obj.getName() + " " + obj.getAge());

    }
}


/*

Camel casing

class and interface -> Cals, Runable
variable and method -> marks, show()
constants - PIE, INF

showMyMarks()
MyData is a class
age,  DATA, Human()-> it is a constructor

*/
