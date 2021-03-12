package demo;
import java.math.BigDecimal;

public class BigDecimalExample {
	public static void main(String args[])
	{
		BigDecimal B=new BigDecimal("0.5");
		BigDecimal B1=new BigDecimal("1235648.1234");
		BigDecimal Max,A;
		A=B.add(B1);
		Max=B.max(B1);
		System.out.println(A);
		System.out.println(Max);
	}
}
