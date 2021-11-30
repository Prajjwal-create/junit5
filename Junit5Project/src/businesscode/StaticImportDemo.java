package businesscode;

import static java.lang.System.*;
public class StaticImportDemo {

	/*
	 *
In Java, static import concept is introduced in 1.5 version. With the help of static import, we can access the static members of a class directly without class name or any object.


	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Without ststic Import
		/*System.out.println(Math.sqrt(55));
		System.out.println(Math.pow(10,2));
		System.out.println(Math.abs(55.55));*/
		
		
		System.out.println(sqrt(55));
		System.out.println(pow(10,2));
		System.out.println(abs(55.55))
		
		
		

	}

}
