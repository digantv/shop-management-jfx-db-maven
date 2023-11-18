package common;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class BaseScreen {
	public void show() {
		try {

			String myClassName = getClass().getSimpleName();
			String classFilePath = getClass().getResource(myClassName + ",class").toString();

			String fxmlFilePath = classFilePath.replace(".class", ".fxml");

			Parent actorGroup = FXMLLoader.load(new URL(fxmlFilePath));
			StageFactory.stage.setTitle(myClassName);
			Scene scene = new Scene(actorGroup, 600, 400);
			StageFactory.stage.setScene(scene);

			StageFactory.stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
