public class Human {
    void eat(){
        System.out.println("eat1");
    }
}
class Boy extends Human{
    @Override
    void eat() {
        super.eat();
        System.out.println("eat2");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();
    }
}
