package javastring;

public class ToS
{
	int rn;
	String name;
	public ToS(int rn, String name)
	{
		this.rn=rn;
		this.name=name;
	}
	
	public String toString()
	{
		return rn+" "+name;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		ToS t=new ToS(11, "rakesh");
		ToS t1=new ToS(11, "rajesh");
		System.out.println(t);
		System.out.println(t1);
	}

}
