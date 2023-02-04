package zjazd5.exceptions.lab16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        //Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
        // Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt().
        // Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
        // Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.

    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę: ");
    try {
    double number = Double.parseDouble(scanner.nextLine());
        if (number < 0) {
            throw new IllegalArgumentException("Podaj liczbę większa od zera!");
        } else {
            System.out.println("Pierwiastek: " + Math.sqrt(number));
        }
    } catch (NumberFormatException e) {
        System.out.println("Niepoprawny ciag znaków! Podana wartość nie jest liczbą. Błąd: " + e.getMessage());
       // System.exit(-1);
    } finally {
        System.out.println("Koniec");
    }




    }

}
