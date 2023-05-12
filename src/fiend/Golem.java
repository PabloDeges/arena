package fiend;

import game.GameObject;
import hero.Hero;

public class Golem extends Fiend {

	public Golem() {
		health = 200;
	}
	@Override
	public void attack(GameObject f) {
		f.sustainDamage(30);
		logAction("Golem attacked for 5dmg");
		
	}

	@Override
	public void sustainDamage(int dmg) {
		health -= dmg;
		if (health <= 0) {
			health = 0; }
		logAction("Golem took " + dmg + "dmg");
	}
	public String getName() {return "Golem";}

}
