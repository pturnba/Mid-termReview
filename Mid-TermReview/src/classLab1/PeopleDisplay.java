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
		int highest = 0;
		double total = 0, readCount = 0.0;
		while (input.hasNextLine()) {
			StringTokenizer st = new StringTokenizer(input.nextLine(), ";");
			String name = st.nextToken();
			int val2 = Integer.parseInt(st.nextToken());
			double val3 = Double.parseDouble(st.nextToken());

			if (val2 > highest) {
				highest = val2;
				winner = name;
			}
			total += val3;
			readCount++;
		}
		System.out.printf("And the Winner is: %s with %d%n", winner, highest);
		System.out.printf("The avarage is: %.2f%n", (total / readCount));
		input.close();
		
	}


}
