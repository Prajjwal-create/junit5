package newfeatures;

@FunctionalInterface
interface MyInterface
{
	void myMethod();
}
class Test // instance class
{
	void display() // instance
	{
		System.out.println("I am a Inastance Method");
		
	}
}
public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //treditional approach
		Test t1=new Test();
		t1.display();
		
		// java8 method reference approach
		MyInterface m1ref=t1::display;// Method reference to instance methid of object

		m1ref.myMethod();
	}

}
