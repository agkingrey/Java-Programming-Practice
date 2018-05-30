//Austin Kingrey
public class BubbleSort {
	public static void main(String[] args){
		
		//First I will declare my array
		int[] exArray = { 9, 4, 1, 3, 19, 12};
		
		//Then I call my methods up here to modify my array
		sort(exArray);
		print(exArray);
		
	}
		//I first need to make my outer loop with variable i using array A
		public static int[] sort(int[] A) {
			//my looper
			for (int i = 0; i < A.length; i++) {
				//This is my inner loop comparing the elements
				for( int j= 0; j <A.length; i++){
				//I have to compare the element to the right and also make the index bigger by 1
				//My if statement is basically saying if left is bigger than right store the number in temp to swap soon
					if (A[j] > A[j+1]) {
						//Time to flip the elements, similar to the other sorts
						int temp = A[j + 1];
						A[j + 1] = A[j];
						A[j] = temp;
					}
				}		
			}	
			return A;
		}
			//Printer Method, same as the other sorts
			public static void print(int[] A) {
				for (int i = 0; i < A.length; i++) {
					System.out.println(A[i]);
				}
			}
	
	
	
	
	
	
	
	
	
	
	
	
}
