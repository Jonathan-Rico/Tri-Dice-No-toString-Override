public class Dice {	
	public int Throw(int dices, int bounces) {	
		int total = 0;
		for (int j = bounces; j >0; j--) {
			for (int k = dices; k >0; k--){
			int die = (int) (1 + (Math.random() * 6));
			System.out.printf("Dice # %d is % d\n", k , die);
			total = total + die;
			}	
		}
		System.out.printf("Total value of each dice rolled added is %s\n", total);
		return total;
	}
}

