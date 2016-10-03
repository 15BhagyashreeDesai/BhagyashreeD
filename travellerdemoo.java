
public class travellerdemoo {

	public static void main(String[] args) 
	{
		traveller trans=new traveller(21,50.6f,2017,true);
		Checks_traveller Checkpoint1=new Checks_traveller();
		
		boolean bbaggage=Checkpoint1.CheckBaggage(trans);
		boolean bImmigration=Checkpoint1.CheckImmigration(trans);
		boolean bsecurity=Checkpoint1.Checksecurity(trans);
		
		if ((bbaggage==true && bImmigration==true ) && bsecurity==true)
		{
			System.out.println();
		
		}
		else
		{
			System.out.println();
		}
		}
}