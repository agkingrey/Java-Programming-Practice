//Austin Kingrey
public class InsertionSort {

	public static void main(String[] args) {
		//First I need to initialize my array
		int[] exArray = { 5, 3, 6, 1, 4, 9};
		
		//Here I will put my methods into use by calling them up here.
		insertionSort(exArray);
		printArray(exArray);
	}
		//Heres' my insertion sort method, using a nested while loop in my for loop
		public static int[] insertionSort(int[] A) {
			//this is how I set up my "looper"
			for(int i = 1; i < A.length; i++) {
				//The key will start at the first element
				int key = A[i];
				//Now I need to declare my sorted element
				int j = i -1;
				//Now I'm basically saying while the left variable is smaller, I need to swap!
				while (j>= 0 && A[j] > key) {
					//Swap time(first goes to second)
					A[j+1] = A[j];
					// I need a -- to be able to terminate the loop when all is finished.
				j--;
				}
				//now second goes to first
				A[j + 1] = key;
				
			}
			return A;
		}
		//This is my printer method That I called up top! 
		//It stops printing once it gets to the end of the array.
		public static void printArray(int[] A) {
			for(int i = 0; i <A.length; i++) {
				System.out.println(A[i]);
			}
		}
		
		
}
