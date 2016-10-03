package bhhagya.java.ac.in;

public class Purchase {
	
	    private double t;
		private int iBillID;
		private int iQty;
		private double dBillAmt;
		
		public Purchase(int iBillID, int iQty, double dBillAmt) {
			this.iBillID = iBillID;
			this.iQty = iQty;
			this.dBillAmt = dBillAmt;
		}

		public int getiBillID() {
			return iBillID;
		}

		public int getiQty() {
			return iQty;
		}

		public double getdBillAmt() {
			return dBillAmt;
		}
		public void calculateBill(int iQty, double dBillAmt){
			if(iQty>0)
			{
				t=iQty*dBillAmt;
				if(t>=1000){
					t=t-(t*0.1);
				}
				else if(t>=500){
					t=t-(t*0.05);
				}
				else if(t<500){
					t=t-(t*0);
				}
			}
			
			
		}
		
		void display(){
			System.out.println("Bill_ID is:"+getiBillID());
			System.out.println("Quantity = "+getiQty());
			System.out.println("Ammount without discount = "+getdBillAmt()*getiQty());
			System.out.println("Ammount including discount = "+t);
			
		}
	
	}









