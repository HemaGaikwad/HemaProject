package fileoperations;

import java.util.HashMap;

public class FrNr {
	public static void repeatedAndNonRepeated(String input)
	{
		HashMap<Character,Integer> countRepeat=new HashMap<Character,Integer>();
		char[] ch = input.toCharArray();
		for(char c:ch)
		{
			if(countRepeat.containsKey(c))
			{
				countRepeat.put(c, countRepeat.get(c)+1);
			}
			else
			{
				countRepeat.put(c, 1);
			}
		}
		
		for(char c:ch)
		{
			if(countRepeat.get(c)==1)
			{
				System.out.println("first non repeated char in "+input+" is "+c);
				break;
			}
		}
		
		for(char c:ch)
		{
			if(countRepeat.get(c)>1)
			{
				System.out.println("first repeated char in "+input+" is "+c);
				break;
			}
		}
	
	
	}

	public static void main(String[] args) 
	{
		repeatedAndNonRepeated("javay arya");
	}

}
