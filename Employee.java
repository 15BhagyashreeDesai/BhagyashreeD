package in.ac.emloyee;

public class Employee {
	private int iEmpiD;
	private String sEmpName;
	private float fEmpBasicsalary;
	private float fAllowances;

	
		
		

		
		Employee(int iEmpiD,String sEmpName,float fEmpBasicsalary)
		{
			this.iEmpiD=iEmpiD;
			this.sEmpName=sEmpName;
			this.fEmpBasicsalary=fEmpBasicsalary;
			
			
		}

float calNetSalary()
{
	float incometax;
	float Netsalary;
	float gross_salary;
	float Basicsalary;
	
	fAllowances=(46f/100f)*fEmpBasicsalary;
	gross_salary=fAllowances+fEmpBasicsalary;
	System.out.println("Allowance is"+fAllowances);
	System.out.println("Allowance is"+gross_salary);
	
	if(gross_salary<5000)
		incometax=0;
	else if(gross_salary>50001 && gross_salary<10000)
		incometax=(10f/100f)*gross_salary;
	else if(gross_salary>10001 && gross_salary<20000)
		incometax=(20f/100f)*gross_salary;
	else 
		incometax=(30f/100f)*gross_salary;
	Netsalary=gross_salary-incometax;
	return Netsalary;
}




		public int getiEmpiD() {
			return iEmpiD;
		}






		public String getsEmpName() {
			return sEmpName;
		}






		public double getfEmpBasicsalary() {
			return fEmpBasicsalary;
		}






		public double getfAllowances() {
			return fAllowances;
		}

		
	
}

	
