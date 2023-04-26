package arenaOfHeroesJava2;

import fiend.Fiend;
import game.Arena;
import game.FiendGenerator;
import game.Game;
import game.HeroGenerator;
import hero.Hero;
import java.io.*;

public class playGame {

	public static void main(String[] args) throws IOException {
		HeroGenerator hg = new HeroGenerator();
		FiendGenerator fg = new FiendGenerator();
		Arena a = new Arena(hg.generateHeroes(), fg.generateFiends());
		Game game1 = new Game(a);
		
		PrintWriter p = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Spielstand.txt")));
		
	
		
		for(int i = 1; i < 3; i++)
			game1.iterate();
		
		
		for (Fiend f : game1.fArr) {
				for (String s : f.getActionHistory()) {
					if (s != null)
						p.println(s);
				}
				
				
		}
		for (Hero h : game1.hArr) {
			for (String s : h.getActionHistory()) {
				if (s != null)
					p.println(s);
			}		
		}
		
		p.close();
		
				
	}

}
