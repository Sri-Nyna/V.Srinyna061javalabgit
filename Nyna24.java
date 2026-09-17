class Nyna24{
	Nyna24(){
		System.out.println("A-con");
	}
	Nyna24(int i){
		System.out.println("m1-A");
	}
}
class Nyna25 extends Nyna24{
	Nyna25(){
		super(100);
		System.out.print("Nyna25 constructor");
	}
}
class Test{
	public static void main(String[] args){
		Nyna25 b =new Nyna25();
	}
}
	