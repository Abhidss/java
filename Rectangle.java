
public class Rectangle {
     double length;
     double breadth;

    
     Rectangle() {
        length = 0;
        breadth = 0;
    }

    
     Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

     Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.breadth = rectangle.breadth;
    }

    
      double calArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        
        Rectangle rectangle1 = new Rectangle();

        
        Rectangle rectangle2 = new Rectangle(5, 10);

        
        Rectangle rectangle3 = new Rectangle(rectangle2);

        
        System.out.println("Area of rectangle1: " + rectangle1.calArea());
        System.out.println("Area of rectangle2: " + rectangle2.calArea());
        System.out.println("Area of rectangle3: " + rectangle3.calArea());
    }
}
