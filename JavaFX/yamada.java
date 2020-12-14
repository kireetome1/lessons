class Student{
	public String name;
}
public void sayHello(){
	System.out.println("Hello! My name is"+ this.name);
}

public class yamada{
	public static void main(String[] args) {
	System.out.println("名前:");
	Student yamada = new Student();
	yamada.name= "Yamada Taro";
	System.out.println(yamada.name+ "Hello");
	// System.out.println("");
	}
}