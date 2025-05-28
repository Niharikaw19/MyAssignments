package week1.assignment2;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int count = 2;
		System.out.println("Enter the input:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(count < i) {
			int c = a + b;
			System.out.print(c + " ");
			count ++;
			a = b;
			b = c;
			
		}
	}

}
