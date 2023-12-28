package constractor;

public class ParameterConstractor {
	
	
	   String Stdname;
	   int stdRoll;
	
	
	public ParameterConstractor(String StudentName,int Rollnum) {
		Stdname=StudentName;
		stdRoll=Rollnum;
	}
	public static void main(String[] args) {
		ParameterConstractor obj=new ParameterConstractor("Liton", 2345);
		
	System.out.println(obj.Stdname);
	System.out.println(obj.stdRoll);
	}
	
	

}
