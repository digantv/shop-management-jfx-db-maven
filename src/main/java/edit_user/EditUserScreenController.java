package edit_user;

import db_operations.DBUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class EditUserScreenController {

	@FXML
	private TextField searchUserName;

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
	private Label loggedName;

	@FXML
	private Button editUserButton;

	@FXML
	private Button closeButton;

	public void editUser() throws Exception {
		// loggedName.setText(userName.getText());
		String query = "UPDATE Users SET userID= '" + userID.getText() + "', Username = '" + userName.getText() + "', "
				+ "LoginName = '" + loginName.getText() + "', " + "pasword = '" + password.getText() + "',"
				+ "UserRole = '" + userRole.getText() + "'" + "WHERE Username = '" + searchUserName.getText() + "'";

		DBUtils.executeQuery(query);
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("User Edited Successfully");
		alert.setContentText("User Edited Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();
		UserManagementScreen.showUserManagementScreen();
	}

	public void backToHomeScreen() {
		UserManagementScreen.showUserManagementScreen();
	}
}
