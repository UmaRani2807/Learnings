package Programs;

public class SwapingNumbers {

	public static void swap(int a,int b) {
		b = b+a;
		a = b-a;
		b = b-a;
		System.out.print("The values are " +a + " " +b);
		//System.out.println(b);
	}
	public static void main(String[] args) {
		swap(10,20);
		}
}
