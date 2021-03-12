package demo;
import java.util.Scanner;
import java.lang.*;

public class Calculator {
	public static void main(String args[])
	{
		String s1="Hello";
		String s2="Logi";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Option:");
		int n=sc.nextInt();
		int len=s2.length();
		
		switch(n)
		{
		case 1:
			String rev="";
			for(int i=len-1;i>=0;i--)
			{
			rev=rev + s2.charAt(i);
			}
			System.out.println(rev);
		    break;
		case 2:
			String sub=s2.substring(1);
			System.out.println(sub);
			break;
		case 3:
			
			String app=s1 + " Everyone";
			System.out.println(app);
			break;
		default:
			System.out.println("Wrong Input");
		}
	}
}

