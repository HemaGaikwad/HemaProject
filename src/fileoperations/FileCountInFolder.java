package fileoperations;

import java.io.File;

public class FileCountInFolder {

	public static void main(String[] args) 
	{
		File f=new File("D:/New folder/");
		String[] allFiles = f.list();
		for(String name:allFiles)
		{
			System.out.println(name);
		}
	}

}
