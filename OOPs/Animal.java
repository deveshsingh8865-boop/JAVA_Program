package OOPs;


abstract class Animal{
    abstract void walk();
    public void eats() {
        System.out.println("Animals eat");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("Created a Horse!");
    }
    public void walk(){
        System.out.println("Walks on 4 leg!");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs!");
    }
}

class execute{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eats();

    }
}