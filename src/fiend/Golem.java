package fiend;

import game.GameObject;
import hero.Hero;

public class Golem extends Fiend {

	public Golem() {
		health = 300;
	}
	@Override
	public void attack(GameObject f) {
		f.sustainDamage(10);
		logAction("Golem attacked for 10dmg");
		
	}

	@Override
	public void sustainDamage(int dmg) {
		health -= dmg;
		logAction("Golem took " + dmg + "dmg");
	}
	public String getName() {return "Golem";}

}
