import java.util.Scanner;

public class ConsolePlayer extends Player {
	
	private Scanner scnr;
	
	public ConsolePlayer(Scanner scnr, String name) {
		super(name);
		this.scnr = scnr;
	}
	
	@Override
	public Roshambo generateRoshambo() {


	String input = Validator.getString(scnr, "Pick Rock, Paper, or Scissors: \n");

	if (input.toLowerCase().startsWith("r")) {
		return Roshambo.ROCK;
	}else if (input.startsWith("s")) {
		return Roshambo.SCISSORS;
	}else if (input.startsWith("p")) {
		return Roshambo.PAPER;
	}else {
		System.out.println("That was invalid iput. Try again.");
		return generateRoshambo();

		
	}
	
	
	}
}
