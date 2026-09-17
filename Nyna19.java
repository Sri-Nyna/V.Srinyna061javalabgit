class Nyna19{
	void m1(){
		System.out.println("A method");
	}
	int i=10;
}
class B extends Nyna19{
	void m2(){
		System.out.println("B method");
	}
}
class Test {
	public static void main (String[] args){
		B b = new B();
		System.out.println(b.i);
		b.m1();
		b.m2();
	}
}