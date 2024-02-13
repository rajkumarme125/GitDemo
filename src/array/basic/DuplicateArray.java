package array.basic;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		int arrSort[]= {1,2,2,3,3,4,5,5};
		removeDuplicateSortedArray(arrSort);

	}
	public static void removeDuplicateSortedArray(int a[]) {
		int temp[]=new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j]=a[i];
				j++;
			}	
		}

		for(int i=0;i<temp.length;i++) {
			System.out.println("temp["+i+"]: "+temp[i]);
		
			
		}
		
	}
	public static void removeDuplicateUNSortedArray(int a[]) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length-1;i++) {
			hs.add(i);
		}
		
		
	}

}
