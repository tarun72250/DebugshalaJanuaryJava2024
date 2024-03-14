package debugShalaJava;

public class Date {
	
	private int dd;//data members - instance members
	private int mm;//state 
	private int yy;//always data members should be private

	//Note:-If we do not specify any constructor in class 
	//So always default cons it is present
	//if we define any cons in class so we always define default cons.
	//Default cons
	public Date()
	{
	
	}
	
	
	//Fully parametrized sConstructor
		public Date(int dd , int mm , int yy)
		{
			this.dd=dd;// this is differntaite btw local var and instance var
			this.mm=mm;
			this.yy=yy;
		}
		
		public Date(int dd , int mm )
		{
			this.dd=dd;// this is differntaite btw local var and instance var
			this.mm=mm;
		}
		
		public Date(int dd )
		{
			this.dd=dd;// this is differntaite btw local var and instance var
		}
	
		
	public void showDate()
	{
		System.out.println(dd+" / "+mm+" / "+yy);
		//local means 
	}

}




//public Date(Date d)
//{
//	this.dd=d.dd;// this is differntaite btw local var and instance var
//	this.mm=d.mm;
//	this.yy=d.yy;
//}
