package oopIII;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account a1;
		a1 = new Account(1001, 10000.00f);
	        System.out.println("Current rate : "+Account.getIntRate());//Account.getIntRate() is static method to access Account class int_rate value .
		System.out.println(a1.calBalance()); // calling by object

		Account a2 = new Account(1010, 15000.00f);
		System.out.println(a2.calBalance());//  calling by object

		Account.updateRate(4.8f);// calling static method directly  
		System.out.println("Current rate : "+Account.getIntRate()); // called static variable directly
		System.out.println(a1.calBalance()); // calling by object
	    System.out.println(a2.calBalance()); // calling by object

	}

}
