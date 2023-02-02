package pl.edu.wszib.jwd;

public class VisitCounterTester {
    public static void main(String[] args) {
        VisitCounter visitCounter = new VisitCounter();
        visitCounter.increment();
        visitCounter.increment();
        visitCounter.increment();
        //visitCounter.counter++;//nie można bo private
        System.out.println(visitCounter.getCounter());
    }
}
