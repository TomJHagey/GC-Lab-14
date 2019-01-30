import java.util.Scanner;
import java.util.Random;

public class RoshamboApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		Player human = new ConsolePlayer(scnr, "Tom");

		Roshambo humanChoice = human.generateRoshambo();
		System.out.println(human.getName() + " played " + humanChoice + "\n");

		String[] randomChoice = { "ROCK", "PAPER", "SCISSORS" };

		Random random = new Random();

		int select = random.nextInt(randomChoice.length);

		System.out.println(
				"Would you prefer to play against Trevor or Reggie? Enter 1 for Trevor or enter 2 for Reggie: ");

		int selectPlayer = 0;

		selectPlayer = scnr.nextInt();

		Player opponent = new RockPlayer("Trevor");

		Player opponent1 = new RandomPlayer("Reggie");

		// Roshambo opponentChoice = opponent.generateRoshambo();

		// Roshambo opponentChoice1 = opponent1.generateRoshambo();

		if (selectPlayer == 1) {
			System.out.println(opponent.getName() + " played " + randomChoice[select]);
		} else if (selectPlayer == 2) {
			System.out.println(opponent1.getName() + " played " + randomChoice[select]);

		}
		
		System.out.println("\n === ROCK < PAPER, PAPER < SCISSORS, SCISSORS < ROCK ===");
		System.out.println("__________________________________________________________");
		
		
		

		// Player human = new ConsolePlayer(scnr, "Tom");

		// Roshambo humanChoice = human.generateRoshambo();
		// System.out.println(human.getName() + " played " + humanChoice);

		// Create the player

	}
		
}
	

