class Nyna28{
	protected void m1(){
		System.out.println("M1-method");
}
//System.out.println(m1());
}
class Nyna29 extends Nyna28{
	public void m1(){
		System.out.println("M2-method");
	}
	public void m2(){
		super.m1();
}
}
class Test{
	public static  void main (String[] args){
		Nyna29 a= new Nyna29();
		
	}
}
