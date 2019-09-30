import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class ATM_app extends Application {
	public static void main(String[] args) {launch(args);}

	@Override
	public void start(Stage primaryStage ) throws Exception {
		primaryStage.setTitle("Login");
		loginform loginform=new loginform(primaryStage);
		HomeScreen HomeScreen=new HomeScreen(primaryStage);
		HomeScreen.draw();
		loginform.draw();
		loginform.setHomeScreen(HomeScreen);
		primaryStage.setScene(loginform.getscene());
         primaryStage.show();
		
	}

	

	}


