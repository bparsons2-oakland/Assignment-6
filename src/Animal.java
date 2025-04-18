public class Animal {

    public int age;
    public String gender;

    public void isMammal() {
        System.out.println("Animal: This is the isMammal() method.");
    }

    public void mate() {
        System.out.println("Animal: This is the mate() method.");
    }

    // Main
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Zebra myZebra = new Zebra();

    //Animal
        myAnimal.isMammal();
        myAnimal.mate();

    //Zebra
        myZebra.isMammal();  
        myZebra.mate();     
        myZebra.run();       

    //fish.canEat() is private and can't run from Animal.java since it is stuck working inside of Fish.java only 
    }
}
