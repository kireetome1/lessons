class Studentcard {
	int id;//field hence member
	String name;

	public void printinfo() {
		System.out.println(this.id + "" + this.name);
	}
}

class Istudentcard extends Studentcard {
	String nationality; // country
}

public class lll {

	public static void main(String[] args) {
		Istudentcard a = new Istudentcard();
		a.id = 2345;
		a.name = "JOHN SMITH";
		a.nationality = "england";
		a.printinfo();

	}

}