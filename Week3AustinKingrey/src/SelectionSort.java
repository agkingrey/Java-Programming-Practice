//Austin Kingrey
public class SelectionSort {
	public static void main(String[] args) {
	
		//First I need to declare my array to sort
		int[] exArray = { 7, 3, 5, 9, 2, 1, 4};
		
		// I'll call my methods up here in main!
		Sort(exArray);
		print(exArray);
		
	}	
	//Here i need to create a method to find the min value!
		public static int[] Sort(int[] A) {
			//My looper
			for (int i = 0; i < A.length; i++){
				//I need a place to store where my number I'm testing is at in the array
				int minIndex = i;
					//My second for loop will be comparing my numbers to find the min value J is the value of my innner loop
					for (int j = i + 1; j < A.length; j++) {
						if (A[j] < A[minIndex]) {
							minIndex = j;
						}
					}
				//Here I'm doing to official "flip" between the two numbers. I'm basically setting
				// temp to my min index, so I can clear it out and flip it, then I put the temp where A[i] goes
				int temp = A[minIndex];
				A[minIndex] = A[i];
				A[i] = temp;
			}
			return A;
		}	
		//And now just for my print method!
			public static void print(int[] A) {
				for (int i = 0; i < A.length; i++){
					System.out.println(A[i]);
				
			}
			
			
			
		}
}
	
	
	
	

	

