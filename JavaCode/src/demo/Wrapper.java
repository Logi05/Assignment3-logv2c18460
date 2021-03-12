package demo;

public class Wrapper {
	public static void main(String args[])
	{
	int i=10;
	int j=5;
	Integer s=Integer.valueOf(i);			//Boxing
	Integer b=s;							//AutoBoxing
	
	
	Integer d=Integer.valueOf(j);
	int k=d.intValue();					//unboxing
	int l=j;
	int in=b;							//AutoUnboxing
	
	System.out.println(s+" "+k);
	System.out.println(b+" "+in);
}
}

