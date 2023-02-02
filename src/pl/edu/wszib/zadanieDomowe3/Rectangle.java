package pl.edu.wszib.zadanieDomowe3;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {
        this.length = this.width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int dimension) {
        this.length = this.width = dimension;
    }

    public double getArea () {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("rectangle1 (constructor with no parameters)");
        System.out.println("area = " + rectangle1.getArea());

        Rectangle rectangle2 = new Rectangle(5);
        System.out.println("rectangle2 (constructor with one parameter)");
        System.out.println("area = " + rectangle2.getArea());

        Rectangle rectangle3 = new Rectangle(3,4);
        System.out.println("rectangle3 (constructor with two parameters)");
        System.out.println("area = " + rectangle3.getArea());
    }
}
