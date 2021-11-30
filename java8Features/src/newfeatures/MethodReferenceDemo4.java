package newfeatures;
// java program to use method reference to a constructor

interface IMessage
{
	ConstructorReference getMessage(String msg);
}
class ConstructorReference
{
	ConstructorReference(String msg)
	{
		System.out.println(msg);
	}
}
public class MethodReferenceDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IMessage hello= ConstructorReference::new;
		hello.getMessage("Method reference to constructor");

	}

}
