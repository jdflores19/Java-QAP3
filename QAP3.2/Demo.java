/**
QAP 3.2
Joseph Flores
June 12, 2024
*/

public class Demo {
    public static void main(String[] args) {
        Shape S = new Shape("Orange", true);
        System.out.println(S);

        Circle C = new Circle(4.0);
        System.out.println(C);
        System.out.println("Area: " + C.getArea());
        System.out.println("Perimeter: " + C.getPerimeter());

        Circle C1 = new Circle(5.0, "red", true);
        System.out.println(C1);
        System.out.println("Area: " + C1.getArea());
        System.out.println("Perimeter: " + C1.getPerimeter());

        Rectangle R = new Rectangle(3.0, 4.0);
        System.out.println(R);
        System.out.println("Area: " + R.getArea());
        System.out.println("Perimeter: " + R.getPerimeter());

        Rectangle R1 = new Rectangle(3.0, 4.0, "blue", false);
        System.out.println(R1);
        System.out.println("Area: " + R1.getArea());
        System.out.println("Perimeter: " + R1.getPerimeter());

        Square Sq = new Square(3.0);
        System.out.println(Sq);
        System.out.println("Area: " + Sq.getArea());
        System.out.println("Perimeter: " + Sq.getPerimeter());

        Square Sq1 = new Square(5.0, "indigo", true);
        System.out.println(Sq1);
        System.out.println("Area: " + Sq1.getArea());
        System.out.println("Perimeter: " + Sq1.getPerimeter());
    }
}
