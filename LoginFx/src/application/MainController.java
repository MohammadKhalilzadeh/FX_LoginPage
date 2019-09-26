package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController
{
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField txtUserName;
	
	@FXML
	private TextField txPassword;
	
	public void Login(ActionEvent event) throws Exception
	{

/// Login process using applying if condition		
		
		if( txtUserName.getText().equals("user") && txPassword.getText().equals("pass") )
		{
			lblStatus.setText("Login Successfully");
			
///  By Clicking The Login Button This is the new window That Appears |   |
///			                                                         \ / \ /
			
			Stage primaryStage = new Stage();			
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
/// if the login detail is wrong		
		else
		{
			lblStatus.setText("Login Failed");
		}
	}

}
