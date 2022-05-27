public class Circle {
    double radius;

    protected Circle(double radius) {
        this.radius = radius;
    }
    double getArea()
    {
        return Math.PI * radius * radius;
    }
}
