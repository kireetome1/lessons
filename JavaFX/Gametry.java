import java.util.Random;
import java.util.Scanner;

public class Gametry {
	public static void main(String[] args){
	Random random = new Random();
	Scanner sc =new Scanner(System.in);
	int num=0;
	while (true) {
		num++;
		
	int target = random.nextInt(10);
	System.out.println("your answer: ");
	int answer =sc.nextInt();
	if(answer== target){
	System.out.println("you win!");
	System.out.println("you win in "+num+" times");
	break;
	}
	else {
	System.out.println("you Lose"+ " correct answer is: " +target);
	}
	
	/*	answer = sc.nextInt();
	while(answer.equals("you Lose"));
	return;
*/	}
	}
}