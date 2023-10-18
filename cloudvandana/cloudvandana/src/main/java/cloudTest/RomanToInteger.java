package cloudTest;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger 
{
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a Roman number: ");
	        String inputRomanNumber = scanner.nextLine().toUpperCase();

	        int result = romanToInt(inputRomanNumber);

	        System.out.println("Roman numeral " + inputRomanNumber + " is equal to " + result);

	        scanner.close();
	    }

	    public static int romanToInt(String s) 
	    {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) 
	        {
	            int currentValue = romanMap.get(s.charAt(i));

	            if (currentValue < prevValue) 
	            {
	                result -= currentValue;
	            } else 
	            {
	                result += currentValue;
	            }

	            prevValue = currentValue;
	        }

	        return result;
	    }
}

	



