package rno349.java;

public class EmployeeDemo 
{
	 	public static void main(String[] args)
	 	{
	 			Manager o=new Manager(10,"abc",20000,3000,"domestic",3);
	 			Salesman o1=new Salesman(20,"pqr",15000,1500,"normal",5);
	 			o.display();//o.PayBonus(2000);
	 			o.Project("domestic");o1.Project("normal");
	 			o1.display1();//o1.PayBonus(1500);
	 		
	 	}

}
