package zjazd10.inner.istandard;

public class StandardInnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner1 = outer.new Inner();
        Outer.Inner inner2 = outer.instatiate();
    }
}
