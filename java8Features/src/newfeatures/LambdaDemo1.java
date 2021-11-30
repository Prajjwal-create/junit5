package newfeatures;

@FunctionalInterface
interface MyFI
{
	public String sayHello();
	//public String sayHello1();
}
public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFI msg =() -> { return "Hello World";};
		
		System.out.println(msg.sayHello());

	}

}
