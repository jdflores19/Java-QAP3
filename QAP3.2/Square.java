/**
QAP 3.2
Joseph Flores
June 12, 2024
*/

public class Square extends Rectangle {
    // No-argument constructor
    public Square() {
        super(1.0, 1.0);
    }

    // Constructor with side parameter
    public Square(double side) {
        super(side, side);
    }

    // Constructor with all parameters
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
