package game;

import hero.Hero;
import hero.Knight;
import hero.Mage;
import hero.Paladin;

public class HeroGenerator {
	
	public Hero[] generateHeroes() {
		
		

		Mage markusRuehl = new Mage(300, "maggus");
		Paladin peter = new Paladin(200, "peter");
		Knight karl = new Knight(100, "karl");
		
		Hero[] hArray = {markusRuehl, peter, karl};
		
		return hArray;
	}
	
	
}
