import java.util.Scanner;
public class Warmup{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("input data: ");
int data = sc.nextInt();
	String[] data1 = getData();
	showData(data1);

	}

private static void showData(String[] data1) {
	System.out.println("Showdata");
}

private static String[] getData() {
	System.out.println("getData");
	return "Aloha";
}
}