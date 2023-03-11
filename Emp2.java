 class Emp {
	int id;
	String name;
	double salary;
	Emp()
	{
		id=000;
		name="default";
		salary=40000;
	}
	Emp(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
		salary=50000;
	}
	Emp(Emp e)
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
	
	}
	public class Emp2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Emp e1=new Emp();
	Emp e2=new Emp(101,"XYZ",60000);
	Emp e3=new Emp(102,"WXY");
	Emp e4=new Emp(e2);
	Emp e5=new Emp(e3);
	e1.displayDetails();
	e2.displayDetails();
	e3.displayDetails();
	e4.displayDetails();
	e5.displayDetails();
	}
}