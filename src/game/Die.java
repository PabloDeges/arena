package game;

import java.util.Random;


public class Die {
	
	protected int sides;

	public Die(int sides) {
		this.sides = sides;
	}
	
	public int throwDie() {
		Random ran = new Random();
		
		return ran.nextInt(sides) + 1;
	}

}
