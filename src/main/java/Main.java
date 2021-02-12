import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type something:");
		String input = scanner.nextLine();
		System.out.println("You entered: " + input);
		if (StringUtils.isNumeric(input)) {
			System.out.println(input + " is a numeric string!");
		} else {
			System.out.println(input + " is not a numeric string.");
		}
		System.out.println("Your string with capitalization flipped: " + StringUtils.swapCase(input));
		System.out.println("Your string, reversed: " + StringUtils.reverse(input));
	}
}
