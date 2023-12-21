package in.ineuron;

public class ExceptionTest {

	public static void main(String[] args) {
		int i=4;
		int j=0;
		
		try {
				int k=18/i;
				System.out.println(k);
			}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println("bye");
	}

}
