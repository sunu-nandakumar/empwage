public class EmplWageBuilderUC1{

public static void main(String args[]){
	

int Wage_per_hr=20;
int Working_days=1;
int totalEmpHrs = 0;
int emphrs;

	do
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
        System.out.println(" the total hours  is "  + totalEmpHrs );
	Working_days++;
}

 while (totalEmpHrs<100 && Working_days<=20);

	int wage = totalEmpHrs * Wage_per_hr;
	System.out.println(" the wage for the month is " + wage );
	}

	}
