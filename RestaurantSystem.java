// Main class to test the Restaurant system
public class RestaurantSystem {
    public static void main(String[] args) {
        // Creating objects of Chef and Waiter
        Chef headChef = new Chef("Gordon", 101);
        Waiter server = new Waiter("James", 202);

        // Displaying their duties
        headChef.performDuties();
        server.performDuties();
    }
}

// Superclass Person
class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface Worker
interface Worker {
    void performDuties();
}

// Subclass Chef
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking food.");
    }
}

// Subclass Waiter
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving food.");
    }
}
//output
// Chef is cooking food.
//Waiter is serving food.