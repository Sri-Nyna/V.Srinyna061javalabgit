
class  Nyna23{
	void m3() {
		System.out.println("SB-Nyna20");
	}
}
class Nyna24 extends Nyna23{
	void m2() {
		System.out.println("B-con");
	}
}
class Nyna25 extends Nyna24{
	void m1() {
		System.out.println("SB-Nyna22");
	}
}
 class Test{
	 public static void main(String[] args){
		 Nyna25 b =new Nyna25();
		 b.m1();
		 b.m2();
		 b.m3();
	 }
 }	 
