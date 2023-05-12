package arenaOfHeroesJava2;

import fiend.Fiend;
import game.Arena;
import game.FiendGenerator;
import game.Game;
import game.HeroGenerator;
import hero.Hero;
import java.io.*;

public class playGame {

	public static void main(String[] args) throws IOException, InterruptedException {
		HeroGenerator hg = new HeroGenerator();
		FiendGenerator fg = new FiendGenerator();
		Arena a = new Arena(hg.generateHeroes(), fg.generateFiends());
		
		PrintWriter p = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Spielstand.txt")));
		
		int[] gameEnds = new int[20];
		
		Thread[] tArr = new Thread[20];
		Game[] gArr = new Game[20];
		
		Arena b = null;
		for (int i = 0; i < 20; i++) {
			String name = "coolesgame - " + i;
			b = new Arena(hg.generateHeroes(), fg.generateFiends());
			gArr[i] = new Game(b, name);
			
			tArr[i] = new Thread(gArr[i]);
			tArr[i].start();
		}		
		p.close();
		
		for (Thread y : tArr) {
			y.join();
		}
		
		int added = 0;
		for (Game x : gArr) {

			if (x.getGameState() == 1)
				added++;
		}
		System.out.println("won " + added + "/ 20 games");
			
	}

}
