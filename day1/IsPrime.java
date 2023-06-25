package week1.day1;

public class IsPrime {

	public static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		 if (number <= 1) {
	            return false;
	        }
	        
	        for (int i = 2; i < number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        int number = 20; // Change this number to check for a different value
	        
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	}

}
