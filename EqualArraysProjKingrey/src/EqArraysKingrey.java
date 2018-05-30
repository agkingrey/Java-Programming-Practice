
public class EqArraysKingrey {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4};
		int[] array2 = {1,2,3,4};
		int[] array3 = {1,2,3,4,5};
		int[] array4 = {4,3,2,1};
		
		if(equalArrays(array1,array2)==true)
		{
			System.out.println("Array 1 and 2 are equal");
		}
		if(equalArrays(array1,array3)==false)
		{
			System.out.println("Array 1 and 3 are not equal");
		}
		if(equalArrays(array1,array4)==false)
		{
			System.out.println("Array 1 and 4 are not equal");
		}
	}
	
	public static boolean equalArrays (int[] ar, int[] ar2)
	{
		if(ar.length == ar2.length)
		{
			for(int i = 0; i <ar.length; i++)
			{
				if(ar[i] == ar2[i] )
				{
					
					return true;
				}
			}
		}
		
		return false;
	}

}
