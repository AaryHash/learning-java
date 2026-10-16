package sorts;

public class SelectionAsc {

	public static void main(String[] args) {
		// declare array, print original
		int arr[] = {6, 3, 2, 1, 5, 4};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		// sorting algorithm
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		// print sorted
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
