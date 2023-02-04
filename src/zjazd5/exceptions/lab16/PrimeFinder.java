package zjazd5.exceptions.lab16;

public class PrimeFinder implements Runnable {
        //Zmodyfikuj klasę PrimeFinder w taki sposób, aby zgłaszała nowy wyjątek NegativeNumberException, jeśli do konstruktora zostanie przekazana wartość ujemna.
        public long target;
        public long prime;
        public boolean finished = false;
        private Thread runner;

        PrimeFinder(long inTarget) {
            if (inTarget < 0){
                throw new NegativeNumberException("Podano liczbę ujemną!");
            }

            target = inTarget;
            if (runner == null) {
                runner = new Thread(this);
                runner.start();

            }
        }

        public void run() {
            long numPrimes = 0;
            long candidate = 2;
            while (numPrimes < target) {
                if (isPrime(candidate)) {
                    numPrimes++;
                    prime = candidate;
                }
                candidate++;
            }
            finished = true;
        }

        boolean isPrime(long checkNumber) {
            double root = Math.sqrt(checkNumber);
            for (int i = 2; i <= root; i++) {
                if (checkNumber % i == 0)
                    return false;
            }
            return true;
        }
    }

