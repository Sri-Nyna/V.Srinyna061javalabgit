class Nyna17{
	int rollno;
	String name;
	double marks;
void display(){
	System.out.println("Roll:"+rollno+"Name:"+name);
}
}
class Main{
	public static void main(String[] args){
		Nyna17 s1=new Nyna17();
		s1.rollno=101;
		
		s1.name="Ravi";
		

		s1.marks=97.00;
		
		
		s1.display();
	}
}