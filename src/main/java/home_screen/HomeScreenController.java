package home_screen;

import common.StageFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import product_management.ProductManagementScreen;
import user_management.UserManagementScreen;

public class HomeScreenController {

	@FXML
	private Button userManagement;

	@FXML
	private Button productManagement;

	@FXML
	private Button quit;

	public void userManagement(ActionEvent event) throws Exception {
		UserManagementScreen.showUserManagementScreen();
	}

	public void productManagement(ActionEvent event) {
		ProductManagementScreen.showProductManagementScreen();
	}

	public void backToHomeScreen(ActionEvent event) {
		StageFactory.stage.close();
	}
}
