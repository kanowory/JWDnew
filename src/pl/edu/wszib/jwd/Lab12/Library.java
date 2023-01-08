package pl.edu.wszib.jwd.Lab12;

public class Library {
    public static void main(String[] args) {

        Book[] books = { new Book("Pan Samochodzik", "Zbigniew Nienacki", "Siedmioróg", 2018),
                new Book("Pan Samochodzik", "Zbigniew Nienacki", "Siedmioróg", 2018),
                new Book("Pan Samochodzik i templariusze", "Zbigniew Nienacki", "Siedmioróg", 2018)
        };


        System.out.println("książka 1: " + books[0].toString());
        System.out.println("książka 2: " + books[1].toString());
        System.out.println("Te same książki? - " + books[0].equals(books[1]));
        System.out.println();

        System.out.println("książka 1: " + books[0].toString());
        System.out.println("ksiązka 3: " + books[2].toString());
        System.out.println("Te same książki? - " + books[0].equals(books[2]));
    }
}
