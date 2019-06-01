package ExceptionsExample;

public class RunTimeException {
	public static void main(String[] args) {
		String[]str= {"one","two", "three"};
		try {
		System.out.println("This is in try block.");
		System.out.println(str[3]);
		
		}catch (NullPointerException e) {
			System.out.println("First catch block");
		}catch (ArithmeticException e) {
		System.out.println("Second catch block");
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("code is done");
		}finally {
			System.out.println("final");
		}
		
	}

}
