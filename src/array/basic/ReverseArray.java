package array.basic;

public class ReverseArray { 

	static void reverse(int a[], int n) 
	{ 
		int i,t; 
		for (i = 0; i < n / 2; i++) { 
			t = a[i]; 
			a[i] = a[n - i - 1]; 
			a[n - i - 1] = t;  
		} 

		// printing the reversed array 
		System.out.println("Reversed array is:"); 
		for (int k = 0; k < n; k++) { 
			System.out.println(a[k]); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int[] arr = { 10, 20, 30, 40, 50, 60 }; 
		System.out.println("Array length is : "+arr.length +"\n");
		reverse(arr, arr.length); 
	} 
}

