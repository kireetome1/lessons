class Student{
	public String name;
	public String teacher;
}
//public void sayHello(){
//	System.out.println("Hello! My name is"+ this.name);
//}

public class test2{
	public static void main(String[] args) {
//	System.out.println("名前:");
	System.out.println("Hello");
	Student student = new Student();
	student.name= "Yamada Taro";
	System.out.println( " Hello "+student.name);
	 System.out.println("i love coffee");
	 System.out.println();
	student.teacher="Masahiko tanaka";
	System.out.println("Hello " + student.teacher);
	System.out.println("i love matcha");
	System.out.println();
	System.out.println("Hello "+student.name+" student of "+student.teacher);
	
	}
}
