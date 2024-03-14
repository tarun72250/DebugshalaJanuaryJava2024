package apps;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;

public class AbstractClassCalculateSallaryDemo {

	public static void main(String[] args) {
		Emp [] allemp;
		allemp = new Emp[3];//creating array object 
		allemp[0]=new SalesManager("Asfiya",11,11,1111,101,20000.0f,10000,1000.0f);
		allemp[1]=new Programmer("Manas",12,12,1222,102,10000.0f,2,4);
		allemp[2]=new Admin("Sumit",11,13,1444,103,50000.0f,2000.0f);
		
		double total =0;
		for(int i=0 ; i<allemp.length ; i++)
		{
			total +=allemp[i].calSalary();
			System.out.println(allemp[i].calSalary());
		}
		System.out.println("Total sallary :"+total);
		
	}

}
