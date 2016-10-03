package bhhagya.java.ac.in;


public class Customer {
	private int iCustID;
	private String sCustName;
	private String sAddress;
	private long lTeleNo;
	
	public Customer(int iCustID, String sCustName, String sAddress, long lTeleNo) {
		
		this.iCustID = iCustID;
		this.sCustName = sCustName;
		this.sAddress = sAddress;
		this.lTeleNo = lTeleNo;
	}

	public int getiCustID() {
		return iCustID;
	}

	public String getsCustName() {
		return sCustName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public long getlTeleNo() {
		return lTeleNo;
	}
	 
	public boolean validateTeleNo(long lTeleNo)
	{
		int j=0;
		if((lTeleNo/10)==10)
        j++	;
	    if(j==10)
		{
			return  true;
		}
		else {
			return false;
		}
	}
	
    public boolean validateCustName(String sCustName)
    { int t=sCustName.length();
    	if(t>4 && t<20)
    	{
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public void display(){
    	System.out.println("Customer Details are:\n");
    	System.out.println("Customer_ID="+iCustID);
    	System.out.println("\nCustomer_Name="+sCustName);
    	System.out.println("\nCustomer's Name is "+validateCustName(getsCustName()));
    	System.out.println("\nAddress="+sAddress);
    	System.out.println("\nTelephone_Num="+lTeleNo);
    	System.out.println("\nTelephone_Num is "+validateTeleNo(getlTeleNo()));
    }
    
}








