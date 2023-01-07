public class SquareRootApp {
    public static void main(String[] args) {

        double numberIn = 1;

        if (args.length > 0) {
            numberIn = Double.parseDouble(args[0]);
        }

        double squareRoot = Math.pow(numberIn, 0.5);
        System.out.println( "Pierwiatek kwadratowy " + numberIn + " = " + squareRoot);
    }
}
