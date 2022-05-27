package Inheritance;

public class Triangle {
        double radius;
    
        protected Triangle(double radius) {
            this.radius = radius;
        }
        double getArea()
        {
            return Math.PI * radius * radius;
        }
    }
