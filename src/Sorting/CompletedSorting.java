package Sorting;
/*
 * Created by: Phillip Blake Adams
 * A template for implementing and measuring sorting algorithms
*/

import java.util.Arrays;
import java.util.Random;

public class CompletedSorting {
    
    //shows the list
    public static void show(int[] list)
    {
        int perRow = 10; //entries shown per row
        for (int x = 0; x < list.length; x++)
        {
            System.out.print(list[x] + "\t");
            if ((x + 1) % perRow == 0) //goes to a newline after "perRow" entries
            {
                System.out.println();
            }
        }
    }
    
    
    public static void bubbleSort(int data[])
    {
    	boolean sorted = false;
    	while(!sorted) //until it makes a pass where it doesn't move anything
    	{
    		sorted = true;
    		for(int i = 0; i < data.length - 1; i++)
    		{
    			if (data[i] > data[i + 1]) //swap the elements
    			{
    				sorted = false;
    				int temp = data[i + 1];
    				data[i + 1] = data[i];
    				data[i] = temp;
    			}
    		}
    	}
    }
    
    
    public static void mergeSort(int data[])
    {
    	int n = data.length;
    	if (n <= 2) //end of the recursion, base case
    	{
    		if ((data.length == 2) && (data[0] > data[1])) //if they are not in order, flip them
			{
				int temp = data[1];
				data[1] = data[0];
				data[0] = temp;
			}
    	}
    	else //break the list into two halves and merge them
    	{
    		int[] left = Arrays.copyOfRange(data, 0, (n + 1)/2);
    		int[] right = Arrays.copyOfRange(data, (n + 1)/2, n);
    		
    		mergeSort(left);
    		mergeSort(right);
    		
    		int leftCount = 0;
    		int rightCount = 0;
    		
    		while ((leftCount != left.length) || (rightCount != right.length))
    		{
    			if (leftCount == left.length) //the left side has already been through
    			{
    				data[leftCount + rightCount] = right[rightCount];
    				rightCount++;
    			}
    			else if (rightCount == right.length) //the right side has already been through
    			{
    				data[leftCount + rightCount] = left[leftCount];
    				leftCount++;
    			}
    			else if (left[leftCount] <= right[rightCount]) //the left side is smaller or equal (makes it stable)
    			{
    				data[leftCount + rightCount] = left[leftCount];
    				leftCount++;
    			}
    			else //the right side is smaller
    			{
    				data[leftCount + rightCount] = right[rightCount];
    				rightCount++;
    			}
    		}
    	}
    }
    
    public static void insertionSort(int data[])
    {
    	int i = 1; //the first element is already "sorted"
    	while (i < data.length) //go through the list
    	{
    		int placing = data[i];
    		int x = i - 1;
    		while (x != -1) //find where to place it
    		{
    			if (data[x] < placing) //place it after this x
    			{
    				break;
    			}
    			else
    			{
            		data[x + 1] = data[x]; //shift the values to the right
            		x--;
    			}
    		}
    		data[x + 1] = placing; //place x at its spot
    		i++;
    	}
    }
    
    //like insertion but sorts it in descending order
    public static void reverseInsertion(int data[])
    {
    	int i = 1;
    	while (i < data.length) 
    	{
    		int placing = data[i];
    		int x = i - 1;
    		while (x != -1) 
    		{
    			if (data[x] >= placing) //the key change is the comparison
    			{
    				break;
    			}
    			else
    			{
            		data[x + 1] = data[x];
            		x--;
    			}
    		}
    		data[x + 1] = placing;
    		i++;
    	}
    }
    

    public static void main(String[] args) {
        
        int size  = 100000; //size of the array
        int range = 100000; //the range, values in the list will be 0 <= value < range 
        
        int list[] = new int[size]; //makes an array of size
        Random random = new Random(); //randomly make numbers
        for (int x = 0; x < list.length; x++)
        {
            list[x] = random.nextInt(range); //picks a random number in the range, and puts it in the list
        }
        
        //show(list); //shows the original list
        
        long startTime = System.currentTimeMillis();
        //different types of created sorting implementations
        
        //various sorting methods
        //bubbleSort(list); //took 19 seconds for a size of 100,000
        //mergeSort(list); //took 25 milliseconds for a size of 100,000, 15.5 seconds for a size of 100,000,000
        //insertionSort(list); //took 3 seconds for a size of 100,000
        
        long elapsedTime = System.currentTimeMillis() - startTime;
        
        //System.out.println("--------------------------------------------------------------------------------------"); //spacing
        //show(list); //shows the sorted list
        System.out.println("Sorting algorithm took " + elapsedTime + " milliseconds to sort a list of " + size + " random numbers!");
    }
}