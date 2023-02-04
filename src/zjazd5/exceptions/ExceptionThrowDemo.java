package zjazd5.exceptions;

public class ExceptionThrowDemo {
    public static void main(String[] args) {

        ExceptionThrowDemo efd = new ExceptionThrowDemo();
        int numberOfSeconds = 0;
        int hours = -34;
        try {
            numberOfSeconds = efd.getNumberOfSeconds(hours);
        } catch (IllegalArgumentException e) {
            System.out.println("Naprawiamy: ");
            numberOfSeconds = efd.getNumberOfSeconds(hours* -1);
        }
        System.out.println(numberOfSeconds);

    }

    public int getNumberOfSeconds(int hours){
        if (hours < 0) {
            throw new IllegalArgumentException("Liczba godzin musi byc liczbą większa od zera!" + hours);
        }
        return hours*60*60;
    }
}
