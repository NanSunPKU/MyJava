import java.lang.*;
import java.util.*;

class KeyBoard
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter 2 numbers:");
		a = s.nextInt();
		b = s.nextInt();
		c = a + b;
		System.out.println("sum is: " + c);
	}
}