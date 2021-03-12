package demo;
import java.util.Scanner;
import java.lang.*;


public class BuilderCalculator {
		public static void main(String args[])
			{
				StringBuilder s1=new StringBuilder("Hello");
				String s2="Logi";
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Option:");
				int n=sc.nextInt();
				
				switch(n)
				{
				case 1:
					StringBuilder sb=new StringBuilder();
					sb=s1.reverse();
					System.out.println(sb);
				    break;
				case 2:
					String sub=s2.substring(1,3);
					System.out.println(sub);
					break;
				case 3:				
					StringBuilder app=new StringBuilder();
					app=s1.append(" Everyone");
					System.out.println(app);
					break;
				case 4:				
					System.out.println(s1.length());
					break;
				case 5:
					System.out.println(s1.indexOf("l"));
					break;
				case 6:
					System.out.println(s2.charAt(2));
					break;
				case 7:
					StringBuffer sb1=new StringBuffer(s1.replace(1, 5, "ii"));
					System.out.println(sb1);
					break;
				case 8:
					StringBuffer sb2=new StringBuffer(s1.delete(1,5));
					System.out.println(sb2);
					break;
				default:
					System.out.println("Wrong Input");
				}
			}
		

}
