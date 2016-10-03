package bhhagya.java.ac.in;

public class Employee {

    
	private int iEmpID;
	private String sEmpName;
	private float fEmpBasicSalary;
	private double fAllowance;
	
	public Employee(int iEmpID, String sEmpName, float fBasicSalary)
	 {
		this.iEmpID = iEmpID;
		this.sEmpName= sEmpName;
		this.fEmpBasicSalary = fEmpBasicSalary;
		//this.fAllowance = fAllowance;
	}
	public int getiEmpID() 
	{
		return iEmpID;
	}
	public String getsEmpName() 
	{
		return sEmpName;
	}

	public float getfEmpBasicSalary() 
	{
		return fEmpBasicSalary;
	}

	public void Allowance() 
	{
		fAllowance=fEmpBasicSalary*0.46;
	}
	public void calNetSalary(double fEmpBasicSalary)
	{
		if((fEmpBasicSalary>5000)&&(fEmpBasicSalary<10000))
		{
			fEmpBasicSalary=fEmpBasicSalary*0.01;
		}
			
		else if((fEmpBasicSalary>10001)&&(fEmpBasicSalary<20000))
		{
			fEmpBasicSalary=fEmpBasicSalary*0.02;
		}
		else if(fEmpBasicSalary>20000)
		{
			fEmpBasicSalary=fEmpBasicSalary*0.03;
		}
		
		
		
	}
	
	void display(){
		System.out.println("employee	id is:"+getiEmpID());
		System.out.println("employee name is = "+getsEmpName());
		System.out.println("employee salary without income tax deduction = "+getfEmpBasicSalary());
		//System.out.println("employee salary after income tax deduction = "calNetSalary());
		//System.out.println("allowance is = " Allowance());
	}

}



