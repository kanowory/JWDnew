package zjazd5.exceptions;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();
        int i = ued.getNumberFromString("9d");
        System.out.println("Oto nasza liczba pomnożona przez 99: " + (i * 99));

    }

    public int getNumberFromString (String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Upewnij sie że przekazywany String jest liczbą. " + e.getMessage());
        }
        return -1;
    }

}
