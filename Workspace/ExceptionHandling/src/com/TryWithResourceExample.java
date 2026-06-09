package com;

class MyResource implements AutoCloseable {

    public void use() {
        System.out.println("Using resource");
    }

    @Override
    public void close() {
        System.out.println("Resource closed 1");
    }
}

class MyResource1 implements AutoCloseable {

    public void use() {
        System.out.println("Using resource");
        int result[]= {1,2,3};
        System.out.println(result[6]);
    }

    @Override
    public void close() {

        int result = 100/0;
    	System.out.println("Resource closed 2");
    }
}
public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try (
				   MyResource resource = new MyResource();
				   MyResource1 resource1  = new MyResource1();
				   
				   ) {
	            resource.use();
	            resource1.use();
	        }catch(Exception e) {
	        	System.out.println(e);
	        }

	}

}
