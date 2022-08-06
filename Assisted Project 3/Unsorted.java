package Array;

import java.util.Arrays;

public class Unsorted {
	public static int KthSmallest(Integer[] arr, int k) {

		Arrays.sort(arr);

		// will return kth smallest element in the sorted array

		return arr[k - 1]; // this will give you the smallest element

	}

	public static void main(String[] args) {

		Integer arr[] = new Integer[] { 128, -85, 30, 398, 66, -44, -31, 22 };

		int k = 4; /// finding 4th smallest element
		System.out.println("Kth Smallest Element is : " + KthSmallest(arr, k));

	}
}