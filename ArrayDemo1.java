import java.lang.*;

public class ArrayDemo1 {

    public static void main(String[] args) {
	int[] A = {1,2,3,4,5};
	int[] B = new int[A.length];
	for(int i=A.length-1, j=0; i>=0; i--, j++){
		B[j] = A[i];
	}
	for(int b: B)
		System.out.println(b);
    }
}