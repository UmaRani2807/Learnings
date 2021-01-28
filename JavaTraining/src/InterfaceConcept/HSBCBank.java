package InterfaceConcept;

public class HSBCBank implements USBank{
	
	//If a class is implementing any interface, then it is mandatory to define/override all the methods of Interface
	public void transferMoney() {
		System.out.println("hsbc --- transfer money");
	}

	public void credit() {
		System.out.println("hsbc --- credit");
	}
	
	public void debit() {
		System.out.println("hsbc --- debit");
	}
	
	public void educationLoan() {
		System.out.println("hsbc --- edu loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc --- car loan");
	}
}
