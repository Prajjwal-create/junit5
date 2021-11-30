package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name = Arrays.asList("John","Mike","Alax");

		Consumer<String> convertUpperCase=new Consumer<String>()
		{

			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
				// TODO Auto-generated method stub
				
			}
			
		};
		//treversing through consumer Interface Implimentation
		name.forEach(convertUpperCase);
		
		//consumer to diaplay a Number
		Consumer<Integer> display= a -> System.out.println(a);
		
		//impilemet display usinf 
		display.accept(10);
		
	}

}
