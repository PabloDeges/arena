package fiend;

import game.GameObject;
import hero.Hero;

public class Demon extends Fiend{

	public Demon() {
		health = 120;
	}
	
	@Override
	public void attack(GameObject f) {
		f.sustainDamage(40);
		logAction("Demon attacked for 40dmg");
		
	}

	@Override
	public void sustainDamage(int dmg) {
		health -= dmg;
		logAction("Demon took " + dmg + "dmg");
	}
	
	public String getName() {return "Demon";}

}
