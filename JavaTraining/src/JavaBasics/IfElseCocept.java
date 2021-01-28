package JavaBasics;

public class IfElseCocept {

	public static void main(String[] args) {

		int a = 30;
		int b = 40;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		//comparison operators
		//< > <= >= == !=
		int c = 50;
		int d = 50;
		if(c==d)
		{
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		//write a logic to find out the highest number
		int a1=500;
		int b1=400;
		int c1=300;
		
		//nested if-else
		if (a1>b1 & a1>c1) {
			System.out.println("a1 is the highest number");
		}
		else if (b1>c1) {
			System.out.println("b1 is the highest number");
		}
		else {
			System.out.println("c1 is the highest number");
		}
			
			
			
	}

}
