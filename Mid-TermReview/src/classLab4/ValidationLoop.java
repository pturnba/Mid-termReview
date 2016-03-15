package classLab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidationLoop {

	public static void main(String[] args) {
		int year = 0, age;
		boolean incorrectFormat = true;

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the year you were born.");
		
		while(incorrectFormat){
			
			if(!kb.hasNextInt()){
				System.err.println("Year formatted incorrectly! Re-enter as Numeric value.");
				kb.next();
				continue;
			}
			else if(kb.hasNextInt()){
				incorrectFormat = false;
				year = kb.nextInt();
			}
		}
	
		if(!incorrectFormat){
			age = 2016 - year;
			System.out.printf("If you were born in %d than you are %d.%n", year, age);
		}
		
		kb.close();
	}
	
	

}
