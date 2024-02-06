package oopII;

public class DateModifyClassDemo {

	public static void main(String[] args) {
		
		DateModifyClass d;     				//refrence variable
		d=new DateModifyClass(12,12,2023);   //alocating memory on heap
		d.showDate();//normal instance method
		d.showModifyDate('-');//char written in single quotes ''
	}

}
