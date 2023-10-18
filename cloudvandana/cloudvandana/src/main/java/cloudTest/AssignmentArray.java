package cloudTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignmentArray 
{
	    public static void main(String[] args) 
	    {
	        
	        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

	        //converting the array into list
	        List<Integer> list = new ArrayList<>(array.length);
	        Collections.addAll(list, array);

	        
	        Collections.shuffle(list);

	        // Converting the list to array 
	        list.toArray(array);

	        // Printing the shuffled array
	        for (int value : array)
	        {
	            System.out.print(value + " ");
	        }
	    }
	}


