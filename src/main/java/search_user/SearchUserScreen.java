package search_user;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchUserScreen {
	public static void showSearchUserScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL(
					"file:C://Users//DELL//eclipse-workspace//ShopManagementJavafxDB//src//search_user//SearchUserScreen.fxml"));
			StageFactory.stage.setTitle("Home Screen");
			Scene scene = new Scene(actorGroup, 600, 400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(false);
			StageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
