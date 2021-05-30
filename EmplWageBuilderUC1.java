public class EmplWageBuilderUC1{
	
	
	public static int emphrs;
	public static int fullWorkingHour = 8;
	public static int partTimeWorkingHour = 4;
	public static int leave = 0;

	public static int getHours(int emplCheck) {
		switch(emplCheck) 
		{
			case  1:
			
			 emphrs = fullWorkingHour ;
			
			
			break;

			case 2:
			
			 emphrs = partTimeWorkingHour;
			 
			
			break;

			default:

			 emphrs = leave;
			 
			
		}
		return emphrs;
	}
	
public static void main(String args[]){
	

int Wage_per_hr=20;
int Working_days=1;
int totalEmpHrs = 0;


	do
{
	

	int emplCheck = (int) (Math.floor(Math.random () * 10 ) % 3) ;
	getHours(emplCheck);
	totalEmpHrs= totalEmpHrs + emphrs;
        System.out.println(" the total hours  is "  + totalEmpHrs );
	Working_days++;
}

 while (totalEmpHrs<100 && Working_days<=25);

	int wage = totalEmpHrs * Wage_per_hr;
	System.out.println(" the wage for the month is " + wage );
	}

	}
