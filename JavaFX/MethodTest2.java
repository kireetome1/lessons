public class MethodTest2{
	public static void main(String[] args)	{
	hello1("tanakasensei");
	hello("yamamotosensi");
	hello2("yosinosensei");
	}
	public static void hello1(String name){
	System.out.println("hello!"+ name);
	}
		public static void hello(String name){
	System.out.println("hello!"+name);
	}
	public static void hello2(String name){
	System.out.println("hello!"+name);
	
	if(name.equals("yosinosensei")) {
		System.out.println("cao!"+ name);
	}
	else {
	      System.out.println("hello!"+ name);
	      
			

}
	}
}