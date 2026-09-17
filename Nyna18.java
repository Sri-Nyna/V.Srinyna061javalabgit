class Nyna18{
	int i =10;
	public Nyna18(){
 System.out.println("Hello");
	}
 static Nyna18 getRef(){
	Nyna18 a =new Nyna18();
	 return a;
}
}
class Main{
	public static void main(String[] args){
		System.out.println(Nyna18.getRef().i);
	}
}