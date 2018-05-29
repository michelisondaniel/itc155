// Dan Micheli
// 5/29/18
// Assignment 7


public class SelectionSort {

	public static void main(String[] args) {
		
		int [] numbers = {13, 19, 34, 21, 56, 96, 45, 68, 78, 11, 35, 69};
		
		selectionSort(numbers);
		System.out.println(isSorted(numbers));
		print(numbers);
		

	}
	
	// sorting algorithm
	// sort the elements of the array into a sorted order placing the largest numbers in the back
	
	public static void selectionSort(int[] a) {
		// find the index of the largest element in the arrays
		for (int i = a.length - 1; i > 0; i--) {
			int largest = i;
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] > a[largest]){
					largest = j;
				}
			}
			
			swap(a, i, largest); // place the largest to the back
			
		}
		
	}
	
	// swap a[i] with a[j]
	
	public static void swap(int[] a, int i, int j) {
		if(i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
		}
			
	}
	
	// return true if the array is already sorted
	
	public static boolean isSorted(int[] a) {
		
		for (int i = 0; i < a.length - 1; i++) {
			if(a[i] > a[i + 1]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void print(int[] a) {
		for(Integer i : a) {
			System.out.print(i + " ");
		}
	}

}
