import java.lang.*;

public class Patterns {

    public static void main(String[] args) {
	int n = 5;
	//int count = 0;
	for(int i=0; i<5; i++){
		for(int j=0; j<5; j++) {
			//count++;
			//System.out.format("%02d ", count);
			if(j>=5-i-1) System.out.print("* ");
			else System.out.print("  ");
			
		}
		for(int k=0; k<5; k++) {
			if(k<i) System.out.print("* ");
			else System.out.print("  ");
			
		}
		System.out.println("");
	}
	for(int i=0; i<5; i++){
		for(int j=0; j<5; j++) {
			if(j>=i+1) System.out.print("* ");
			else System.out.print("  ");
			
		}
		for(int k=0; k<5; k++) {
			if(k<5-i-2) System.out.print("* ");
			else System.out.print("  ");
			
		}
		System.out.println("");
	}
    }
}
