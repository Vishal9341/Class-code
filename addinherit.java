
public class addinherit {
	public static void main(String[] args) {
		subtract sb=new subtract();
		sb.sub();	
	}
}
 class Pqr{
	 int a=23,b=12,c=24;
	 void add() {
		 a=23;
		 b=12;
		 c=24;
	if( (a+b+c)>45)
		System.out.println(a+b+c);
}	 
 }
  class subtract extends Pqr{
	 void sub() {
		 if((a+b+c)<45)
			 System.out.println(a-b-c);
	 }
 }