package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] marks= {45,88,98,67,45};
		
		
		
		//Build stream from array
		Stream<Integer> strm= Stream.of(marks);
		
		strm.forEach(i->System.out.println(i));
		// Build stream from collection
		List<Integer> grades =new ArrayList<Integer>();
		grades.add(20);
		grades.add(4);
		grades.add(5);
		grades.add(5);
		grades.add(5);
		
		//Build stream from collection
		Stream<Integer> strm1=grades.stream();
		strm1.forEach(i->System.out.println(i));	
		
//		System.out.println("**** array lIst Content*******");
//	     strm1.forEach(System.out::println)	;
	     
	     List<Integer> squares=grades.stream().map(m->m*m)
	    		 .collect(Collectors.toList());
	     
	     System.out.println("******** double Of grade*******");
	     System.out.println(squares);
	     
	     
	}

}
