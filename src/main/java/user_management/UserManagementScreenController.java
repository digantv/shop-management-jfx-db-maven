package user_management;

import add_user.AddUserScreen;
import delete_user.DeleteUserScreen;
import edit_user.EditUserScreen;
import home_screen.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_user.SearchUserScreen;

public class UserManagementScreenController {

	@FXML
	private Button addUser;

	@FXML
	private Button editUser;

	@FXML
	private Button deleteUser;

	@FXML
	private Button searchUser;

	@FXML
	private Button quit;

	public void addUser() {
		new AddUserScreen().show();
	}

	public void editUser() {
		new EditUserScreen().show();
	}

	public void deleteUser() {
		new DeleteUserScreen().show();
	}

	public void searchUser() {
		new SearchUserScreen().show();
	}

	public void backToHomeScreen() {
		new HomeScreen().show();
	}
}
