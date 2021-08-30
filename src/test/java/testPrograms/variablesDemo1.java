package testPrograms;

public class variablesDemo1 {
	
	int a =30;
	
	public void method1() 
	{
		int a=20;
		System.out.println("Value of a inside method1 is " +a);
		System.out.println("Value of this.a is "+ this.a);
	}
	

	public static void main(String[] args) {
	
		variablesDemo1 var = new variablesDemo1();
		var.method1();
		
	}

}
