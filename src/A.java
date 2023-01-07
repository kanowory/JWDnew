public class A {
    public A() {
        //super() - wywołanie konstruktora klasy Object
        System.out.println("Działa konstruktor A()");
    }
    public A(String param) {
        System.out.println("Działa konstruktor A(" + param + ")");
    }


}

class B extends A {

    public B() {
        //super(); - wywołanie konstruktora klasy nadzrędnej, musi zanjdować się na początku ciała konstruktora, działa niejawnie
        System.out.println("Działa konstruktor B()");
    }

    public B(String param) {
        super("test");//wywołanie konstruktora klasy nadrzednej z parametrem bo inaczej automatycznie wywoła się bez parametru
        System.out.println("Działa konstruktor B(" + param + ")");
    }
}

class Test {
    public static void main(String[] args) {
        B b = new B("test");

    }
}
