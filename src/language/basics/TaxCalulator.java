package language.basics;


import java.util.LinkedList;
import java.util.List;

public class TaxCalulator {
	
	public static void main(String [] args) {
		
		double tax=0;
		
		int []salary = {320000, 650000, 850000,1500000, 2000000,2500000};
		
		List<Double>finalTax= new LinkedList<Double>();
		
		for(int i=0;i<salary.length;i++) {
			
		
		if (salary[i] <=500000) {
			tax=0;
			System.out.println(tax);
			finalTax.add(tax);
			
		}
		else if (salary[i]<=1000000 && salary[i]>500000) {
			tax =0.2*(salary[i]-500000);
			System.out.println(tax);
			finalTax.add(tax);
			
		}
		else {
			tax=0.3*(salary[i]-1000000);
			System.out.println(tax);
			finalTax.add(tax);
		}
		
	}
		System.out.println("print the Final Income Tax");
		System.out.println(finalTax);
		
	}

}
