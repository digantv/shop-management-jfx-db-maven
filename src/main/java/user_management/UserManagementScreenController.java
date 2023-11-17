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
		AddUserScreen.showAddUserScreen();
	}

	public void editUser() {
		EditUserScreen.showEditUserScreen();
	}

	public void deleteUser() {
		DeleteUserScreen.showDeleteUserScreen();
	}

	public void searchUser() {
		SearchUserScreen.showSearchUserScreen();
	}

	public void backToHomeScreen() {
		HomeScreen.showHomeScreen();
	}
}
