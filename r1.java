public class r1 {
    
        double length;
        double breadth;
        
    
        r1(){
            length=0;
            breadth=0;
        }
          r1(double length,double breadth){
            this.length=length;
            this.breadth=breadth;
        }
        r1(r1 e){
            this.length=e.length;
            this.breadth=e.breadth;
        }
        public double calarea(){
           return  length * breadth;
    
       }
       
        public static void main(String[]args){
    
        
        r1 v1=new r1();
        r1 v2=new r1(20,30);
        r1 v3=new r1(v2);
        System.out.println("the area of rectangle 1: "+v1.calarea());
        System.out.println("the area of rectangle 2: "+v2.calarea());
        System.out.println("the area of rectangle 3: "+v3.calarea());

    
    
    
       }
    
       }
    
