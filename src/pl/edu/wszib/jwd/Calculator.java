package pl.edu.wszib.jwd;

public class Calculator {
    //Napisz program pl.edu.wszib.jwd.Calculator posiadający metody o nazwie add sumujące 2 lub 3 liczby typu int lub double.

    public int add (int a, int b) {
        return a + b;
    }

    public int add (int a, int b, int c) {
        return a + b + c;
    }

    public double add (double a, double b) {
        return a + b;
    }

    public double add (double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result1 = calc.add(3, 4);
        int result2 = calc.add(4, 5, 6);
        double result3 = calc.add(2.4 , 3.7);
        double result4 = calc.add(3.4, 6.7, 8.9);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
