package search_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchProductScreen {

	public static void showSearchProductScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL(
					"file:C://Users//DELL//eclipse-workspace//ShopManagementJavafxDB//src//search_product//SearchProductScreen.fxml"));
			StageFactory.stage.setTitle("Search Product Screen");
			Scene scene = new Scene(actorGroup, 600, 400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(false);
			StageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
