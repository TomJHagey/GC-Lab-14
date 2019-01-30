
public class RandomPlayer extends Player {

	public RandomPlayer() {
		super();
		
	}

	public RandomPlayer(String name) {
		super(name);
		
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.SCISSORS;
	}

}