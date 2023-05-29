package gui;
import game.*;
import hero.Hero;
import javafx.application.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;


public class MainWindow extends Application{

	private static Game game = null;
	Hero[] heroesArr = game.getArena().getHeroes();
	String s = "";
	
	
	public static void setGame(Game gameIn) {
		game = gameIn;
	}
	
	@Override
	public void start(Stage st) throws Exception {
		
		Hero[] heroesArr = game.getArena().getHeroes();
		String s = "";
		
		
		for (Hero x : heroesArr) {
			s += x.getName() + ",";
		}
		
		
		BorderPane bp = new BorderPane();
		bp.setCenter(new Label("Stay tuned for another adventure of " + s));
		Scene scene = new Scene(bp,600, 600, Color.GREEN);
		st.setTitle( "Senpais‘ Arena of Heros‘.");
		st.setScene(scene);
		st.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
