package lambdatest;

public class LambdaTest {
	public static void main(String[] args) {
		MathOperation add = (int x ,int y)-> x+y;
		String s1="";
		System.out.println(add.operation(1, 2));
		
	//	MathOperation sx= (String x) -> x+s1;
		//sx.s("123");
		int xzq=1;
		int x=4;
	//	(x) -> 2 * x;
		
		
		/*
		 * 
		 * 
		 * 
		 * System.out.println("10 + 5 ="+operator(10,5,add));
		 */
	new Thread(()->System.out.println("Hello World!010")).start();
	
	
	}
	
	/*
	 * private static int operator(int a,int b,MathOperation operation1){ return
	 * operation1.operation(a,b); }
	 */
	//UnaryOperator
}
