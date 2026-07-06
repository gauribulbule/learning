package abc;
@FunctionalInterface
interface Hello {
	void sayHello();
	//void sayHi();
}
class HelloImp implements Hello {
	@Override
	public void sayHello() {
	System.out.println("provided body for Hello interface using separate class");
		
	}
}
public class LambdaBasicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st way 
		Hello h1 = new HelloImp();
		h1.sayHello();
		
		// Inner or nested classes 
		// non static inner class 
		// static inner class 
			// anonymous inner class 
		// local method inner class. 
		// 2nd way 
		Hello h2 = new Hello() {
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("provided body for Hello interface using anonymous class - first way ");
			}
		
		};
		h2.sayHello();
		
		Hello h3 = new Hello() {
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("provided body for Hello interface using anonymous class - second way");
			}
		};
		h3.sayHello();
		
		// 3rd way using lambda 
		Hello h4 = ()->System.out.println("Provided body for using lambda style");
		h4.sayHello();
	}

}
