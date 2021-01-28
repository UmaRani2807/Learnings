package Programs;

public class Reverse {

	
	public static void reverse(String in)
	{
		char[] strev = in.toCharArray();
		System.out.println(strev.length);
		for(int i=strev.length-1;i>=0;i--)
		{
		System.out.print(strev[i]);
		}
		
	}
	public static void main(String[] args) {
		String str = "Pathakoty";
		reverse(str);
	}

}
