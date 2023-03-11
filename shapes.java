public class shapes 
{
		
	void calcArea(float a, float b)	
	{
		float area = a * b;
		System.out.println("The Area of a Rectangle = " + area + " Sq Units");
	}	
	
	void calcArea(double r)			
	{
		double area = 3.14 * r * r;
		System.out.println("The Area of a Circle    = " + area + " Sq Units");
	}	
	
	void calcArea(double a, double b){
		double area = (a * b) / 2;
		System.out.println("The Area of a Triangle  = " + area);
	}
	public static void main(String[] args) 
	{
		shapes obj = new shapes();
		obj.calcArea(10.6f);
		obj.calcArea(14.3f, 22.5f);
		obj.calcArea(11.67);
		obj.calcArea(18.0, 25.4);
	}
} 
    

