package game;

import hero.Hero;
import hero.Knight;
import hero.Mage;
import hero.Paladin;

public class HeroGenerator {
	
	public Hero[] generateHeroes() {
		
		

		Mage markusRuehl = new Mage(700, "maggus");
		Paladin peter = new Paladin(150, "peter");
		Knight karl = new Knight(300, "karl");
		
		Hero[] hArray = {markusRuehl, peter, karl};
		
		return hArray;
	}
	
	
}
