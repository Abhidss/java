 public class emp {
    int id;
    String name;
    double salary;
    emp()
    {
        id=000;
        name="default";
        salary=40000;
    }
    emp(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    emp(int id,String name)
    {
        this.id=id;
        this.name=name;
        salary=50000;
    }
    emp(emp e)
    {
    this.id=e.id;
    this.name=e.name;
    this.salary=e.salary;
    
    }
    void displayDetails()
    {
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
    }
    
    
    
    
     
    
        public static void main(String[] args) {
            
    emp e1=new emp();
    emp e2=new emp(101,"XYZ",60000);
    emp e3=new emp(102,"WXY");
    emp e4=new emp(e2);
    emp e5=new emp(e3);
    e1.displayDetails();
    e2.displayDetails();
    e3.displayDetails();
    e4.displayDetails();
    e5.displayDetails();
    }
}
    
    
    

     
    

