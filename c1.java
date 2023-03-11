
class Circle {
    int radius;
    double area;
    double perimeter;
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    public void calArea() {
        this.area = 3.14 * radius * radius;
    }
    
    public void calPerimeter() {
        this.perimeter = 2 * 3.14 * radius;
    }
    
    public void displayAreaPerimeter() {
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

public class c1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);
        
        c1.calArea();
        c1.calPerimeter();
        c1.displayAreaPerimeter();
        
        c2.calArea();
        c2.calPerimeter();
        c2.displayAreaPerimeter();
    }
}
