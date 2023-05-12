package fiend;

import game.GameObject;
import hero.Hero;

public class Demon extends Fiend{

	public Demon() {
		health = 300;
	}
	
	@Override
	public void attack(GameObject f) {
		f.sustainDamage(60);
		logAction("Demon attacked for 40dmg");
		
	}

	@Override
	public void sustainDamage(int dmg) {
		health -= dmg;
		if (health <= 0) {
			health = 0; }
		logAction("Demon took " + dmg + "dmg");
	}
	
	public String getName() {return "Demon";}

}
