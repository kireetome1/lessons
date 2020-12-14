public class whileif {

	public static void main(String[] args) {
		boolean doorClose;
		doorClose = true;
		
		int i = 0;
		
		while(doorClose == true) {
			System.out.println("knockwhileentering");
			System.out.println("wait 1 minute");
			i = i + 1;
			if (i>4) {
				//break;
				doorClose = false;
			}
			
		}
		System.out.println("work done");
	}

}