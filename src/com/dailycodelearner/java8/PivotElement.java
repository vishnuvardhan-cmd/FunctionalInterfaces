package com.dailycodelearner.java8;

public class PivotElement {
	
	public static void main(String args[]) {
		
		int[] a = new int[] {1,5,5,3,5,6};
		
		int pivot=a.length/2;
		int b=0;
		int c=0;
		for(int i=0;i<pivot;i++) {
			b+=a[i];
		}
		
		for(int j=pivot+1;j<a.length;j++) {
			c+=a[j];
		}
		
		int d=b==c?pivot:0;
		System.out.println(d);
	}

}
