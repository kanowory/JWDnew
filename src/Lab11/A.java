package Lab11;

public class A {

    public A() {
        System.out.println("Działa konstruktor A()");
    }

    public A(boolean isSilent) {
        if (!isSilent) {
            System.out.println("Działa konstruktor A(" + isSilent + ")");
        }
    }








}
