package Programs;

public class ReverseOfString {

	public static void main(String[] args) {

		String str = "yoga";
		//System.out.println(reverse(str));
				
			char[] strChar = str.toCharArray();
			System.out.println(strChar.length);
			for(int i=strChar.length-1;i>=0;i--)
				System.out.print(strChar[i]);
		}
	}