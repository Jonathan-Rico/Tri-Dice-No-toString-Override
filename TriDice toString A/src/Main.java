import java.util.Scanner;
public class Main {	
	public static void main(String args []) {		
	
		TripleDice Tripledice = new TripleDice();
		System.out.printf("Type in the number of dice you want to be rolled.\n");
		Scanner input = new Scanner (System.in);
		int dices = input.nextInt();
		System.out.printf("Type in the number of times you want each die to be rolled.\n");
		int bounces = input.nextInt();
		System.out.printf("\t%d dice have been rolled.\n", dices);
		int D = Tripledice.Throw(dices, bounces);
		int avg = (D/(dices))/bounces;
		System.out.printf("The dice rolls have an average value of %d", avg);	
	}
}