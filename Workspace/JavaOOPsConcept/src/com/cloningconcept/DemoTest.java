package com.cloningconcept;

public class DemoTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

        Address addr = new Address("Bangalore");
        
        
        Employee e1 = new Employee(1, addr);
        
        Employee e2 = (Employee)e1.clone();
        System.out.println(e1.id);
        System.out.println(e1.address);
        	e2.id=2;
        e2.address.city = "Chennai";

        System.out.println(e1.id);
        System.out.println(e1.address);
        
        System.out.println(e2.id);
        System.out.println(e2.address);

	}

}
