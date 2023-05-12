package fiend;

import game.GameObject;
import hero.Hero;

public class Spider extends Fiend {

	public Spider() {
		health = 100;
	}
	
	public String getName() {return "Spider";}

	@Override
	public void attack(GameObject f) {
		f.sustainDamage(40);
		logAction("Spider attacked for 20dmg");
		
	}

	@Override
	public void sustainDamage(int dmg) {
		health -= dmg;
		if (health <= 0) {
			health = 0; }
		logAction("Spider took " + dmg + "dmg");
	}

	
}
