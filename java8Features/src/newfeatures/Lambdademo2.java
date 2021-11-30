package newfeatures;

public class Lambdademo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumericTest isEven=(int n) -> (n%2==0);
		NumericTest isNegative=(n) ->(n<0);
		
		System.out.println(isEven.computeTest(7));
		System.out.println(isNegative.computeTest(-56));
		
		//boolean a=(n) -> (n%2==0); //error -lambda expression should		
				
	}

}
