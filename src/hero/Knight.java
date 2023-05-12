package hero;

import fiend.Fiend;
import game.GameObject;



public class Knight extends Hero {
	
	private int damage = 20;

	public Knight(int health, String name) {
		super(health, name);
	}
	
	@Override
	public void attack(GameObject f) {
		f.sustainDamage(25);
		logAction("Knight attacked for 25dmg");
		
	}

	@Override
	public void sustainDamage(int dmg) {
		health -= dmg;
		if (health <= 0) {
			health = 0; }
		logAction("Knight took " + dmg + "dmg");
	}
}
