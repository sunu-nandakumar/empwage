import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilder implements IComputeEmpWage{
	public static final int IS_PART_TIME = 1; 
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0; 
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyEmpWageMap;
	

	public EmpWageBuilder() 
	{
		companyEmpWageList = new LinkedList<>();
		companyEmpWageMap = new HashMap<>();
	}

	public void addCompanyEmpwage(String company, int empRatePerHour, int numofWorkingDays, int maxHoursPerMonth) 
	{

		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numofWorkingDays ,maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company ,companyEmpWage);
	
	}

	

	private void computeEmpwage() 
	{ 
		for (int i = 0; i < companyEmpWageList.size(); i++) 
		{

			CompanyEmpWage companyEmpWage= companyEmpWageList.get(i); 
			companyEmpWage.setTotalEmpWage (this.computeEmpWage (companyEmpWage)); 
			System.out.println(companyEmpWage);
		}
	}

			public int getTotalWage(String company) {
				return companyEmpWageMap.get(company).totalEmpwage;
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

		IComputeEmpWage empWageBuilder = new EmpWageBuilder(); 
		empWageBuilder.addCompanyEmpWage("DMart ", 28, 2, 18);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20); 
		empWageBuilder.computeEmpWage();
		System.out.println("Total wage for the Dmart Company :" +empWageBuilder.getTotalWage("DMart"));
}
	}
