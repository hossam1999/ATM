import javax.swing.JOptionPane;

//import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HomeScreen {
	loginform loginform;
	Scene scene;
	Stage stage;
	account x=new account();
	int i;

	public HomeScreen(Stage stage) {
		

		
		this.stage=stage;

		
		 
	}
					
		

	
	
	public void setLoginform(loginform loginform) {
		this.loginform = loginform;
	}
	public void draw() {
		Label deposite= new Label("Amount to be deposited");
		Label withdraw= new Label("Amount to be withdrawed");
		Label balance= new Label("press here to know your current Balance");

		TextField depositefield=new TextField();
		TextField withdrawfield=new TextField();
		Button depositebutton=new Button ("Deposite");
		Button withdrawbutton=new Button ("Withdraw");
		Button balancebutton=new Button ("Balance");
		Button nextbutton=new Button ("Next operation");
		Button previousbutton=new Button ("previous operation");
//----------------------------------------------------------------------------------------------------------------------------------------------
		

GridPane grid=new GridPane();
grid.add(deposite, 0, 0);
grid.add(depositefield,1,0);
grid.add(depositebutton,2,0);
grid.add(withdraw, 0, 1);
grid.add(withdrawfield,1,1);
grid.add(withdrawbutton,2,1);
grid.add(balance, 0, 2);
grid.add(balancebutton, 2, 2);
grid.add(previousbutton, 0, 3);
grid.add(nextbutton, 3, 3);
//----------------------------------------------------------------------------------------------------------------------------------------------



depositebutton.setOnAction(new EventHandler<ActionEvent>() {
	public void handle(ActionEvent event) {
		
		String amount=depositefield.getText();
		try {
		    Double.parseDouble(depositefield.getText());
		    i=1;
		} catch(Exception e) {
		i=0;
			JOptionPane.showMessageDialog(null, "INVAlid INPUT PLEASE ENTER NUMBERS ONLY");	
		}
		
		
		if(i==1) {
		double amount1=Double.parseDouble(amount);
		x.deposite(amount1);
		
		}
		
		
		
	}
});
//----------------------------------------------------------------------------------------------------------------------------------------------

withdrawbutton.setOnAction(new EventHandler<ActionEvent>() {
	public void handle(ActionEvent event) {
		
		String amount3=withdrawfield.getText();
		
		try {
		    Double.parseDouble(withdrawfield.getText());
		    i=1;
		} catch(Exception e) {
		i=0;
			JOptionPane.showMessageDialog(null, "INVALID INPUT PLEASE ENTER NUMBERS ONLY");	
		}
		
		
		if(i==1) {
			double amount2=Double.parseDouble(amount3);
			x.withdraw(amount2);
		
		}
		
		
		
		
		
		
	}
});
//----------------------------------------------------------------------------------------------------------------------------------------------

balancebutton.setOnAction(new EventHandler<ActionEvent>() {
	public void handle(ActionEvent event) {
		
		x.print_balance();
		
		
		
		
		
	}
});
//----------------------------------------------------------------------------------------------------------------------------------------------

nextbutton.setOnAction(new EventHandler<ActionEvent>() {
	public void handle(ActionEvent event) {
		
		x.nextOperation();
		
		
		
		
		
	}
});
//----------------------------------------------------------------------------------------------------------------------------------------------

previousbutton.setOnAction(new EventHandler<ActionEvent>() {
	public void handle(ActionEvent event) {
		
		x.previosOperation();
		
		
		
		
		
	}
});
//----------------------------------------------------------------------------------------------------------------------------------------------


 scene=new Scene(grid,1000,1000);
		
		
	}
		
	
public Scene getscene() {
	return this.scene;
	}}


