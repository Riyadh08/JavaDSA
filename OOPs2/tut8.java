
interface Animal{

    public void anaSound();
    public void anaSleep();

}

class Dog implements Animal{

    public void anaSound(){
        System.out.println("It says : vok vok");
    }

    public void anaSleep(){
        System.out.println("It sys : oww oww!");
    }
}

class Main{
    public static void main(String[] args) {
        Animal ana = new Dog();
        ana.anaSleep();
        ana.anaSound();
    }
}