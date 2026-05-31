package arrays;
import java.util.Scanner;
//Given an array, and an element num the task is to find if num is present in the given array or not. If 
//present print the index of the element or print -1? 

public class FindArrayElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of array element:");
		int size=sc.nextInt();
		
		
		String[] arr = new String[size];
		
		System.out.println("enter num value:");
		String num=sc.next();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				num=arr[i];
				
				System.out.println("num is present.");
				System.out.println("and num found at index " + num);
			}
		}
		
		
		
		

	}

}
