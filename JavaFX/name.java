import java.util.Scanner;

public class Ciaoscanner {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("input your name:");
	String name = sc.nextLine();
	for(int i=1; i<=10; i++){
	System.out.println(i+ "message from "+ name);
	}
}
}