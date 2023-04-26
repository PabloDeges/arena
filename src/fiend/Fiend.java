package fiend;

import game.GameObject;
import hero.Hero;

public abstract class Fiend extends GameObject{

	protected int health;
	
	public Fiend() {
		// TODO Auto-generated constructor stub
	}

	public int getHealth() {
		return health;
	}
	public abstract String getName();

	
	public void setHealth(int health) {
		if(health > 0)
			this.health = health;
		else
			this.health = 0;
	}
	
	
	
}
