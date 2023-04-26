package game;

import hero.Hero;
import fiend.Fiend;

public class Arena {
	
	public Arena(Hero[] heroes, Fiend[] fiends) {
		this.heroes = heroes;
		this.fiends = fiends;
	}
	
	protected Hero[] heroes;
	protected Fiend[] fiends;

	public Hero[] getHeroes() {
		return heroes;
	}

	public Fiend[] getFiends() { 
		return fiends;
	}
	
	public void setHeroes(Hero[] heroes) {
		this.heroes = heroes;
	}
	
	public void printHeroes() {
		for (Hero h : heroes) {
			System.out.println(h.getName() + " - " + h.getHealth() + "hp");
		} 
		
	}
	
}
