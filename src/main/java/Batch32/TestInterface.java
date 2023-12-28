package Batch32;

public class TestInterface implements Myinterface{

	public void getmoney() {
	System.out.println("honey is sweet");	
	}

	public void gethoney() {
		System.out.println("i need my salary");
	}

	public void password() {
		System.out.println("I need my password");
	}
	
	public static void main(String[] args) {
		TestInterface obj= new TestInterface();
		obj.getmoney();
		obj.gethoney();
		obj.password();
	}
	
	
	
	

}
