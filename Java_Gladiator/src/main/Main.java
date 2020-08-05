package main;

import gladiator.Arena;
import gladiator.Gladiator;
import gladiator.Paladin;
import gladiator.Warrior;
import javafx.application.Application;
import javafx.stage.Stage;
import view.CongratView;
import view.View;

public class Main extends Application {

	public static void main(String[] args) {


		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		//Gladiator gladiator1 = new Gladiator("Spartacus");
		//Gladiator gladiator2 = new Gladiator("Hexus");
		
		Warrior warrior = new Warrior("Laci");
		Paladin paladin = new Paladin("B�la");
		
		Arena arena = new Arena();
		
		
		View view = new View(arg0, arena, warrior, paladin, paladin, paladin, warrior, paladin); // 2x?

		Stage secondWindow = new Stage();

		CongratView view2 = new CongratView(secondWindow, arena, warrior, paladin);
		

		
	}

}
