package zjazd5.exceptions;

public class AgeTester {
    public static void main(String[] args) {
        try {
            checkAge(12);
        } catch (AgeRangeException e) {
            System.out.println("Problem: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
     if (age < 18) {
         throw new AgeRangeException("Uwaga! Osoba niepełnoletnia!");
     } else {
         System.out.println("Dostęp przyznany");
     }
    }
}
