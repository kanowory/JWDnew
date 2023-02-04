package zjazd5.interfaces;

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        System.out.println(rectangle instanceof Rectangle);
        System.out.println(rectangle instanceof Shape);

        shape = new Rectangle();
        shape.draw();
        shape = new Triangle();
        shape.draw();
        shape = new Circle();
        shape.draw();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        for (Shape shapee: shapes) {
            shapee.draw();
        }
    }
}
