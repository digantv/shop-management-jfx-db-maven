package login;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginScreen {
	public static void showLoginScreen() throws Exception {
		try {
			Parent actorGroup = FXMLLoader.load(
					new URL("file:C://Users//DELL//eclipse-workspace//ShopManagementJavafxDB//src//login//LoginScreen.fxml"));
			StageFactory.stage.setTitle("Customer Login");
			Scene scene = new Scene(actorGroup, 600, 400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(false);
			StageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
