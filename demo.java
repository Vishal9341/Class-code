
public class demo {
	public static void main(String[] args) {
		Person P1=new Person ();
		P1.name="shashwat";
		P1.age=19;
		System.out.println(P1.age+" "+P1.name);
		P1.walk();
		P1.eat();
		
	}
	
}
	
class Person{
	String name;
	int age;
	void walk() {
		System.out.println(name+"is walking");
	}
	void eat() {
		System.out.println(name+"is eating");
	}
}