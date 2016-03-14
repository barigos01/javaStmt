package forloop;

import java.util.Arrays;

public class MaxIn {
	private int[] arr;
	private int max, min;
	
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		max = 0; 
		min = 100;
		
		for (int i = 0; i < arr.length; i++) {			
			if (arr[i]>max) {
				max = arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		
		this.arr = arr;
	}
	
	@Override
	public String toString() {
		return "MaxIn [arr=" + Arrays.toString(arr) + ", max=" + max + ", min=" + min + "]";
	}
	
	
}
