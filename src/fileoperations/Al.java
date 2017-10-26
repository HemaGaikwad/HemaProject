package fileoperations;

import java.util.ArrayList;

public class Al {

	public static void main(String[] args) {
		String[] s=new String[9];
		s[0]="Ravi";
		s[1]="Raki";
//		s[2]=new Integer(10);
		
		ArrayList al=new ArrayList();
		al.add("Ravi");
		al.add(new Integer(10));
		
		
		String name1=(String) al.get(0);
		String name2=(String) al.get(1);
		System.out.println(al.get(1));
	}

}
