package array.basic;

public class DeleteArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		deleteArrayPosition(arr,3);
		System.out.println("-------------------New One--------------");
		deleteArrayIndex(arr,3);

		

	}
	
//	delete 3th position
	
	public static void deleteArrayPosition(int a[], int pos) {
		for(int i=pos-1;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		
		for(int i=0;i<a.length-1;i++) {
			System.out.println("a["+i+"]: "+a[i]);
		
			
		}
	}
	
//	Delete 3th index
	public static void deleteArrayIndex(int a[], int ind) {
		

		for(int i=ind;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		
		for(int i=0;i<a.length-1;i++) {
			System.out.println("a["+i+"]: "+a[i]);
		
			
		}
			
	}


}
