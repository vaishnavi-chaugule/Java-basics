package logicalpractice;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 17;
		boolean isPrime = true;
		
		for(int i=2; i<=num/2; i++) {
			
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime && num > 1)
			System.out.println(num + " is prime");
		
		else
			System.out.println(num + " is not prime");

	}

}
