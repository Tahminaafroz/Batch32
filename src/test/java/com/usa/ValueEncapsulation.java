package com.usa;

public class ValueEncapsulation {

	public static void main(String[] args) {
		
		Encapsulneeds  obj=new Encapsulneeds ();
		obj.getSignin();
		obj.getUsername();
		obj.getPassword();
		obj.getSubmit();
		
		obj.setSignin("gmailSignin");
		obj.setUsername("tahmina");
		obj.setPassword("happy2023");
		obj.setSubmit("clickSubmitbutton");
		
System.out.println(obj.getSignin());
System.out.println(obj.getUsername());
System.out.println(obj.getPassword());
System.out.println(obj.getSubmit());


	}

}
