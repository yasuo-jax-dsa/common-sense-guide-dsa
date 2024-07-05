package org.example.chapter2;

public class BinarySearch {

	public static void main(String[] args) {
		var target = 5;
		var values = new int[] { 5 };
		System.out.println(doSearch(values, target));
	}

	private static int doSearch(int[] values, int target) {
		int upperBound = values.length - 1;
		int lowerBound = 0;
		while (upperBound >= lowerBound) {
			int middleIndex = (upperBound + lowerBound) / 2;
			if (target > values[middleIndex]) {
				lowerBound = middleIndex + 1;
			} else if (target < values[middleIndex]){
				upperBound = middleIndex - 1;
			} else if (target == values[middleIndex]) {
				return middleIndex;
			}
		}
		return -1;
	}

}
