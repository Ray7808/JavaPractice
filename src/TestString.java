import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String string = scanner.nextLine();
		if (string.equals("scissors")) {
			System.out.println("buy");

		} else {
			System.out.println("Don't buy");
		}
	}
}
