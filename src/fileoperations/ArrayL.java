package fileoperations;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		String s="Ka";
		al.add("Karnataka");
		al.add("Kanya Kumari");
		al.add("AP");
		for(String t:al)
		{
			if(t.contains(s))
			{
				System.out.println(t);
			}
		}
	}
}
