package pattern;

public class Pattern {

	public static void main(String[] args) {
		pattern1(5);
		pattern2(5);
		pattern3(5);
		pattern4(5);
		pattern5(5);
		pattern6(5);
		pattern7(5);

	}

//	pattern1
	static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");

			}
			System.out.println(" ");
		}

	}// pattern1
//	pattern2

	static void pattern2(int n) {
		for (int row = n; row >= 1; row--) {
			for (int col = row; col >= 1; col--) {
				System.out.print("* ");

			}
			System.out.println(" ");
		}

	}// pattern2
//	pattern3

	static void pattern3(int n) {
		for (int row = 0; row < 2 * n; row++) {
			if (row <= n) {
				for (int col = 1; col <= row; col++) {
					System.out.print("* ");

				}
				System.out.println(" ");
			} else {
				for (int col = row; col < 2 * n; col++) {
					System.out.print("* ");

				}
				System.out.println(" ");

			}

		}

	}// pattern3

//	pattern4

	static void pattern4(int n) {
		for (int row = 0; row < 2 * n; row++) {
			
			int totalCol = row > n ? (2 * n - row) : row;
			
			for (int col = 1; col <= totalCol; col++) {
				System.out.print("* ");

			}
			System.out.println(" ");

		}

	}// pattern4

//	pattern5

	static void pattern5(int n) {
		for (int row = 0; row < 2 * n; row++) {
			int totalCol = row > n ? (2 * n - row) : row;
			int space = n - totalCol;
			
			for(int s=0;s<=space;s++) {
				System.out.print(" ");
				
			}

			for (int col = 1; col <= totalCol; col++) {
				System.out.print("* ");

			}
			System.out.println(" ");

		}

	}// pattern5
	
//	pattern6

	static void pattern6(int n) {
		for (int row = 1; row <=n; row++) {
			int space = n - row;
			
			for(int s=0;s<=space;s++) {
				System.out.print("  ");
				
			}

			for (int col = row; col >= 1; col--) {
				System.out.print(col+" ");

			}
			for (int col = 2; col <= row; col++) {
				System.out.print(col+" ");

			}
			System.out.println(" ");

		}

	}// pattern6
	
	
//	pattern7

	static void pattern7(int n) {
		for (int row = 1; row <=2*n; row++) {
			int totalCol = row > n ? (2 * n - row) : row;
			int space = n - totalCol;
			
			for(int s=0;s<space;s++) {
				System.out.print("  ");
				
			}
			

			for (int col = totalCol; col >= 1; col--) {
				System.out.print(col+" ");

			}
			for (int col = 2; col <= totalCol; col++) {
				System.out.print(col+" ");

			}
			System.out.println(" ");

		}

	}// pattern7

}
