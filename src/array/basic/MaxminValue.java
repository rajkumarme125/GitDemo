package array.basic;

public class MaxminValue {
	public static void main(String [] args) {
		
		int[] arr = { 10, 20, 30, 40, 50, 60 }; 
		
		int max=arr[0];

		
//Find max value
		for(int i =1;i<arr.length;i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
				
		}
		System.out.println("max value is : " + max);
		
		
//Find Min value
		int min=arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i]< min) {
				min=arr[i];
			}
				
		}
		System.out.println("min value is : " + min);
	}

}
