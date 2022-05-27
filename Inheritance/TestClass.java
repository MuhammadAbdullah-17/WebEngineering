public class TestClass {
    public static void main(String[] args) {
        Circle c =new Circle(3.3);
        double area = c.getArea();
        System.out.println("Area of Circle is: \n" +area);
        Circle c1 =new Cylinder(3.3, 4.2);
        double area1 = c1.getArea();
        float area2 = (float) area1;
        boolean result = c1 instanceof Circle;
        System.out.println("Area of Cylinder is: " + area2 + "\n" +  result);
    }
}
