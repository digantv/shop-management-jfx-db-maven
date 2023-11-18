package add_user;

import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class AddUserScreenController {

	@FXML
	private TextField userName;

	@FXML
	private TextField loginName;

	@FXML
	private TextField password;

	@FXML
	private TextField confirmPassword;

	@FXML
	private TextField userRole;

	@FXML
	private TextField userID;

	@FXML
	private Button addUserButton;

	@FXML
	private Button closeButton;

	public void addUser() throws SQLException {
		String query = "INSERT INTO Users(userID , userName , loginName , pasword , userRole ) " + "VALUES ( '"
				+ userID.getText() + "' , '" + userName.getText() + "' , '" + loginName.getText() + "' , '"
				+ password.getText() + "' , '" + userRole.getText() + "' );";
		DBUtils.executeQuery(query);
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("User Added Successfully");
		alert.setContentText("User Added Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();
		new UserManagementScreen().show();
	}

	public void backToHomeScreen() {
		new UserManagementScreen().show();

	}
}
