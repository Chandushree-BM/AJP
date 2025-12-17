import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice: 1-Animal 2-Dog 3-Cat");
        int choice = sc.nextInt();

        Animal a;

        if (choice == 1) {
            a = new Animal();
        } else if (choice == 2) {
            a = new Dog();
        } else {
            a = new Cat();
        }

        a.makeSound(); // runtime overriding
        sc.close();
    }
}
