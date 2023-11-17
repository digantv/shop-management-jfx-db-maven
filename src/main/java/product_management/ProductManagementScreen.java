package product_management;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductManagementScreen {
	public static void showProductManagementScreen() {
		
		try {
			Parent actorGroup = FXMLLoader.load(new URL(
					"file:C://Users//DELL//eclipse-workspace//ShopManagementJavafxDB//src//product_management//ProductManagementScreen.fxml"));
			StageFactory.stage.setTitle("Product Management Screen");
			Scene scene = new Scene(actorGroup, 600, 400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(false);
			StageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
