package inheritanceAssignment;

public class RegCustomer extends Customer {

	int regNo;

    public RegCustomer(String emailId, String address, int regNo) {
        super(emailId, address);
        this.regNo = regNo;
    }

 
   public  void giveDiscount(double shoppingPrice) {
        // Regular customer gets 5% discount
        double discount = shoppingPrice * 0.05;
        double finalPrice = shoppingPrice - discount;
        System.out.println("Customer Emailid : "+super.emailId);
        System.out.println("Customer Address : "+super.address);
        System.out.println("Customer Registration no : "+regNo);
        System.out.println("Final price for regular customer (with 5% discount): $" + finalPrice);
    }
}
