package testPrograms;

public class variablesDemo2 {
		
		int a =30;
		
		public void method1() 
		{
			int a=20;
			this.a =40;
		}
		
		public void method2() {
			System.out.println("Value of a after method 2 is "+ a);
		}

		public static void main(String[] args) {
		
			variablesDemo2 var = new variablesDemo2();
			var.method2();// The value of a after method 2 will be the value of instance variable
			
			var.method1();
			var.method2(); // The value of a after method 1 and 2 is the new value replaces with this.a
			
		}

	}

