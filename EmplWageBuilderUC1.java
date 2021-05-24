public class EmplWageBuilderUC1{

public static void main(String args[]){
	

int Wage_per_hr=20;
int Daily_wage=0;
int Working_days=20;
int totalEmpHrs = 0;
int emphrs;
	for (int i=1;i<=Working_days;i++)
{
	int emplCheck = (int) (Math.floor(Math.random () * 10 ) % 3) ;
	switch(emplCheck) 
{
	case  1:
	
	 emphrs = 8 ;
	
	break;

	case 2:
	
	 emphrs = 4;
	
	break;

	default:

	 emphrs = 0;
	
}
	totalEmpHrs= totalEmpHrs + emphrs;
	System.out.println(" the total hours  is " + totalEmpHrs );
}
	int wage = totalEmpHrs * Wage_per_hr;
	System.out.println(" the wage for the month is " + wage );
	}

	}
