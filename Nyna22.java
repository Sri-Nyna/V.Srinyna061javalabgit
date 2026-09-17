class  Nyna22{
	static {
		System.out.println("SB-Nyna20");
	}
}
class Nyna23 extends Nyna22{
	static {
		System.out.println("B-con");
	}
}
class Nyna24 extends Nyna23{
	static {
		System.out.println("SB-Nyna22");
	}
}
 class Test{
	 public static void main(String[] args){
		 Nyna24 b =new Nyna24();
	 }
 }	 