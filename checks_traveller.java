
public class checks_traveller 
{
	public boolean fCheckbaggage(traveller trans)
	{
	
	if(trans.getbaggageAmount()=>0 && trans.getbaggageAmount()=<40)
	{
		
	}
	else
	{
		System.out.println(Check.getFbaggageAmount());
		return INVALID;
	}
	
	}
	public int iCheckImmigration(int iExpiryYear)
	{
		if(2001<=iExpiryYear<=2025)
		{
		System.out.println(Check.getiExpiry());
		return VALIED;
		}
		else
		{
			System.out.println(Check.getiExpiryYear());
			return INVALIED;
		}
	
}
	public boolean bsecurity(boolean bNOCSStatus)
	{
		System.out.println(Check.getbNOCSStatus);
		return VALID;
	}
	else
	{
}