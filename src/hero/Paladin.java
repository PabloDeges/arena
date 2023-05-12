package hero;

import fiend.Fiend;
import game.GameObject;

public class Paladin extends Hero {

		private int damage = 100;
	
	public Paladin(int health, String name) {
		super(health, name);
	}
	
	@Override
	public void attack(GameObject f) {
		f.sustainDamage(30);
		logAction("Paladin attacked for 30dmg");
		
	}

	@Override
	public void sustainDamage(int dmg) {
		health -= dmg;
		if (health <= 0) {
			health = 0; }
		logAction("Palading took " + dmg  + "dmg");
	}

}
