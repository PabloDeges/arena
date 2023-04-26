package game;

import fiend.Fiend;

public class FiendGenerator {

	public FiendGenerator() {
		
	}
	
	SpawnEngine se = new SpawnEngine();
	
	public Fiend[] generateFiends() {
		
		Fiend[] fArray = {se.spawn(), se.spawn(), se.spawn()};
		
		return fArray;
	}

}
