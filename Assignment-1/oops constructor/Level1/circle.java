class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.0);

        System.out.println("Default Circle Area: " + defaultCircle.area());
        System.out.println("Custom Circle Area: " + customCircle.area());
    }
}
