class Nyna20{
}
class Test {
	public static void main(String[] args){
		Nyna20 b =new Nyna20();
		int hashvalue=b.hashCode();
		System.out.println("Object hashcode:"+hashvalue);
		String word =b.toString();
        System.out.println("ObjectReference is "+word);
}
}

		