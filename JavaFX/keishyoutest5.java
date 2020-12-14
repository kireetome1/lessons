class Creature5 {
	String kind;
	String voice;
	String maxSpeed;

	public Creature5() {
		System.out.println("what is it?");
	}

	void action() {
		System.out.println(this.kind + " is very dangerous");
		System.out.println(this.voice + " is its sound");
		System.out.println("its speed is" + this.maxSpeed + "km/hrs");
	}
}

class Horse5 extends Creature5 {
	public Horse5() {
		System.out.println("its horse");
		this.kind = "Thoroughbred";
		this.voice = "hehee";
		this.maxSpeed = "77";
	}

	void run(int km) {
		System.out.println(km + "km/hr is its run speed");
	}
}

class Bird5 extends Creature5 {
	public Bird5() {
		System.out.println("its bird");
		this.kind = "crow";
		this.voice = "ka-ka";
		this.maxSpeed = "59";
	}

	void fly(int km) {
		System.out.println(km + "km/hr is its run speed");
	}
}

class Fish5 extends Creature5 {
	public Fish5() {
		System.out.println("its fish");
		this.kind = "shark";
		this.voice = "....";
		this.maxSpeed = "50";
	}

	void swim(int km) {
		System.out.println(km + "km/hr is its run speed");
	}
}

public class keishyoutest5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Horse5 horse1 = new Horse5();
		//System.out.println("its breed is:"+horse1.kind);
		//System.out.println("it speaks like:"+horse1.voice);
		//System.out.println("its runspeed is:"+horse1.maxSpeed);
		horse1.action();
		horse1.run(10);
		System.out.println();
		Bird5 bird1 = new Bird5();
		bird1.action();
		bird1.fly(20);
		System.out.println();
		Fish5 fish1 = new Fish5();
		fish1.action();
		fish1.swim(5);
	}

}
