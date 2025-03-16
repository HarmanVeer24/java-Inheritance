// Main class to demonstrate Animal Hierarchy
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating objects of different animal types
        Animal lion = new Lion("Simba", 5);
        Animal tiger = new Tiger("Sheru", 4);
        Animal elephant = new Elephant("Dumbo", 8);

        // Calling makeSound method for each animal
        lion.makeSound();
        tiger.makeSound();
        elephant.makeSound();
    }
}

// Base class representing an Animal
class Animal {
    String name;
    int age;

    // Constructor to initialize animal's name and age
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass representing a Lion
class Lion extends Animal {
    Lion(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method for Lion
    @Override
    void makeSound() {
        System.out.println(name + " roars");
    }
}

// Subclass representing a Tiger
class Tiger extends Animal {
    Tiger(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method for Tiger
    @Override
    void makeSound() {
        System.out.println(name + " growls");
    }
}

// Subclass representing an Elephant
class Elephant extends Animal {
    Elephant(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method for Elephant
    @Override
    void makeSound() {
        System.out.println(name + " trumpets");
    }
}

//output
// Simba roars
//Sheru growls
//Dumbo trumpets