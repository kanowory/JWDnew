package zjazd5.exceptions.lab16;

public class PrimeFinderTester {
    public static void main(String[] args) {
        try {
            PrimeFinder pf = new PrimeFinder(3);
            pf.run();
            System.out.println(pf.prime);
        } catch (NegativeNumberException e) {
            System.out.println("Podano ujemną liczbę: " + e.getMessage());
        }

    }
}
