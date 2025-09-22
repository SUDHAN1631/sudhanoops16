import java.util.Scanner;
abstract class Shape {
    abstract double calculateArea();
}
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Square extends Shape {
    double side;
  Square(double side) {
        this.side = side;
    }
    double calculateArea() {
        return side * side;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


public class Abt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        System.out.print("Enter shape name (rectangle, square, circle): ");
        String shapeType = scanner.next().toLowerCase();

        if (shapeType.equals("rectangle")) {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            shape = new Rectangle(length, width);

        } else if (shapeType.equals("square")) {
            System.out.print("Enter side: ");
            double side = scanner.nextDouble();
            shape = new Square(side);

        } else if (shapeType.equals("circle")) {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            shape = new Circle(radius);

        } else {
            System.out.println("Invalid shape type!");
            System.exit(0);
        }

        System.out.println("Area = " + shape.calculateArea());
        scanner.close();
    }
}

