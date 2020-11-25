import java.lang.*;

public class ArrayDemo {

    public static void main(String[] args) {
	int[] A = {1,2,3,4,5};
	//for(int a: A){
		//System.out.println(a++);
	//}

	for(int a: A){
		System.out.println(a);
	}

	/*
	int[] B = {1,2,3,4,5};
	for(int i=0;i<B.length;i++){
		System.out.println(B[i]++);
	}
	for(int b: B){
		System.out.println(b);
	}*/

	int[] C = new int[10];
	for(int i=0;i<A.length;i++){
		C[i] = A[i];
	}
	for(int c: C) {
		System.out.println(c);
	}
    }
}