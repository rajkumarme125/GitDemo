//1. Indian Tax System, 2500000, 1345556, 489000, 2500000
//2. Tax slabs ==> below 5L Tax is Zero , >5L and <=10L Tax is 20% of salary , > 10L Tax is 30% salary
//3. Store all the values using any collection concept and print
//4. final amount to be processed for each candidate after tax deduction


package language.basics;

import java.util.ArrayList;

import java.util.List;

public class NetSalaryCalculation {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(2500000);

		list.add(1345556);

		list.add(489000);

		list.add(800000);

		list.add(1858790);

		list.add(845796);

		double tax = 0;

		for (double salary : list) {

			if (salary < 500000) {

				System.out.print("Salary :: " + salary);

				tax = 0;

				System.out.print(" tax :: " + tax);

				System.out.println(" Net Salary :: " + (salary - tax));

			} else if (salary > 500000 && salary <= 1000000) {

				System.out.print("Salary :: " + salary);

				tax = (salary * 20 / 100);

				System.out.print(" tax :: " + tax);

				System.out.println(" Net Salary :: " + (salary - tax));

			} else {

				System.out.print("Salary :: " + salary);

				tax = (salary * 30 / 100);

				System.out.print(" tax :: " + tax);

				System.out.println(" Net Salary :: " + (salary - tax));

			}

		}

	}

}
//                   output:

//Salary :: 2500000.0 tax :: 750000.0 Net Salary :: 1750000.0
//
//Salary :: 1345556.0 tax :: 403666.8 Net Salary :: 941889.2
//
//Salary :: 489000.0 tax :: 0.0 Net Salary :: 489000.0
//
//Salary :: 800000.0 tax :: 160000.0 Net Salary :: 640000.0
//
//Salary :: 1858790.0 tax :: 557637.0 Net Salary :: 1301153.0
//
//Salary :: 845796.0 tax :: 169159.2 Net Salary :: 676636.8
