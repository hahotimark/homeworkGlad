package view;

import gladiator.Arena;
import gladiator.Gladiator;
import gladiator.Paladin;
import gladiator.Warrior;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class View {
	
	public View (Stage stage, Arena arena,Gladiator gladiator1, Gladiator gladiator2, Gladiator g1, Gladiator g2, Warrior w, Paladin p)
	
	{
		//Creating a Grid Pane 
		GridPane gridPane = new GridPane();    

		//Set layout
		//Setting size for the pane  
		gridPane.setMinSize(300, 300); 

		//Setting the padding  
		gridPane.setPadding(new Insets(10, 20, 10, 20)); 

		//Setting the vertical and horizontal gaps between the columns 
		gridPane.setVgap(5); 
		gridPane.setHgap(5);       

		//Setting the Grid alignment 
		gridPane.setAlignment(Pos.CENTER);


		/** VIEW ELEMENTS */
		
		//Gladiator1
				Text gladiator1Text = new Text(gladiator1.getName());
				Text gladiator1HP = new Text("" + gladiator1.getHealthPoint());
				Text gladiator1AP = new Text("" + gladiator1.getAttackPoint());
				gridPane.add(gladiator1Text, 0, 0);
				gridPane.add(gladiator1HP, 0, 1);
				gridPane.add(gladiator1AP, 0, 2);
				
				Text gladiator1HPprinter = new Text("" + g1.healthPoint);
				gridPane.add(gladiator1HPprinter, 0, 3);
				


				//Gladiator2
				Text gladiator2Text = new Text(gladiator2.getName());
				Text gladiator2HP = new Text("" + gladiator2.getHealthPoint());
				Text gladiator2AP = new Text("" + gladiator2.getAttackPoint());
				gridPane.add(gladiator2Text, 2, 0);
				gridPane.add(gladiator2HP, 2, 1);
				gridPane.add(gladiator2AP, 2, 2);
				
				Text gladiator2HPprinter = new Text("" + g2.healthPoint);
				gridPane.add(gladiator2HPprinter, 0, 3);
				
		//Fight Button
				Button fightBtn = new Button();
				fightBtn.setText("FIGHT!");
				fightBtn.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent e) {
						Gladiator winner = arena.fight(gladiator1, gladiator2);
						
						if(winner == gladiator1)
						{
							gladiator1Text.setFill(Color.GREEN);
						}
						else
						{
							gladiator2Text.setFill(Color.GREEN);
						}
						
						System.out.println("Gladiator " + winner.getName() + " win the fight!!");
					}
				});
				gridPane.add(fightBtn, 1, 1);


		/** VIEW ELEMENTS */


		//Creating a scene object 
		Scene scene = new Scene(gridPane);  

		//Setting title to the Stage 
		stage.setTitle("Gladiator Game"); 

		//Adding scene to the stage 
		stage.setScene(scene); 

		//Displaying the contents of the stage 
		stage.show(); 

		
	}

}
