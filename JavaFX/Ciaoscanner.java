import java.util.Scanner;

public class Ciaoscanner {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("input your name:");
	String name = sc.nextLine();
	System.out.println("input your msg:");
	String msg = sc.nextLine();
	for(int i=1; i<=10; i++){
	System.out.println(i+"."+ msg + " message from "+ name);
	}
}
}