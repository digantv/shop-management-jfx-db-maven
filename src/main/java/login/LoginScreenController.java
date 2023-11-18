package login;

import java.sql.ResultSet;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginScreenController {

	@FXML
	private TextField loginName;

	@FXML
	private TextField password;

	@FXML
	private Button loginButton;

	public void login(ActionEvent event) {
		boolean loginStatus = LoginScreenController.validateUserAndPassword(loginName.getText(), password.getText());
		if (loginStatus) {
			new HomeScreen().show();
		} else {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Login Failed");
			alert.setContentText("Login Failed!!!!");
			alert.setHeaderText("Login Failed!!!!!");
			alert.show();
		}
	}
	public static boolean validateUserAndPassword(String loginName, String password) {
		String query = "SELECT * FROM users WHERE loginName='" + loginName + "' AND pasword = '" + password + "'";
		ResultSet rs = DBUtils.executeQueryGetResult(query);
		try {
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
