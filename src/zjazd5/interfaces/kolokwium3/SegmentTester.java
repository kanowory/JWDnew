package zjazd5.interfaces.kolokwium3;

public class SegmentTester {
    public static void main(String[] args) {
        //Stwórz klasę reprezentującą odcienk o nazwie Segment. Klasa powinna przechowywać informacje
        // o punkcie początkowym odcinka - startPoint, oraz punkcie końcowym odcinka - endPoint.
        // Do zdefiniowania punktów skorzystaj ze znanej klasy Point z pakietu java.awt.
        // Klasa powinna dostarczać konstruktor, którego parametrami są 4 liczby całkowite: x1, y1, x2, y2,
        // gdzie x1 i y1 określają współrzędne punktu początkowego a x2 i y2 współrzędne punktu końcowego odcinka.
        // Stwórz dwie instancje klasy Segment i jednym wyrażeniem sprawdź czy porównywane obiekty to ten sam
        // odcinek (wymagane przesłonięcie odpowiedniej metody).

        Segment point1 = new Segment(2, 3, 4, 5);
        Segment point2 = new Segment(3, 4, 5, 6);

        System.out.println(point1.equals(point2));

    }
}
