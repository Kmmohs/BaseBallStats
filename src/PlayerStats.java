import java.util.Scanner;

public class PlayerStats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Player Name: ");
		String playerName = input.nextLine();
		
		System.out.println("At Bat: ");
		int atBats = input.nextInt();
		
		System.out.println("Number of Hits: ");
		int hits = input.nextInt();
		
		System.out.println("Number of Doubles: ");
		int doubleBases = input.nextInt();
		
		System.out.println("Number of Triples: ");
		int tripleBases = input.nextInt();
		
		System.out.println("Number of Home Runs: ");
		int homeRuns = input.nextInt();
		
		System.out.println("Number of Runs: ");
		int runs = input.nextInt();
		
		System.out.println("Number of Walks: ");
		int walks = input.nextInt();
		
		System.out.println(BattingAverage(atBats, hits));
		
	}
	
	public static double BattingAverage(int atBats, int hits) {
		double battingAverage = (double)hits/(double)atBats;
		return battingAverage;
		
	}
	
	public double OnBasePercentage() {
		return onBasePercentage;
		
	}
	
	public double SluggingPercentage() {
		return sluggingPercentage;
		
	}
	
	public double OBS() {
		onBase + sluggingPercentage
		return obs
	}
	
	public int TotalBases() {
		runs * 4 + walks
	}
	
}
