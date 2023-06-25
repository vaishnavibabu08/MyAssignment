package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11; // Number of elements to print in the series

        // First two numbers of the series
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        // Print the first two numbers
        System.out.print(first + " " + second + " ");

        // Generate and print the rest of the series
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }

	}

}
