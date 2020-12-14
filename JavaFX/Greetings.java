import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name,
				msg;System.out.println("Enter your name: ");
				name=input.nextLine();
				System.out.println("Enter your msg: ");
				msg=input.nextLine();
				System.out.println(msg+name);
				return;
	}

}
