import java.lang.*;

public class RotationArray {

    public static void main(String[] args) {
	int[] A = {1,2,3,4,5,4,19,8,15,20,7};
	int temp=A[0];
	for(int a: A)
		System.out.print(a+",");
	System.out.println("");
	for(int i=1; i<A.length; i++){
		A[i-1]=A[i];	
	}
	A[A.length-1]=temp;
	for(int a: A)
		System.out.print(a+",");
    }
}