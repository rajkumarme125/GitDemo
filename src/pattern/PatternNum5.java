/*
1
2 1
3 2 1
4 3 2 1 

*/
package pattern;

public class PatternNum5 {

	public static void main(String[] args) {

		for(int i=1;i<=4;i++) {
			for(int j=i;j>=1;j--) {
				
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}

}
