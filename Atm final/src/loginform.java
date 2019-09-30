//import javafx.application.Application;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class loginform {
	HomeScreen HomeScreen;
	Stage stage;
	

Scene scene;
	
public loginform (Stage stage) {
this.stage=stage;}

	
	public void draw() {
		
		Label cardidlabel= new Label("Card number");
		Label passwordlabel= new Label("password");
		TextField userfield=new TextField();
		PasswordField passfield=new PasswordField();
		Button submit=new Button ("submit");
//----------------------------------------------------------------------------------------------------------------------------------------------

		
GridPane grid=new GridPane();
grid.add(cardidlabel, 0, 0);
grid.add(passwordlabel,0,1);
grid.add(userfield,1,0);
grid.add(passfield,1,1);
grid.add(submit,1,2);
//----------------------------------------------------------------------------------------------------------------------------------------------

submit.setOnAction(new EventHandler<ActionEvent>() {
	public void handle(ActionEvent event) {
	user authenication=new user();
		String cardid=userfield.getText();
		try {
		    Integer.parseInt(userfield.getText());
		    
		    
		} catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "INVAlID INPUT PLEASE ENTER NUMBERS ONLY!!");	
		}
		
		String pass=passfield.getText();
		try {
		    Integer.parseInt(passfield.getText());
		    
		} catch(Exception e) {
			
			
			JOptionPane.showMessageDialog(null, "INVALID INPUT PLEASE ENTER NUMBERS ONLY!!");	
		}
		boolean valid=authenication.validate(pass, cardid);
		if(valid) {stage.setScene(HomeScreen.getscene());}
		
		
	}
});



 scene=new Scene(grid,600,400);

		
		
	}
	
	public Scene getscene() {
		return this.scene;
		}

	

	public void setHomeScreen(HomeScreen homeScreen) {
		HomeScreen = homeScreen;
	}
	
	
}
