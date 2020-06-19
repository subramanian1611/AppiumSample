/**
 * Package containing classes for common utilisation methods
 */
package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author nitinthite
 * Class to accept values from user for Web automation suite
 */
public class UserValues {
	
	public UserValues() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String setBrowserName() {
		
		System.out.println("Which OS do you want to run suite on:- Chrome or Firefox? ");
		// Using Scanner for Getting Input from User 
        Scanner scan = new Scanner(System.in); 
  
        String browserName = scan.nextLine(); 
        System.out.println("You entered string "+browserName);
		return browserName;
	}

}
