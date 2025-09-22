
public class array {
	public static void main(String[] args) {
		int[] arr= {12,15,47,45,96};
		student s1=new student(arr);
		s1.displaymarks();
	}

}
class student{
	int[] marks;
	student(int[]m){
		marks=m;
	}

void displaymarks() {
	System.out.println("student marks");
	for(int mark : marks) {
		System.out.println(mark);
	}
}
}