package pl.edu.wszib.jwd.constructors;

public class B extends A{
    public B() {
        System.out.println("Działa konstruktor B()");
    }

    public B(boolean isSilent) {
        super(true);
        if (!isSilent) {
            System.out.println("Działa konstruktor B(" + isSilent + ")");
        }
    }


}
