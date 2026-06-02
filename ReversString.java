package stringprograms;
import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		
		String reversed = new StringBuilder(s).reverse().toString();
		System.out.println("Reversed String: " + reversed);
		
	}

}
