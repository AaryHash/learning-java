package sorts;

public class InsertionAsc {

	public static void main(String[] args) {
		// declare array, print original
		int arr[] = {6, 3, 2, 1, 5, 4};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		// sorting algorithm
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		// print sorted
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
