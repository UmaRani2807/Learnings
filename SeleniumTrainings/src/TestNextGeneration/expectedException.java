package TestNextGeneration;

import org.testng.annotations.Test;

public class expectedException {

	@Test(expectedExceptions = NumberFormatException.class)
	public void ParseInt() {
		String id = "100A";
		Integer.parseInt(id);
		
	}
	
}
