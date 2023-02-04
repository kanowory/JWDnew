package zjazd5.interfaces;

public class Animal {
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName(){
        return "zwierzę " + name;
    }

    String makeSound() {
        return "???";
    }

    void introduce(){
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}
