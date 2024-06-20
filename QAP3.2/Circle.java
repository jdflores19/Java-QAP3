/**
QAP 3.2
Joseph Flores
June 12, 2024
*/

public class Circle extends Shape {
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with radius parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with all parameters
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate area
    public double getArea() {
    double area = Math.PI * radius * radius;
    return Math.round(area * 1000.0) / 1000.0;
}

    // Calculate perimeter
    public double getPerimeter() {
    double perimeter = 2 * Math.PI * radius;
    return Math.round(perimeter * 1000.0) / 1000.0;
}

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
