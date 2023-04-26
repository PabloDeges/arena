package hero;

import fiend.Fiend;
import game.Attack;
import game.Attackable;
import game.GameObject;

public abstract class Hero extends GameObject implements Attack, Attackable {

	protected int health;
	protected String name;
	
	public Hero(int health, String name){
		this.health = health;
		this.name = name;
	} 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health > 0)
			this.health = health;
		else
			this.health = 0;
	}
	
	
}
