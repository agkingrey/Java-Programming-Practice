
/**
 * @author DaKing This will build a stack and have the necessary methods for one
 */
public class Stack {

	// set my variables here
	// I will use x to keep track of my percentage as I push and pop
	private int size;
	private int top;
	private int array[];
	final private int SIZE = 100;
	int x = 0;

	// constructor

	/**
	 * @param s
	 *            wwill be the max size of my stack
	 */
	public Stack(int s) {
		size = s;

		array = new int[size];
		top = -1;
	}

	// remove one off the top
	
	/**
	 * @return will return the top minus 1 of the array
	 * this will remove one element from the stack
	 */
	public int pop() {
		if (size < 1) {
			throw new IndexOutOfBoundsException("Stack size: " + size);
		} else {
			// here we will remove a percentage from x
			x--;
			return (array[top--]);
		}
	}

	// push one on the top of the stack
	
	/**
	 * insert one on the top of the stack
	 */
	public void push() {
		if (size > SIZE) {
			throw new IndexOutOfBoundsException("Stack size: " + size);
		} else {
			x++;
			array[++top] = x;
		}
	}

	// return size if needed
	
	/**
	 * @return will return the size of the stack
	 */
	public int size() {
		return size;
	}

	// returns the top value
	
	/**
	 * prints the top element of the stack
	 */
	public void top() {
		System.out.print(array[top]);
	}

	// checks if stack is empty
	
	/**
	 * @return will return whether the stack is empty or full
	 */
	public boolean isEmpty() {
		if (array.length < 0) {
			return true;
		} else
			return false;
	}

	// prints out the percentage of the stack
	
	/**
	 * Prints out what the top element of the array is using x
	 */
	public void Print() {

		System.out.print(x + " ");

		System.out.print("percent discount \n");
	}
}
