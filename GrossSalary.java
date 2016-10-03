package bhhagya.java.ac.in;

public class GrossSalary 
{
	private int EmpID;
	private String EmpName;
	public int getEmpID() {
		return EmpID;
	}


	public String getEmpName() {
		return EmpName;
	}


	public float getEmpSalary() {
		return EmpSalary;
	}


	private float EmpSalary;
	private double Allowance;
	private float netSalary;
	private double grossPay;
	private double netPay;
	private double incomeTax;
     GrossSalary(String EmpName,int EmpID,float EmpSalary)
     {
    	 this.EmpName=EmpName;
    	 this.EmpID=EmpID;
    	 this.EmpSalary=EmpSalary;
     }
	
	
	void  netPay()
    {
    	if(getEmpSalary()<5000)
    	{
    		incomeTax=0;
    		Allowance=0.46*getEmpSalary();
    		grossPay=getEmpSalary()+Allowance;
    		netPay=grossPay-incomeTax;
    		
			System.out.println(" Emplay ID="+EmpID +" Employee basic salary=" +getEmpSalary() +" Employee Allowance="+Allowance +" Employee grosspay="+grossPay +" employee income tax"+incomeTax+" Net Pay="+netPay);
    	}
    	else if(getEmpSalary()>5000 && getEmpSalary()<10000)
    	{
    		incomeTax=0.10 *getEmpSalary();
    		Allowance=0.46*getEmpSalary();
    		grossPay=getEmpSalary()+Allowance;
    		netPay=grossPay-incomeTax;
    		
			System.out.println("Emplay ID="+EmpID +"Employee basic salary=" +getEmpSalary() +"Employee Allowance="+Allowance +"Employee grosspay="+grossPay +"employee income tax"+incomeTax+"Net Pay="+netPay);
    	}
    	else if(getEmpSalary()>10000 && getEmpSalary()<20000)
    	{
    		incomeTax=0.20 *getEmpSalary();
    		Allowance=0.46*getEmpSalary();
    		grossPay=getEmpSalary()+Allowance;
    		netPay=grossPay-incomeTax;
    		
			System.out.println("Emplay ID="+EmpID +"Employee basic salary=" +getEmpSalary() +"Employee Allowance="+Allowance +"Employee grosspay="+grossPay +"employee income tax"+incomeTax+"Net Pay="+netPay);
    	}
    	else
    	{
    		incomeTax=0.30 *getEmpSalary();
    		Allowance=0.46*getEmpSalary();
    		grossPay=getEmpSalary()+Allowance;
    		netPay=grossPay-incomeTax;
    		
			System.out.println("Emplay ID="+EmpID +"Employee basic salary=" +getEmpSalary() +"Employee Allowance="+Allowance +"Employee grosspay="+grossPay +"employee income tax"+incomeTax+"Net Pay="+netPay);
    	}
    }


	/*public void setEmpSalary(int nextInt) {
		// TODO Auto-generated method stub
		
	}*/


	
	

}
