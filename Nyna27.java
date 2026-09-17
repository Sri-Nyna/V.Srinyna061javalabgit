interface I{
	int x=20;
	void m1();
	void m2();
	void m3();
}
class Nyna27 implements I{
	public void m1(){
		System.out.println("m1-Nyna27");
	}
	public void m2(){
		System.out.println("m2-Nyna27");
	}
	public void m3(){
		System.out.println("m3-Nyna27");
	}
	public void m4(){
		System.out.println("m4-Nyna27");
	}
}
class Test{
	public static void main(String[] args){
		I i =new Nyna27();
		System.out.println(I.x);
		System.out.println(i.x);
		i.m1();
		i.m2();
		i.m3();
		//i.m4();
		Nyna27 a=new Nyna27();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}
	