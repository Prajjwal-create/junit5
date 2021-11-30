package newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaComparatorDemo {

	
	

	//Java lambda expression can be used in the collection framework. It provides efficient and concise way to iterate, filter and fetch data.


	public static void main(String[] args) {
		
		Student s1= new Student(101,"Gosline",78);
		Student s2= new Student(102,"Rod Jhonson",69);
		Student s3= new Student(103,"Steve Jobs",67);
		Student s4= new Student(104,"Zuckerburg",78);
		Student s5= new Student(105,"Gosline",45);
		
		List<Student> sList =new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		
		System.out.println("Sort Student based on NAmes :");
		
		//impiiment lambda expression to sort user defined object using 
		//comparator interface compareTo() method

		Collections.sort(sList,(st1,st2)-> {
			return st1.name.compareTo(st2.name);
		});
		
		for(Student s:sList)
		{
			System.out.println(s.rollNumber+ " "+s.name+" "+s.marks);
		}
		//sort in decendiing order based on mark
		System.out.println("*** Decendinf order******");
		
		Collections.sort(sList,(st1,st2)->{
		return st2.marks.compareTo(st1.marks);
				});
		
		sList.forEach(s->System.out.println(s.rollNumber+ " "+s.name+ " " +s.marks));
	}

}
