package in.ac.emloyee;

import java.beans.FeatureDescriptor;

public class EmployeeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1=new Employee(1,"abc",1750.50);
		System.out.println("Emp Name:"+e1.getsEmpName());
		System.out.println("Emp ID:"+e1.getiEmpiD());
		System.out.println("Emp Basic salary:"+e1.getfEmpBasicsalary());
		System.out.println("Emp allowances:"+e1.getfAllowances());
		
		float salary1=e1.calNetSalary();
		System.out.println("Emp allowances:"+salary1);

	
		
	
	}
}

		
		
		
		
			
				
	

