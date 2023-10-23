package exceptionHandling;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
		int index = 6; 

		try {
			int value = numbers[index];
			System.out.println("Value at index " + index + "--> " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
			
		}

		System.out.println("Program continues after exception handling.");
	}
}
