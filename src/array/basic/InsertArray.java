package array.basic;

public class InsertArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		insertArrayPosition(arr,3);
		System.out.println("-------------------Check array--------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("a["+i+"]: "+arr[i]);	
			
		}
		System.out.println("-------------------New One--------------");
		insertArrayIndex(arr,3);
		System.out.println("-------------------Git Test--------------");

		

	}
	
//	Insert 35 at 3th positiona
	public static void insertArrayPosition(int a[], int pos) {
		for(int i=a.length-1;i>=pos;i--) {
			a[i]=a[i-1];
			
		}
		a[2]=35;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]: "+a[i]);
		
			
		}
	}

	public static void insertArrayIndex(int a[], int ind) {
//		Insert 45 at 3th index		

		for(int i=a.length-1;i>=ind;i--) {
			a[i]=a[i-1];
			
		}
		a[3]=45;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]: "+a[i]);
		
			
		}
			
	}

}
