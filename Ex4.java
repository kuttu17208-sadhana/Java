import java.util.Scanner;
abstract class Shape {
    int dim1;
    int dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle = " + area);
    }
}
class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + area);
    }
}
class Circle extends Shape {
    Circle(int radius) {
        // Circle only needs one dimension (radius), so second dimension is passed as 0
        super(radius, 0);
    }

    @Override
    void printArea() {
        // Math.PI * r^2
        double area = Math.PI * dim1 * dim1;
        // Formatted to match expected output precision (~153.86 for radius 7)
        System.out.printf("Area of Circle = %.2f\n", area);
    }
}

// Main Class
class Ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shape: ");
        String shapeType = scanner.next();

        if (shapeType.equalsIgnoreCase("Rectangle")) {
            System.out.print("Length: ");
            int length = scanner.nextInt();
            System.out.print("Breadth: ");
            int breadth = scanner.nextInt();

            Shape rect = new Rectangle(length, breadth);
            rect.printArea();

        } else if (shapeType.equalsIgnoreCase("Triangle")) {
            System.out.print("Base: ");
            int base = scanner.nextInt();
            System.out.print("Height: ");
            int height = scanner.nextInt();

            Shape tri = new Triangle(base, height);
            tri.printArea();

        } else if (shapeType.equalsIgnoreCase("Circle")) {
            System.out.print("Radius: ");
            int radius = scanner.nextInt();

            Shape circ = new Circle(radius);
            circ.printArea();

        } else {
            System.out.println("Invalid shape type entered.");
        }

        scanner.close();
    }
}