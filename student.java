public class student {
    String name;
    int Rollno;
    int semster ;
    float marks;
    student(){
        this.name="";
        this.Rollno=0;
        this.semster=0;
        this.marks=0;
    }
    student(String name,int RollNo,int semster,float marks){
        this.name=name;
        this.Rollno=Rollno;
        this.semster=semster;
        this.marks=marks;
    }
   

  
  public void displayDetails(){
    System.out.println("the name of student"+name);
    System.out.println("the student Roll no"+Rollno);
    System.out.println("the student semster "+semster);
    System.out.println("the student marks"+marks);
  }
  public static void main(String[]args){
    student s1= new student();
    student s2= new student("Gyan",24,2,50);
    
    s1.displayDetails();
    s2.displayDetails();
    


  }
  
}
