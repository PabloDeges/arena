package game;

import hero.Hero;
import fiend.Fiend;

public class Game {
	
	public int round = 0;
	private Arena gameArena;
	
	public Fiend[] fArr;
	public Hero[] hArr;

	public Game(Arena gameArena) {
		this.gameArena = gameArena;
	}
	
	public void iterate() {
		round++;
		
		 fArr = gameArena.getFiends();
		 hArr = gameArena.getHeroes();
		
		Die wurfel = new Die(3);
	
		System.out.println("---Heroes---");
		for (Hero h : hArr) {
			System.out.println("");
			System.out.println("Name: " + h.getName() + " hp: " + h.getHealth());

			
		}
		System.out.println("---Fiends---");
		for (Fiend f : fArr) {
			System.out.println("");
			System.out.println("Name: " + f.getName() + " hp: " + f.getHealth());
			
			
		}
		// step 1 heroes attack
	 
		
		for (Hero h : hArr) {
			if(h.getHealth() > 0) {
				Fiend randomFiend = fArr[wurfel.throwDie()-1];
				h.attack(randomFiend);
				System.out.println(h.getName() + " attacked " + randomFiend.getName());
				System.out.println("");
			}
		}
		
		// step 2 fiends attack
		
		for (Fiend f : fArr) {
			if (f.getHealth() > 0) {
				Hero randomHero = hArr[wurfel.throwDie()-1];
				f.attack(randomHero);
				System.out.println(f.getName() + " attacked " + randomHero.getName());
				System.out.println("");
			}
		}
		
		
	}

}
