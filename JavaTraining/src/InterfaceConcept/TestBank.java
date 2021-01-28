package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);
		
		HSBCBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		b.educationLoan();
		b.carLoan();
		
		//dynamic polymorphism
		//the child class object can be referred by parent interface reference variable.
		USBank u = new HSBCBank();
		u.credit();
		u.debit();
		u.transferMoney();
	}

}
