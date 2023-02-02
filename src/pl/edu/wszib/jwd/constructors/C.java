package pl.edu.wszib.jwd.constructors;

public class C extends B{
    public C() {
        System.out.println("Działa konstruktor C()");
    }

    public C(boolean isSilent) {
        super(true);
        if (!isSilent) {
            System.out.println("Działa konstruktor C(" + isSilent + ")");
        }
    }




}
