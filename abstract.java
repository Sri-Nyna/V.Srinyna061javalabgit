 abstract class Nyna31{
	 void m1(){
		 System.out.println("m1-a");
	 }
 }
  abstract class A extends Nyna31{
	 void m2(){
		 System.out.println("m2-method");
	 }
	 abstract void m3();
  }
class B extends A{
 void m3(){
System.out.println("m3-method");
 }
}
 class Main{
public static void main(String[] args){
 B obj=new B();
obj.m1();
obj.m2();
obj.m3();
}
}
 
	 
	 
	 
	 
	