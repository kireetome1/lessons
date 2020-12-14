import java.util.Scanner;
class Teacher
{
	String name ;
	String msg ;


	Teacher(String name, String msg)
	{
		this.name = name;
		this.msg = msg;
	}

	void hello(String strName)
	{

		System.out.println( name + "先生。" + strName +","+ msg );
	}
}


public class People 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("私は");
		String strName = sc.nextLine();

		Teacher Tanaka = new Teacher("田中", "お元気ですか？");
		Tanaka.hello(strName);

		Teacher Yamamoto = new Teacher("山本" , "出席足りてましか。");
		Yamamoto.hello(strName);

		Teacher Yoshino = new Teacher("吉野", "ALOHA");
		Yoshino.hello(strName);
	}
}