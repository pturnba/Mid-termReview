package classLab1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PeopleDisplay {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("people.ssv");
		Scanner input = new Scanner(file);
		
		String winner = null;
		int highScore = 0;
		double total = 0;
		double count = 0.0;
		
		while (input.hasNextLine()) {
			StringTokenizer st = new StringTokenizer(input.nextLine(), ";");
			String name = st.nextToken();
			int val2 = Integer.parseInt(st.nextToken());
			double val3 = Double.parseDouble(st.nextToken());

			if (val2 > highScore) {
				highScore = val2;
				winner = name;
			}
			total += val3;
			count++;
		}
		System.out.printf("The person with the highest score is: %s with %d%n", winner, highScore);
		System.out.printf("The avarage is: %.2f%n", (total / count));
		input.close();
		
	}


}
