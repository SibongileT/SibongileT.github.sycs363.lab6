package howard.edu.sycs363.spring15.lab5;

public class IntegerArrayList 
{
	private int[] list_array = {};
	
	private int num_of_items=0;
	/*Default Constructor
	 * 
	 */
	public IntegerArrayList()
	{
	}
	/* Paramater Intializes the size of the array
	 * 
	 */
	public  IntegerArrayList(int initiallength)//Taking in inital array size from user
	{
		list_array= new int[initiallength];
	}
	/*
	 * Increases the size of the array by one, it also adds the new value
	 * to the end of the array
	 */
	public void add(int value)// Adds an integer value to the end of the list or array
	{
		int arraySize = list_array.length;// Set arraySize to the length of the list
		int[] temp = list_array;
		list_array = new int[++arraySize]; 
		
		for (int i=0; i<arraySize-1; i++)
		{
			list_array[i]=temp[i];
		}
		//Add value to end of the list
		list_array[arraySize-1]= value;
		num_of_items++;
	
	}
	/*
	 * Adds a value to the array at a given index
	 */
	public void add(int index, int value)//Taking in the  value and index for the array
	{
		if( index >= list_array.length)
		{
			throw new ArrayIndexOutOfBoundsException("The array is out of bounds");
		}
		list_array[index] = value;
		num_of_items++; // increment through the number of items
		
	}
	/*
	 * Gets the value at the given index
	 * 
	 * @return	value at given index
	 */
	public int get(int index)
	{
		if( index >= list_array.length)// If the index is greater than the array length output a comment
		{
			throw new ArrayIndexOutOfBoundsException("The array is out of bounds");
		}
		return list_array[index]; //returning the value at the index being taken
		
		
	}
	/*
	 * indexOf tries to get the 1st index of the given
	 * 
	 * @return	the first index where the given value is found
	 * if given value not found return -1
	 */
	public int indexOf(int value)// trying to get index of the first value taken in
	{
		 for (int i= 0; i < list_array.length; i++)
		 {
			 if( list_array[i] == value)
			 {
				 return i;
			 }
		 }
		return -1; 
	}
	/*
	 *  isEmpty checks if the array is empty
	 * 
	 * @return true if empty
	 */
	public  boolean isEmpty()
	{
		if(num_of_items == 0)
		{
			return true;// returns true when the array is empty
		}
	 return false;//returns false when the array isn't empty
	}
	public int remove(int index)// remove and return value at index position and reduces list size
	 {
		 if(index >= list_array.length)
		 {
			 throw new ArrayIndexOutOfBoundsException("The array is out of bounds");
		 }
		 
		 int arraySize = list_array.length;
		 int[] temp = list_array;
		 list_array= new int[--arraySize];//shrinking the list by 1
		 
		 int x=0;
		 
		 for(int i=0 ; i< arraySize; i++)
		 {
			 if(i != index)
			 {
				 list_array[x++]= temp[i];
			 }
		 }
		 num_of_items--;
				 
		 return temp[index];
	 }
	}

/*@Sibongile Toure @02691179 lab5
*
*/