package bhhagya.java.ac.in;

import java.util.Scanner;

public class grossSalaryDemo {

	

	public static void main(String[] args){
		GrossSalary swati= new GrossSalary("a",24,50000);
		System.out.println("emp name="+swati.getEmpName());
		System.out.println("emp ID="+swati.getEmpID());
		System.out.println("emp salary="+swati.getEmpSalary());
		Scanner sc=new Scanner(System.in);
		//swati.setEmpSalary(sc.nextInt(5000));
		swati.netPay();
		
		
	
	}
}
