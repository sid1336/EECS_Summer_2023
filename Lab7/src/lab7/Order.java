package lab7;

import java.util.Arrays;

public class Order {
	private Child[] listofChildren;
	private int numberofChildren;
	
	public Order()
	{
		this.listofChildren = new Child[0];
		this.numberofChildren = 0;
	}
	
	public int getNumofChilds() {
		return this.numberofChildren ;
	}
 
	public void addChildtoOrder(Child c1) {
		if (this.listofChildren.length < 5)
		{
			Child[] array = this.listofChildren;
			array = Arrays.copyOf(array, array.length + 1);
			array[array.length -1] = c1;
			this.listofChildren = array;
			this.numberofChildren++;
			
		}
		
		
	}

	public Child[] removeAnElement(Child[] arr, int index)
	{
		if (arr == null || index < 0 || index >= arr.length)
		{
			return arr;
		}
		Child[] anotherArray = new Child[arr.length -1];
		for (int i = 0, j = 0; i < arr.length; i++)
		{
			if (i ==index)
			{
				continue;
			}
			anotherArray[j++] = arr[i];
		}
		return anotherArray;
	}
	public void removeChildfromOrder(Child c2) {
		int z = Arrays.asList(this.listofChildren).indexOf(c2);
		if (z != -1)
		{
			this.listofChildren = this.removeAnElement(this.listofChildren, z);
			this.numberofChildren--;
		}
	}
		
	public Child[] getChilds()
	{
		return this.listofChildren;
	}
	public String toString()
	{
		return "The order contains " + this.numberofChildren + " Childs";
	}
	
		


	
	

}