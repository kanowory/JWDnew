package pl.edu.wszib.jwd.Lab11;

public class A {

    public A() {
        System.out.println("Działa konstruktor pl.edu.wszib.jwd.A()");
    }

    public A(boolean isSilent) {
        if (!isSilent) {
            System.out.println("Działa konstruktor pl.edu.wszib.jwd.A(" + isSilent + ")");
        }
    }








}
