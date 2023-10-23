package exceptionHandling;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
		int index = 5; // This will cause an ArrayIndexOutOfBoundsException

		try {
			int value = numbers[index];
			System.out.println("Value at index " + index + ": " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
