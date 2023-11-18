package product_management;

import add_product.AddProductScreen;
import delete_product.DeleteProductScreen;
import edit_product.EditProductScreen;
import home_screen.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_product.SearchProductScreen;

public class ProductManagementScreenController {

	@FXML
	private Button addProductButton;

	@FXML
	private Button editProductButton;

	@FXML
	private Button deleteProductButton;

	@FXML
	private Button searchProductButton;

	@FXML
	private Button quit;

	public void addProduct() {
		new AddProductScreen().show();
	}

	public void editProduct() {
		new EditProductScreen().show();
	}

	public void deleteProduct() {
		new DeleteProductScreen().show();
	}

	public void searchProduct() {
		new SearchProductScreen().show();
	}

	public void backToHomeScreen() {
		new HomeScreen().show();
	}

}
