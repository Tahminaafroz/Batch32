package polymor;

public class LocalTDbank extends Worldbank {  //Child class

	public static void main(String[] args) {
		LocalTDbank obj=new LocalTDbank();
		obj.carloan();
		obj.homeloan();
		
	System.out.println(obj.carloan());	
	System.out.println(obj.homeloan());	
		
		
	}
	public int homeloan() { 
		return 12;      // Put value again so that its override
		
	}
	
	public double carloan() {
		return 14.34;
		
	}
	
	
	
	

}
