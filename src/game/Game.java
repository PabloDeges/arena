package game;

import hero.Hero;
import fiend.Fiend;

public class Game implements Runnable{
	
	protected String gameName;
	private int roundCounter = 0;
	private final int DELAY_IN_MS=100;
	protected int gameState;
	
	private Arena gameArena;
	
	public Fiend[] fArr;
	public Hero[] hArr;

	public Game(Arena gameArena, String gameName) {
		this.gameArena = gameArena;
		this.gameName = gameName;
		
	}
	private int checkIfGameOver() {
		
		int sumHeroHealth = 0;
		int sumEnemyHealth = 0;
		
		
		for (Hero hero : hArr) {
			sumHeroHealth += hero.getHealth();
		}
		
		for (Fiend fiend : fArr) {
			sumEnemyHealth += fiend.getHealth();
		}
		
		
		
		if (sumHeroHealth == 0) {
			gameState = -1;
			return gameState;
		}
		else if (sumHeroHealth > 0 && sumEnemyHealth == 0) {
			gameState = 1;
			return gameState;
		}
		else {
			gameState = 0;
			return gameState;
		}
			
	}
	
	public int getGameState() {
		return gameState;
	}
	
	
	public void iterate() {
		roundCounter++;
		
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
	@Override
	public void run() {
		
		do {
			iterate();
			try {
				Thread.sleep(DELAY_IN_MS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (checkIfGameOver() == 0);
		
		System.out.println("name: " + gameName + "roundcount: " + roundCounter);
		
	}
	
	public Arena getArena() {
		return gameArena;
	}

}
