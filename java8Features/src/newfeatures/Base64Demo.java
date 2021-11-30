package newfeatures;

import java.util.Base64;
import java.util.Scanner;

// java Program to encrypt And Decrypt
public class Base64Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String userName,password;
		
		System.out.println("******* Welcome to Coforge Technilogy*****");
		System.out.println("Enter Your User Name :");
		userName=s.next();
		
		System.out.println("Enter Your Password :");
		password=s.next();
		String encodedPassword=Base64.getEncoder().encodeToString(password.getBytes());
		
		System.out.println("LOGIN sucessfully !!!!");
		System.out.println("User Name :"+userName);
		System.out.println("Password :"+encodedPassword);
		
		System.out.println("****** Decrypt teh Password*******");
		String decodedPassword =new String(Base64.getDecoder().decode(encodedPassword));
		System.out.println("the Password is :" +decodedPassword);
		
		
		System.out.println("******* URL Encoding*******");
		
		Base64.Encoder encoder=Base64.getUrlEncoder();
		String eUrl=encoder.encodeToString
				("https://www.coforge.com/industries/public-sector".getBytes());
		
		System.out.println("Encode URL :"+eUrl);
		
		
		
		
		
		
	}

}
