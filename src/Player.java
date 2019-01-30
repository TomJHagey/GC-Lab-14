
public abstract class Player {

	private String name;
	
	// concrete subclasses must override/implement this method
	public abstract Roshambo generateRoshambo();
	

	//no-arg construct
	public Player() {

	}
	//overloaded constructor
	public Player(String name) {
		this.name = name;

	}

	// getter
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

}
