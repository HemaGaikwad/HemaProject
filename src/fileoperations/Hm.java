package fileoperations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hm 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		h.put("A", 1);
		h.put("B", 2);
		h.put("C", 3);
		h.put("D", 4);
		
		
		Set<Entry<String, Integer>> s = h.entrySet();
		Iterator<Entry<String, Integer>> itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> m=itr.next(); 
			System.out.println(m.getKey()+"-------------"+m.getValue());
			if(m.getKey().equals("A"))
			{
				m.setValue(56);
			}
		}
		System.out.println(h);
	}

}
