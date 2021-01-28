package JavaBasics;

import java.util.ArrayList;

public class ArrayListCOncept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100); //0
		ar.add(200); //1
		ar.add(300); //2
		
		System.out.println(ar.size());
		
		ar.add(400); //3
		ar.add(500); //4
		
		System.out.println(ar.size());
		
		ar.add("Tom"); //5
		ar.add("Hello"); //6
		ar.add("12.33"); //7
		ar.add('M'); //8
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		//System.out.println(ar.get(9)); //IndexOutOfBoundsException
		
		// to print all the values of ArrayList: for loop
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Uma");
	}

}
