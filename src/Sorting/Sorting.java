package Sorting;
/*
 * Created by:
 * A template for implementing and measuring sorting algorithms
*/

import java.util.Random;

public class Sorting {
    
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
    
    
    //TODO, complete sorting method(s)
    public static void sort(int data[])
    {
    	
    }
    
    

    public static void main(String[] args) {
        
        int size  = 1000; //size of the array
        int range = 1000; //the range, values in the list will be 0 <= value < range 
        
        int list[] = new int[size]; //makes an array of size
        Random random = new Random(); //randomly make numbers
        for (int x = 0; x < list.length; x++)
        {
            list[x] = random.nextInt(range); //picks a random number in the range, and puts it in the list
        }
        //show(list); //shows the original list
        
        long startTime = System.currentTimeMillis();
        //different types of created sorting implementations
        
        //TODO, make, use, and measure various sorting methods
        sort(list);
        
        long elapsedTime = System.currentTimeMillis() - startTime;
        
        //System.out.println("--------------------------------------------------------------------------------------"); //spacing
        //show(list); //shows the sorted list
        System.out.println("Sorting algorithm took " + elapsedTime + " milliseconds to sort a list of " + size + " random numbers!");
    }
}