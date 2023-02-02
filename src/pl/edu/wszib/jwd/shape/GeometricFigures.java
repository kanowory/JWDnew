package pl.edu.wszib.jwd.shape;

public class GeometricFigures {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5);
        Triangle triangle = new Triangle(4,2);
        //Shape shape = new Shape();//nie można tworzyć obiektu klasy abstarcyjnej
        showArea(rectangle);
        showArea(triangle);

        Shape[] shapes = {rectangle, triangle};//można utworzyc tablicę elementów typu abstrakcyjnego

    }
    public static void showArea(Shape shape) {//można stworzyć referencję- używanmie typu abstarcyjnego
        System.out.println("Pole powierzchni: " + shape.getArea());
    }
}
