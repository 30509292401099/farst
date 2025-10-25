class Circle {
    double radius = 1.0;

    Circle() {
    }

    Circle(double newRadius) {
        radius = newRadius;
    }
    double getArea() {
        return radius * radius * 3.14159;
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        System.out.println("Circle 1: radius = " + c1.radius + ", area = " + c1.getArea());
        System.out.println("Circle 2: radius = " + c2.radius + ", area = " + c2.getArea());
    }
}
