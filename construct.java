import java.util.Scanner;

public class construct {
public static void main(String[] args) {
	add aa= new add();
	aa.input();
	aa.display();
	
}
}

class add{
	int a,b;
	add(){
		a=0;
		b=0;
	}
	
	add(int x,int y){
	a=x;
	b=y;
	}

void input () {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first element");
	a=sc.nextInt();
	System.out.println("enter second number");
	b=sc.nextInt();
	sc.close();
}
void display() {
	System.out.println("a="+a + "b="+b);
}	
} 
