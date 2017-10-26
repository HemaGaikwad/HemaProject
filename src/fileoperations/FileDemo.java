package fileoperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo 
{
	public static void main(String[] args)
	{
		File f=new File("D:\\abc.doc");
		FileWriter fw=null;
		BufferedWriter bw=null;
		try 
		{
			fw=new FileWriter(f);
			bw=new BufferedWriter(fw);
			bw.write("hi,hello,how r u");
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(bw!=null)
				{
					bw.close();
				}
				if(fw!=null)
				{
					fw.close();
				} 
				
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
			
	}
}