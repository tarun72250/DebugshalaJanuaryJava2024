package inheritanceAssignment;

public class Customer {

		String emailId;
	    String address;

	    public Customer(String emailId, String address) {
	        this.emailId = emailId;
	        this.address = address;
	    }

	   public  void giveDiscount(double shoppingPrice) {
	        // Customer gets no discount
	       // double finalPrice = shoppingPrice;
		   System.out.println("Customer mail id : "+emailId);
		   System.out.println("Customer Address : "+address);
	        System.out.println("Final price for regular customer: $" + shoppingPrice);
	    }
}
