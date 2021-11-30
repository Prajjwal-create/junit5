package newfeatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
 * forEach() Method In Iterable Interface
Java 8 has introduced a “forEach” method in the
 interface java.lang.Iterable that can iterate over 
 the elements in the collection. “forEach” is a default 
 method defined in the Iterable interface.
  It is used by the Collection classes that extend
   the Iterable interface to iterate elements.



The “forEach” method takes the Functional Interface as
 a single parameter i.e. you can pass Lambda Expression
  as an argument.
 */
public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> languages= new ArrayList<String>(); // declare array list
		languages.add("java");
		languages.add("ruby");
		languages.add("python");
		languages.add("c++");
		languages.add("Ruby");
		languages.add("scala");
		System.out.println("****** Programing LAnguage ******");
		languages.forEach(i -> System.out.println(i)); //lambda exp
		
		System.out.println(("****** Print  Element using methiod**"));
		languages.forEach(System.out::println);
		//i-- input parament --left hand side of lambda
		
		
		Map<Integer,String> customer= new HashMap<Integer,String>();
		
		//add element into map
		customer.put(101,"Alex");
		customer.put(102,"lenen");
		customer.put(103,"Dime");
		customer.put(104,"MAry");
		customer.put(105,"Rachel");
		
		System.out.println("*** Customer Account Number****");
		customer.forEach((k,v) -> System.out.println("Key ="+ k + "  ----> VAlue "+v));
		
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		
		//use lambda expression to print array lsit
		System.out.println("******* Array List Contents *****");
		arrL.forEach(i-> System.out.println(i));
		
		System.out.println("**** Even Number in Array list *****");
		arrL.forEach(n-> {if(n%2==0) System.out.println(n); });

	}
	

}
