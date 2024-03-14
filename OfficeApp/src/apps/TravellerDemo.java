package apps;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;
import office.utility.ITraveller;

public class TravellerDemo {

	public static void main(String[] args) {
	
		Emp [] allemp;
		allemp = new Emp[3];//creating array object 
	//	allemp[0]=new SalesManager("Asfiya",11,11,1111,101,20000.0f,10000,1000.0f,12);//12 days for programmer
	//	allemp[1]=new Programmer("Manas",12,12,1222,102,10000.0f,2,4,8);//8 days for programmer
		allemp[2]=new Admin("Sumit",11,13,1444,103,50000.0f,2000.0f);
		
		for(Emp e:allemp)
		{
			System.out.println("Gross Salary : "+e.calSalary());
		}
		
		
		//need to display info about only TA given to employee
		for(Emp e:allemp)
		{
			//e.calculateTA();this is a problem , will generate error
			
			//chance it may fail at runtime
			// so we use if condition, before we taken care before typecasting
			if( e instanceof ITraveller)
			{
				System.out.println(" TA : "+((ITraveller)e).calculateTA());
			}
			//this will through runtime error for admin
		}
		
		
		
		/*
		String s ="welcome";
		SalesManager sm = (SalesManager)s;//this may failed at runtime*/
		
		/*//here double typecast into int
		double d=6.7;
		int n = (int)d;
		*/
		
		//no type cating needed int can be automatically type casted to double
		//here u easily assigned smaller datatype typecast to bigger datatype easily
//		int a =6;
//		double b =a;
	
	}

}
