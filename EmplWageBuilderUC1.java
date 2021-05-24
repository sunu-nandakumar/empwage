public class EmplWageBuilderUC1{

public static void main(String args[]){
	
int is_FullTime=1;

double emplCheck = Math.floor(Math.random () * 10 ) % 2;
	if(emplCheck == is_FullTime)
	{
System.out.println("Employee is present");
}
	else{
	System.out.println("employee is absent");
}
}

}
