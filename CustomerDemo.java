package bhhagya.java.ac.in;

public class CustomerDemo {

	
	public static void main(String[] args) {
		Customer raj=new Customer(45, "rajesh", "vidyanagar Hubli", 1247890l);
		
		raj.validateTeleNo(raj.getlTeleNo());
		raj.validateCustName(raj.getsCustName());
		raj.display();
	}

}
