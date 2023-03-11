public class Employe{
    int id;
    String Name;
    String designation;
    int age;
    int salary;
    Employe(int id,String name, int age, int salary){

        this.id=id;
        this.Name =name;
        this.salary=salary;
        this.age=age;
    }

    Employe(int id,String name,int age){

    
        this.id=id;
        this.Name=name;
        this.age=age;
        this.salary = 50000;}


        public void displayEmpDetails() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + Name);
            System.out.println("Designation: " + designation);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);




    

    }
    public static void main(String[]args){
         Employe e1=new Employe(12,"Abhi",25,29000);
         Employe e2=new Employe(10,"Vardan",27);
        //  System.out.println("The data of emp1:"+e1);
        //  System.out.println("the dat of employe2:"+e2);
         e1. displayEmpDetails();
         e2. displayEmpDetails();


    }
}


