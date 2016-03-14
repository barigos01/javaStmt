package array;

public class MaxMin {
	private int max, min;

	public void setMaxMin(int[] arr) {
		int tempMax = arr[0], tempMin = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > tempMax) {
				tempMax = arr[i];
			}
			if (arr[i] < tempMin) {
				tempMin = arr[i];
			}
		}
		
		this.max = tempMax;
		this.min = tempMin;
	}

	@Override
	public String toString() {
		return "MaxMin [최대값=" + max + ", 최소값=" + min + "]";
	}
	
}
