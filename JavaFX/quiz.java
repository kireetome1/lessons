import java.util.Scanner;
public class quiz{
	public static void main (String[] args){
		System.out.println("######");
		System.out.println("GAME");
		System.out.println("######");
		System.out.println("PLAY GAME ");
		System.out.println(" 1.YES  2.NO");
		System.out.println("your answer: ");

		Scanner sc = new Scanner(System.in);
		int answer =sc.nextInt();
		if(answer== 1){
			System.out.println("Welcome");}
			else {
			System.out.println("BYE BYE");	
			return;
			}
		
		System.out.println();
		System.out.println("how old are you?");
		System.out.println("1.20   2.21   3.22");
//		System.out.println(2.22);
//		System.out.println(3.21);
		System.out.println("your answer: ");
		int answer1 =sc.nextInt();
		if(answer1== 2){
			System.out.println("NEXT STAGE");}
			else {
			System.out.println("you lose");	
			return;
			}
		System.out.println();
		System.out.println("Whats your gender?");
		System.out.println("1.Male   2.Female   3.Others");
		System.out.println("your answer: ");
		int answer2 =sc.nextInt();
		if(answer2== 1){
			System.out.println("you win!");}
			else {
			System.out.println("you lose");	
			return;
			}
	s}
}