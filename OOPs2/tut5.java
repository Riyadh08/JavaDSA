
class Vehicle{
    protected String brand = "ford";

    public void honk(){
        System.out.println("tut, tutt!");
    }

}

class Car extends Vehicle{
    private String modelName = "Mustang";

    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.honk();

        System.out.println(myCar.modelName + " " + myCar.brand);
    }

}