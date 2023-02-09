package methodlogic;

public class JavaBehaviour {
	 
	public void a1() {
		System.out.println("read 1 ");		
	
	}
	
	public static void a2() {
		System.out.println("read 2 ");		

	}
		
	public static void main(String[]args) {
		
		System.out.println("read 3 ");	
		a2();
		JavaBehaviour a3 = new JavaBehaviour();
		a3.a1();
		
		
	}
	
}
