package apps;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;

//for interface 
//12 days for programmer
//8 days for programmer
public class CalculateSalaryDemo {

	public static void main(String[] args) {
		Emp [] allemp;
		allemp = new Emp[3];//creating array object 
		allemp[0]=new SalesManager("Asfiya",11,11,1111,101,20000.0f,10000,1000.0f);
		allemp[1]=new Programmer("Manas",12,12,1222,102,10000.0f,2,4);
		allemp[2]=new Admin("Sumit",11,13,1444,103,50000.0f,2000.0f);
		
		double total =0;
		//for normal calSalary() calling
		for(Emp e:allemp)//advanced for loop
		{
			total = total+e.calSalary();
			System.out.println("Gross Salary : "+e.calSalary());
		}
		System.out.println("Total Salary of All Empolyee : "+total);

	}

}



