
/**
 * @author DaKing
 * This queue program will build a queue and have various methods for the queue
 */
public class Queue {
	
	//variable declaration for the max size, front and rear of q, and the number of items
	private int maxSize;
	private int[] qArray;
	private int front;
	private int rear;
	private int items;
	
	//constructor
	/**
	 * @param inputSize will set the max size
	 * This will build a new queue
	 */
	public Queue(int inputSize)
	{
		maxSize = inputSize;
		qArray = new int[maxSize];
		front = 0;
		rear = -1;
		items = inputSize;
	}
	//insert items at rear
	
	/**
	 * @param x will be what I add to the queue
	 * This inserts one more to the end of the queue
	 */
	public void insert(int x)

	{
		//this will take car of the wrap around
		if (rear == maxSize -1)
		{
			rear = -1;
		}
		qArray[++rear] = x;
		items++;
	}
	
	//remove item from front of queue
	/**
	 * @return front plus 1
	 *This will remove 1 element from my queue 
	 */
	public int remove()
	{
		//set a temp value to the second value from the front of qarray
		int temp = qArray[front++];
		
		//wrap around management
		if(front == maxSize)
		{
			front = 0;
		}
		items --;
		return temp;
	}
	
	//testing whether que is empty
	
	/**
	 * @return will return a boolean whether the queue is empty
	 * This will let us know whether the q is empty
	 */
	public boolean isEmpty()
	{
		if(items == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//seeing size of que
	
	/**
	 * @return will return the size of the queue
	 */
	public int size()
	{
		return items;
	}
	
	//peeking front
	
	/**
	 * @return will return the front element of the queue
	 */
	public int peekFront()
	{
		return qArray[front];
	}
	
	//printing the que
	
	/**
	 * This will print the elmements of the queue out
	 */
	public void print()
	{
		for(int i = 0; i < qArray.length; i++)
		{
			System.out.println(qArray[i]);
		}
	}
	

}
