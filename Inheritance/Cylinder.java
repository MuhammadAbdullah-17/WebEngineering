public class Cylinder extends Circle, Triangle {
    double length;

    protected Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }
    double getArea()
    {
         return super.getArea() + 2 * radius * length;
    }
}
