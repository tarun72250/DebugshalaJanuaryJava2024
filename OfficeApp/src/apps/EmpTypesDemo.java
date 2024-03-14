package apps;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;

public class EmpTypesDemo {

	public static void main(String[] args) {
	
//		Emp e1 = new SalesManager();
//		e1.display();
		
		Emp [] allemp;
		allemp = new Emp[3];//creating array object 
		allemp[0]=new SalesManager("Asfiya",11,11,1111,101,20000.0f,10000,1000.0f);
		allemp[1]=new Programmer("Manas",12,12,1222,102,10000.0f,2,4);
		allemp[2]=new Admin("Sumit",11,13,1444,103,50000.0f,2000.0f);
		
		//i=0 , display method from SalesManager

		//i=1 , display method from Programmer

		//i=2 , display method from Admin
		
		//whatever we have done here is called as polymorphism
		for(int i=0 ; i<allemp.length ; i++)
		{
			allemp[i].display();
			//same method call .display()
			//called on common entity which is Emp
			//but different implemention will get called from appropriate subtype.
			//called polymorphism 
			//same msg given to common entity but it is implemented differently in different types of entities
			//ex:- cricket match when refry says start every player acts as different role.
			System.out.println("---------------------------------");
		}
		//for toString
		for(int i=0 ; i<allemp.length ; i++)
		{
			System.out.println(allemp[i]);//allemp[i].toString();
			System.out.println("---------------------------------");

		}
	
	
	}

}
