package hero;

import fiend.Fiend;
import game.GameObject;

public class Mage extends Hero{
	
	private int damage = 50;

	public Mage(int health, String name) {
		super(health, name);
	}
	
	@Override
	public void attack(GameObject f) {
		f.sustainDamage(60);
		logAction("Mage attacked for 60dmg");
		
	}

	@Override
	public void sustainDamage(int dmg) {
		health -= dmg;
		logAction("Mage took " + dmg  + "dmg");
	}
}
