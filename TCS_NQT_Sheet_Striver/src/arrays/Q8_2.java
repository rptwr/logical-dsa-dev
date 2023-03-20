package arrays;

public class Q8_2 {
	public static void rotateArray(int[] arr, int k) {
		int n = arr.length;
		int[] rotatedArr = new int[n];

		// Copy the last k elements of arr into the first k elements of rotatedArr
		for (int i = 0; i < k; i++) {
			rotatedArr[i] = arr[n - k + i];
		}

		// Copy the first (n-k) elements of arr into the last (n-k) elements of
		// rotatedArr
		for (int i = k; i < n; i++) {
			rotatedArr[i] = arr[i - k];
		}

		// Copy the rotated array back to the original array
		for (int i = 0; i < n; i++) {
			arr[i] = rotatedArr[i];
		}
	}

	// Output: 3 4 5 1 2

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//		int k = 3;
		rotateArray(arr, k);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}


