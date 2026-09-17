class  Nyna21{
	static {
		System.out.println("SB-Nyna20");
	}
}
class Nyna22 extends Nyna21{
	static {
		System.out.println("B-con");
	}
}
class Nyna23 extends Nyna22{
	static {
		System.out.println("SB-Nyna22");
	}
}
 class Test{
	 public static void main(String[] args){
		 Nyna21 b =new Nyna21();
	 }
 }	 