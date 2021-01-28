package InterfaceConcept;

public interface USBank {
	
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//no method declaration
	//no method body - only method prototype
	//In Interface, we can declare variables, variables are by default static in nature
	//variables value will not be changed
	//no static method in interface
	//no main method in interface
	//we cannot create the object of interface
	//Interface is abstract in nature
	
}
