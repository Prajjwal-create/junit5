package streamdemo;

import java.util.stream.IntStream;

/*
 
Java Parallel Streams is a feature of Java 8 and higher, meant for utilizing multiple cores of the processor.Normally any java code has one stream of processing, where it is executed sequentially.
Whereas by using parallel streams, we can divide the code into multiple streams that are executed in parallel on separate cores and the final result is the combination of the individual outcomes.
The order of execution, however, is not under our control.


 */
public class ParallelStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("********** Sequentisl Stream********");
		
		IntStream range=IntStream.range(1, 20);
		//range.forEach(System.out::println);
		range.forEach(i->System.out.println(i+" -> Therad"+Thread.currentThread().getName()));
		
		System.out.println("*********** PAralel Stream");
		
		IntStream range2=IntStream.rangeClosed(1, 20);
		//range2.parallel().forEach(System.out::println);
		
		range2.parallel().forEach(i-> System.out.println(i+" -> Tehread :" +Thread.currentThread().getName()));
		
		System.out.println("******** parallel stream*******");

	}

}
