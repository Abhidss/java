public class Mypoint {
    private int x;
    private int y;
    
    
    public Mypoint() {
        x = 0;
        y = 0;
    }
    
    
    public Mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    public double distance(Mypoint other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    
    public double distance(int x, int y) {
        return distance(new Mypoint(x, y));
    }

public static void main(String[]args){
Mypoint p1 = new Mypoint(); 
Mypoint p2 = new Mypoint(3, 4);  

double d1 = p1.distance(p2); 
System.out.println(d1);  


double d2 = p1.distance(5, 6);  
System.out.println(d2);  
}
}