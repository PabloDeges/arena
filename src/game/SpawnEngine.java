package game;

import java.util.Random;

import fiend.Demon;
import fiend.Fiend;
import fiend.Golem;
import fiend.Spider;

public class SpawnEngine {

	public SpawnEngine() {
		// TODO Auto-generated constructor stub
	}
	
	public Fiend spawn() {
		Random ran = new Random();
		int rdm = ran.nextInt(3);
		
		if(rdm == 0) {
			return new Spider();
		}
		else if(rdm == 1) {
			return new Golem();
		}
		else {
			return new Demon();
		}
	}

}
