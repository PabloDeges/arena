package game;

public abstract class GameObject implements Attack, Attackable {
	
	private String [] actionHistory = new String[100];
	
	protected void logAction(String s) {
		
		for (int i = 0; true ; i++) {
			if (getActionHistory()[i] == null) {
				getActionHistory()[i] = s;
				break;
			}
			
		}
	} 

	public void print() {
		
		for (String x : getActionHistory()) {
			if (x != null)
			System.out.println(x); 
			else 
				break;
			
		}
}	
	
	
	public GameObject() {
		
	}
	public abstract void attack(GameObject f);

	public String [] getActionHistory() {
		return actionHistory;
	}

	public void setActionHistory(String [] actionHistory) {
		this.actionHistory = actionHistory;
	}

}
