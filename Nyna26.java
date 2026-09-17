 abstract class Nyna26{
	void m1(){
		System.out.println("m1-A method");
	}
	abstract void m2();
	abstract void m3();
 }
 class Nyna27 extends Nyna26{
	 void m2(){
		 System.out.println("m2-B");
	 }
	 void m3(){
		 System.out.println("m3-B");
	 }
	 void m4(){
		 System.out.println("m4-B");
	 }
 }
 class Test{
	 public static void main(String[] args){
		 Nyna26 a=new Nyna27();
		 a.m1();
		 a.m2();
		 a.m3();
		// a.m4();
		 Nyna27 b=new Nyna27();
		 b.m1();
		 b.m2();
		 b.m3();
		 b.m4();
	 }
 }
 
		 
	