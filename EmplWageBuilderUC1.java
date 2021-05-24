public class EmplWageBuilderUC1{

public static void main(String args[]){
	

int Wage_per_hr=20;
int Daily_wage=0;

int emplCheck = (int) (Math.floor(Math.random () * 10 ) % 3) ;

	switch(emplCheck) 
{
	case  1:
	
	Daily_wage = Wage_per_hr * 8 ;
	System.out.println(" the daily wage of employee is " + Daily_wage );
	System.out.println("Employee is present");
	break;

	case 2:
	
	Daily_wage = Wage_per_hr * 4;
	System.out.println(" the daily wage of employee is " + Daily_wage );
	System.out.println("Employee is part timmer");
	break;

	default:

	System.out.println("employee is absent");
	
}
	}

	}
