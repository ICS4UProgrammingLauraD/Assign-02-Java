Run.java



package pack3;
import java.util.Scanner;


final class Run {
	/**
	 *
	 * @throws IllegalStateException
	 *
	 *
	 */
	private Run() {
		throw new IllegalStateException("Cannot be instantiated");
	}

	/**
	 * The starting main() function.
	 *
	 * @param args No args will be used
	 */
	public static void main(String[]  args) {
		String inputString = null;
		System.out.print("Please enter your string : ");
		final Scanner scanner = new Scanner(System.in);
		inputString = scanner.nextLine();

		try {
			if (inputString.matches(".*\\d.*")) {
				throw new Exception("Invalid input");
			} else {
				System.out.println(maxRun(inputString));
			}
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

	/**
	 * This is the maxRun.
	 *
	 * @param str is good
	 * @return largestRun
	 */
	static int maxRun(final String str) {
		int largestRun = 1;
		int temp = 1;

		for (int word = 1; word < str.length(); word++) {
			if (str.charAt(word) == str.charAt(word - 1)) {
				++temp;
			} else {
				largestRun = Math.max(largestRun, temp);
				temp = 1;
			}
		}

		largestRun = Math.max(largestRun, temp);

    System.out.print("The max run is: ");
		return largestRun;
	}  
}