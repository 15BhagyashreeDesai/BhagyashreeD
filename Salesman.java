package rno349.java;

public class Salesman extends Edetails implements Employee
{
	int noOfSales;
	Salesman(){}

	public Salesman(int id, String name, double salary, double bonus,String pname,int noOfSales) 
	{
		super(id, name, salary, bonus,pname);
		this.noOfSales=noOfSales;
	}
	/*public void PayBonus(double bonus)
	{
		bonus=bonus+salary*0.1;
		 noOfSales+=10;
		System.out.println("bonus="+bonus);
	}*/
	public void Project(String pname)
	{
		if(pname=="domestic")
		{
			bonus=bonus+salary*0.05;
			System.out.println("bonus="+bonus);
		}
	else if(pname=="normal")
	{
		bonus=bonus+salary*0.03;
		System.out.println("bonus="+bonus);
	}
	else
	{
		bonus=bonus+salary*0.1;
		 noOfSales+=10;
		System.out.println("bonus="+bonus);
	}

}
	
	void display1()
	{
		System.out.println("\n--------------------------------------------------");
		System.out.println("\nid="+id);
		System.out.println("name="+name);
		System.out.println("salary="+salary);
		System.out.println("bonus="+bonus);
		System.out.println("no of shares="+noOfSales);
		System.out.println("pname="+pname);
		//System.out.println("total Bonus amount="+PayBonus(bonus));


	}




}
