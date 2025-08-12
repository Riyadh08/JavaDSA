
class Animal {

    public void animalSound(){
        System.out.println("Animal makes sound");
    }

}

class Pig extends Animal{

    @Override
    public void animalSound(){
        System.out.println("Pig says : wee wee");
    }

}

class Dog extends Animal{

    @Override
    public void animalSound(){
        System.out.println("Dog say : vok vok");
    }

}

class Main{
    public static void main(String[] args) {

        Animal ann = new Animal();
        Animal ann1 = new Pig();
        Animal ann2 = new Dog();

        ann.animalSound();
        ann1.animalSound();
        ann2.animalSound();
        
    }
}