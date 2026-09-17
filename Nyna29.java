  interface I {
 default void m1() {
System.out.println("m1-A");
 }
 }
 class Nyna29 implements I {
public void m1() {
 System.out.println("m1-A");
}
} 
class Test {
 public static void main(String args[]) {
 I i = new Nyna29();
 i.m1();
}
 } 