public class EmplWageBuilderUC2{

public static void main(String args[]){
	
int is_FullTime=1;
int Wage_per_hr=20;
int Daily_wage=0;
double emplCheck = Math.floor(Math.random () * 10 ) % 2;
	if(emplCheck == is_FullTime)
	{
Daily_wage = Wage_per_hr * 8 ;
System.out.println(" the daily wage of employee is " + Daily_wage );
System.out.println("Employee is present");

}
	else{
	System.out.println("employee is absent");
}
}

}
