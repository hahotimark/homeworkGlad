package view;

import gladiator.Arena;
import gladiator.Gladiator;
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

public class CongratView {
	
	public CongratView(Stage stage, Arena arena,Gladiator gladiator1, Gladiator gladiator2) {
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
			
			Gladiator winner = arena.fight(gladiator1, gladiator2);
			Text gladiatorWinner = new Text("Congratulation: " +  winner.getName() + " the greatest Gladiator!");
			gridPane.add(gladiatorWinner, 2, 0);
			
			/** VIEW ELEMENTS */


			//Creating a scene object 
			Scene scene = new Scene(gridPane);  

			//Setting title to the Stage 
			stage.setTitle("Gladiator Game Winner"); 

			//Adding scene to the stage 
			stage.setScene(scene); 

			//Displaying the contents of the stage 
			stage.show(); 


	}
}
