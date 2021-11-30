package newfeatures;


//Perform Arithmatic Operation using Lambda
public class LambdaDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition op1=(a,b) -> (a+b);
		System.out.println("Addition of 2 Nos is : "+op1.calculate(200, 150));
		
		
		Addition op2=(a,b) -> (a-b);
		System.out.println("sub of 2 Nos is : "+op2.calculate(200, 150));

		
		Addition op3=(a,b) -> (a*b);
		System.out.println("mul of 2 Nos is : "+op3.calculate(200, 150));
		
		Addition op4=(a,b) -> (a/b);
		System.out.println("Div of 2 Nos is : "+op4.calculate(200, 150));
	}

}
