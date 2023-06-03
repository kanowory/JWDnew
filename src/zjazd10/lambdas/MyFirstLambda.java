package zjazd10.lambdas;

public class MyFirstLambda {
    public static void main(String[] args) {
        Multiplier multiplier = x -> x * x;
        System.out.println(multiplier.perform(3));
    }
}

@FunctionalInterface
interface Multiplier {
    int perform(int x);
}
