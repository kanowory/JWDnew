package Lab11;

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
