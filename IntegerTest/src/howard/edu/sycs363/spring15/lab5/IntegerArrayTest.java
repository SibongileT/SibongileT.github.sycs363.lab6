package howard.edu.sycs363.spring15.lab5;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerArrayTest {

	/*
	 * Test to add values to a list of numbers that may be added
	 */
	@Test
	public void testAdd() {
		IntegerArrayList list = new IntegerArrayList();
		//Try by adding three numbers to the list
		list.add(4);
		list.add(19);
		list.add(25);
		
		//Tests
		assertEquals("The 1st number in the list should be 4", 4, list.get(0));
		assertEquals("The 2nd number in the list should be 19", 19, list.get(1));
		assertEquals("The 3rd number in the list should be 25", 25, list.get(2));
	}

	
	/*
	 * Test adding numbers to a list specifying both the value to be added and the index
	 */
	@Test
	public void testAddInt() {
		IntegerArrayList list = new IntegerArrayList(20);
		
		// Add numbers at index 4 and 19
		list.add(4, 15);
		list.add(19, 20);
		
		//Tests
		assertEquals("The number at index 4 should be 15", 15, list.get(4));
		assertEquals("The number at index 19 should be 20", 20, list.get(19));
		
		try
		{
			list.add(25, 6);
			fail("The index provided is out of bounds.");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			// expected behavior
		}
	}

	/*
	 * Test should get numbers from the list
	 */
	@Test
	public void testGet() {
		IntegerArrayList list = new IntegerArrayList();
		// Add numbers to list
		list.add(2);
		list.add(9);
		assertEquals("The 2nd number in the list is 9", 9, list.get(2));
		
		try
		{
			// Try to get a number from an index that is out of bounds
			list.get(12);
			fail("The index provided is out of bounds");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			// expected behavior
		}
	}

	/*
	 * Test to get the index of a value that may be in the list
	 */
	@Test
	public void testIndextOf() {
		IntegerArrayList list = new IntegerArrayList();
		list.add(1);
		list.add(12);
		list.add(10);
		
		assertEquals("The first index of the value 12 should be 1", 1, list.indexOf(12));
		// if the item is not in the list, IndexOf should return -1
		assertEquals("If the value id not in the list the index should return -1", -1, list.indexOf(30));
	}

	/*
	 * Test to see if a list is empty
	 */
	@Test
	public void testIsEmpty() {
		IntegerArrayList list = new IntegerArrayList();
		// Newly created lists should be empty
		assertEquals("The list should be empty because it's a new list", true, list.isEmpty());
		list = new IntegerArrayList(20);
		assertEquals("The list should be empty because it's a new list", true, list.isEmpty());
		
		// Removing the last item in a list should cause subsequent IsEmpty calls to return true
		list.add(24);
		assertEquals("The list should'nt be empty because a number was just added", false, list.isEmpty());
		list.remove(0);
		assertEquals("The list should be item since the last item was removed", true, list.isEmpty());
		
	}
	
	/*
	 * Test how to remove items from the list
	 */
	@Test
	public void testRemove() {
		// Add and remove numbers from list then check the state of the list
		IntegerArrayList list = new IntegerArrayList();
		list.add(2);
		list.add(32);
		list.remove(1);
		list.add(15);
		assertEquals("The 2nd number in the list will be 15 since we remove 32", 30, list.get(1));
		list.add(30);
		list.add(16);
		list.remove(2);
		assertEquals("The 3rd number in the list will be 16 since we remove 30", 60, list.get(2));
		
		try
		{
			
			list.remove(20);
			fail("The index provided is out of bounds.");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			// expected behavior
		}
	}

}
