import java.lang.*;

public class CommandLine{

	public static void main(String args[]){
		double sum=0;
		for (String s: args)
			sum += Double.parseDouble(s);
		System.out.println(sum);
	}

}

