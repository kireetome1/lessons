import java.util.Random;

public class aaa {

	public static void main ( String[] args ) {
	       Random random = new Random();
	       
	       String[] subjects = { "alisha ", "mamata ", "jenny " };
	       String[] places = { "met her boyfriend ", "had a meal ", "broke up " };
	       String[] done = { "secretly in the park ", "with her famil y", "her 1st bf " };
	       
	       String story = "";
	       int num = random.nextInt(3);
	       story = story + subjects[ num ];
	       
	       num = random.nextInt(3);
	       story = story + places[ num ];
	       
	       num = random.nextInt(3);
	       story = story + done[ num ];	
	       
	       System.out.println( story );
	     }
}


