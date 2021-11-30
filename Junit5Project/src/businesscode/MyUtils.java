package businesscode;

import java.util.stream.Stream;

/*
 * @ParameterizedTest annotation is used for
 *  Parameterized tests make it possible to run 
 *  a test multiple times with different arguments.



we must declare at least one source that will
 provide the arguments for each invocation and
  then consume the arguments in the test method
 */

public class MyUtils {
	
	public static int add(int n1, int n2) {
		return n1+n2;
		}



		public static boolean isPalindrome(String inputText) {
		return new StringBuffer(inputText).reverse().toString().equals(inputText);
		}



		public static Integer multiply(int n1, int n2) {
		return n1*n2;
		}
		
		

}

 class SourceProviders {

public static Stream<String> friutMethodSource() {
return Stream.of("apple", "banana");
}
 }
 
  enum NAMES {
	 KK,PK,MK
	 }
