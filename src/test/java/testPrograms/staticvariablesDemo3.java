package testPrograms;

public class staticvariablesDemo3 {

	static int a =30;
	
	public void method1() 
	{
		a=20;
		this.a =40;
	}
	
	public void method2() 
	{	
		System.out.println("Value of a after method 2 is " +a);
	}
	
	public static void main(String[] args) {

		staticvariablesDemo3 var = new staticvariablesDemo3();
		var.method1();
		var.method2();
		
		staticvariablesDemo3 var1= new staticvariablesDemo3();
		var1.method2();
		
	}

}
