package newfeatures;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s=null;
//		Integer a= null;
//		
//		System.out.println(s.length()); throu null pointer exception
		
		String s="Hello World";
		Optional<String> chkNull= Optional.ofNullable(s);
		
		if(chkNull.isPresent())
		{
			System.out.println("Length of String is :"+s.length());
			chkNull.ifPresent(System.out::println);
			System.out.println(s.toUpperCase());
			System.out.println();
		}
		else
		{
			System.out.println("String not Present");
		}
		
		

	}

}
