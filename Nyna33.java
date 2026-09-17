interface I1{
	void m1();
}
interface I2{
	void m2();
}
interface I3 extends I1,I2{
	void m3();
}
class A implements I3{
	public void m1(){
		System.out.println("m1-A");
	}
	public void m2(){
		System.out.println("m2-A");
	}
	public void m3(){
		System.out.println("m3-A");
	}
}
class Test{
	public static void main(String[] args){
		I1 obj=new A();
		I1.m1();
		I1.m2();
		I1.m3();
	}
}
		
	