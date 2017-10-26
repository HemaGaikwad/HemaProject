package fileoperations;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) 
	{
		HashMap<Character, Integer> hmap=new HashMap<Character,Integer>();
		
		String input="hi hello how r u";
		
		char[] ch = input.toCharArray();
		
		for(char c:ch)
		{
			if(hmap.containsKey(c))
			{
				hmap.put(c, hmap.get(c)+1);
			}
			else
			{
				hmap.put(c, 1);
			}
		}
		
		
		System.out.println(hmap);
		
	}

}
