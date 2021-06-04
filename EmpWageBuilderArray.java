
public class EmpWageBuilderArray {
	public static final int IS_PART_TIME = 1; 
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0; 
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray() 
	{
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyEmpwage(String company, int empRatePerHour, int numofWorkingDays, int maxHoursPerMonth) 
	{

	companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numofWorkingDays ,maxHoursPerMonth);

	numOfCompany++;
	}

	

	private void computeEmpwage() 
	{ 
		for (int i = 0; i < numOfCompany; i++) 
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage (companyEmpWageArray[i])); 
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
	private int computeEmpWage (CompanyEmpWage companyEmpWage) {
		
		int empHrs = 0 , totalEmpHrs = 8, totalWorkingDays = 0;
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
		{
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() * 18) * 3;

				switch (empCheck) {

				case IS_PART_TIME:

				empHrs = 4;

				break;
				
				case IS_FULL_TIME:
					
					empHrs = 8; 
					break; 
					default:
						
						empHrs= 0;
				}
				totalEmpHrs += empHrs;
				System.out.println("Day: " + totalWorkingDays + " Emp Hr: " +empHrs);
	}
	return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	
	public static void main(String[] args) {

		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray(); 
		empWageBuilder.addCompanyEmpwage("DMart ", 28, 2, 18);
		empWageBuilder.addCompanyEmpwage("Reliance", 10, 4, 20); 
		empWageBuilder.computeEmpwage();
}
	}
