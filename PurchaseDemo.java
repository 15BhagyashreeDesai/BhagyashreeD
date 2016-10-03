package bhhagya.java.ac.in;

public class PurchaseDemo {

	
	public static void main(String[] args) {
		Purchase bill = new Purchase(45, 3, 4000);
		bill.calculateBill(bill.getiQty(), bill.getdBillAmt());
		bill.display();

	}

}
