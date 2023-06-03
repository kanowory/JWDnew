package zjazd10.inner.ianonymous;


public class AnonymousDemo2 {
    public interface GreetingModule{
        void sayHello();
    }

    public class GreetingModelImpl implements GreetingModule{
        @Override
        public void sayHello() {
            System.out.println("Good morning");
        }
    }

    public void someMethod(){
      GreetingModule greetingModule = new GreetingModelImpl();
        greetingModule.sayHello();
    }

    public static void main(String[] args) {
        AnonymousDemo anonymousDemo = new AnonymousDemo();
        anonymousDemo.someMethod();
    }
}
