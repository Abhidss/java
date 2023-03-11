public class Shape {
    
    
    public double calArea(double length, double width) {
        return length * width;
    }
    
    
    public double calArea(Double side) {
        return side * side;
    }
    
    
    public double calArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[]args){
        Shape shape = new Shape();


double rectangleArea = shape.calArea(5, 4);
System.out.println("Area of rectangle: " + rectangleArea);


double squareArea = shape.calArea(3);
System.out.println("Area of square: " + squareArea);


double circleArea = shape.calArea(2.5);
System.out.println("Area of circle: " + circleArea);

    }
}

