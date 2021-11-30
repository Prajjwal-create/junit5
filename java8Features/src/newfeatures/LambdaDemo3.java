package newfeatures;

//Block lambda statements
public class LambdaDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mystring reverseStr= (str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		
		
		System.out.println(reverseStr.myStringFunction("LAmbda Expression"));
 
		
		Mystring myName =(name) -> {return "Hello "+name;};
		
		System.out.println(myName.myStringFunction("Prajjwal"));
		
		//lambda expression with single paraeter with no parenthises
		Mystring myName1 = name -> { return "Hello "+name;};
		
		System.out.println(myName1.myStringFunction("james Gosline"));
	}
	

}
