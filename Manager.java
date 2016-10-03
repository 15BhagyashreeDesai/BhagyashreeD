package rno349.java;

public class Manager extends Edetails implements Employee 
{
		int noOfShares;
		Manager(){}
		public Manager(int id, String name, double salary, double bonus,String pname,int noOfShares) 
		{
			super(id, name, salary, bonus,pname);
			this.noOfShares=noOfShares;
		}
		/*public void PayBonus(double bonus)
		{
			bonus+=bonus;
			noOfShares+=10;	
			System.out.println("bonus="+bonus);

		}*/
		public void Project(String pname) 
		{
			if(pname=="domestic")
			{
				bonus=bonus+salary*0.05;
				System.out.println("bonus="+bonus);
			}
			if(pname=="normal")
			{
				bonus=bonus+salary*0.03;
				System.out.println("bonus="+bonus);
			}
			else
			{
				bonus+=bonus;
				noOfShares+=10;	
				System.out.println("bonus="+bonus);
			}
		}
		void display()
		{
			System.out.println("id="+id);
			System.out.println("name="+name);
			System.out.println("salary="+salary);
			System.out.println("bonus="+bonus);
			System.out.println("no of shares="+noOfShares);
			System.out.println("pname="+pname);
			//System.out.println("total Bonus amount="+PayBonus(bonus));
		}
		
		
	
}
