package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=Arrays.asList("Jhon","Dan","Mike","Thomas");
		
		//create a stream
		Stream<String> n=names.stream();
		Stream<String> ln=n.filter(str->str.length() >3);
		
		ln.forEach(System.out::println);
		
		// create a Stream  ---> operation --> Convert Stream back to collection
		
		System.out.println("*********");
		List<String> names1=names.stream().filter(str->str.length()>4)
				.collect(Collectors.toList());
		
		System.out.println(names1);
		System.out.println("****************************");
		
		List<Integer> grades =new ArrayList<Integer>();
		grades.add(20);
		grades.add(4);
		grades.add(5);
		grades.add(5);
		grades.add(5);
		
		//Build stream from collection
		Stream<Integer> strm1=grades.stream();
		
		List<Integer> gradesEven=strm1.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(gradesEven);
		
		

	}

}
