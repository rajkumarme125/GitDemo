package language.basics;

import java.util.ArrayList;
import java.util.List;

public class PracticeProblem {

	public static void main(String[] args) {
		int[] salaries= { 500000,800000,2500000, 1345556, 489000, 2500000};
		//Map<String,Double> finsalary=new HashMap<String,Double>();
		List<Double> salaryAfterDeduction=new ArrayList<Double>();
		for (int sal:salaries){
			if (sal==500000) {
				double amount=0.0;
				salaryAfterDeduction.add(amount);
				
			}
			else if(sal>500000 && sal<=1000000) {
				double amount=0;
				amount=sal-(sal*0.2);
				salaryAfterDeduction.add(amount);
				
			}
			else if(sal>1000000) {
				double amount=0;
				amount=sal-(sal*0.3);
				salaryAfterDeduction.add(amount);
			}
				
			}
			System.out.println(salaryAfterDeduction);
		}

	}