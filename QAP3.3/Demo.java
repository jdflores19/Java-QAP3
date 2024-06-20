/**
QAP 3.3
Joseph Flores
June 12, 2024
*/

public class Demo {
    public static void main(String[] args) {
        // Test Point class
        Point point1 = new Point(1.0f, 2.0f);
        System.out.println(point1);

        point1.setX(3.0f);
        point1.setY(4.0f);
        System.out.println("Updated Point: " + point1);

        float[] xy = point1.getXY();
        System.out.println("XY: (" + xy[0] + ", " + xy[1] + ")");

        // Test MovablePoint class
        MovablePoint movablePoint1 = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println(movablePoint1);

        movablePoint1.move();
        System.out.println("Moved MovablePoint: " + movablePoint1);

        movablePoint1.setSpeed(1.0f, 1.0f);
        movablePoint1.move();
        System.out.println("Moved MovablePoint with new speed: " + movablePoint1);
    }
}
