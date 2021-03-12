package demo;

public class Enum {
	public static void main(String args[])
	{
		int s=Mobile.REALME.getPrice(20000);
		System.out.println(s);
}
}

enum Mobile
{
	APPLE,SAMSUNG,REALME;
	
	public int getPrice(int price)
	{
		return price;
	}
	
}
