package in.ineuron;

@FunctionalInterface
interface A {
	int add(int i, int j);
}
public class Demo{
	public static void main(String args[]) {
		A obj=(i,j)->i+j;
		int result=obj.add(5,3);
		System.out.println(result);
	}
}