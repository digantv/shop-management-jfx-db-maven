package delete_user;

import java.sql.ResultSet;

import db_operations.DBUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class DeleteUserScreenController {

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
	private Button deleteUserButton;

	@FXML
	private Button closeButton;

	@FXML
	private Button searchButton;

	public void searchUser() {

		String query = "Select * from Users where userName = '" + searchUserName.getText() + "' ";

		ResultSet rs = DBUtils.executeQueryGetResult(query);
		try {
			while (rs.next()) {
				userName.setText(rs.getString("userName"));
				loginName.setText(rs.getString("loginName"));
				password.setText(rs.getString("pasword"));
				userRole.setText(rs.getString("userRole"));
				userID.setText(rs.getString("userID"));
			}

		} catch (Exception e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("User Not Found");
			alert.setContentText("User Not Found!");
			alert.setHeaderText("User Not Found!!!!!");
			alert.show();

		}

	}

	public void backToHomeScreen() {
		UserManagementScreen.showUserManagementScreen();
	}

	public void deleteUser() {

		String query = "Delete from Users where userName = '" + searchUserName.getText() + "'";
		DBUtils.executeQuery(query);

		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("User Deleted Successfully");
		alert.setContentText("User Deleted Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();
		UserManagementScreen.showUserManagementScreen();
	}

}
