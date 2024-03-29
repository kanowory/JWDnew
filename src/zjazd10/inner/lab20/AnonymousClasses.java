package zjazd10.inner.lab20;

public class AnonymousClasses {
    public interface GreetingModule {
        void sayHello();
    }

    public static class Robot{
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething(){
            greetingModule.sayHello();
        }
    }

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Dzień dobry");
            }
        });

        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Good morning");
            }
        });

        Robot johan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Guten tag");
            }
        });

        jan.saySomething();
        john.saySomething();
        johan.saySomething();
    }
}
