package shelter;

import pl.edu.wszib.jwd.Shape;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {

        Animal[] animals = new Animal[100];

        Random random= new Random();


        for (int i = 0; i < animals.length; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Bird();
                    break;
            }
        }

        for (Animal animal: animals) {
            System.out.println(animal.getType());
        }


        System.out.println(animals[33].getInstanceNumber());
        System.out.println(animals[33].getType());
    }
}
