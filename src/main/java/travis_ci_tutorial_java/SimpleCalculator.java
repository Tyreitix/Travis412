package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int divide(int i, int j) {
		// TODO Auto-generated method stub
		if(j != 0)
			return i/j;
		else
			System.out.println("Cannot divide by 0");
			return 0;
	}
	
	public int minus(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}
	
	public int multiply(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}
}
