package oopIII;

public class BookDemo {

	public static void main(String[] args) {
		Book b1=new Book();
		b1.showDetails();
		Book b2=new Book(100.00f);
		b2.showDetails();
		Book b3=new Book(230.00f);
		b3.showDetails();
		Book b4=new Book(890.00f);
		b4.showDetails();
	}

}
