package zjazd10.inner.lab20;

public class Outer {
    public int number = 1;

    public class Inner{
        public int number = 2;

        public class InnerInner {
            public int number = 3;
        }
    }

    public static void main(String[] args) {

        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        Inner.InnerInner innerInner = inner.new InnerInner();

        System.out.println(outer.getClass() + ": "+ outer.number);
        System.out.println(inner.getClass() + ": "+ inner.number);
        System.out.println(innerInner.getClass() + ": "+ innerInner.number);
    }
}
