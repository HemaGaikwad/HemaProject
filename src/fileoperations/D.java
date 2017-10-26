package fileoperations;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class D {

	public static void main(String[] args)
	{
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		String input="Hi*&^123heLLo";
		char[] ch = input.toCharArray();
		for(char c:ch)
		{
			if(h.containsKey(c))
			{
				h.put(c, h.get(c)+1);
			}
			else
			{
				h.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> s1 = h.entrySet();
		System.out.println("Duplicate characters in:"+input);
		for(Entry<Character, Integer> c:s1)
		{
			if(h.get(c)>1)
			{
				System.out.println(c+"------"+h.get(c));
			}
		}

	}

}
