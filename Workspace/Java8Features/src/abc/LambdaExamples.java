package abc;

interface Calculator{
	public int add(int x, int y);
}

public class LambdaExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InterfaceName refernceName = (parameerList)->expression;
		// by default lambda return value without return keyword. single line statement. 
			Calculator c1 = (x,y)->x+y;
		System.out.println(c1.add(100, 200));
			Calculator c2 = (a,b)->a+b;
		System.out.println(c1.add(10, 20));
			Calculator c3 = (int x,int y)->x+y;
		System.out.println(c3.add(1000, 2000));
			Calculator c4 = (x,y)->{
			int sum = x+y;
			return sum;
		};
		System.out.println(c4.add(100, 200));
	}

}
