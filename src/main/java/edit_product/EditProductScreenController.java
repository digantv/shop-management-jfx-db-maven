package edit_product;

import db_operations.DBUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class EditProductScreenController {

	@FXML
	private TextField editProductName;

	@FXML
	private TextField productName;

	@FXML
	private TextField productPrice;

	@FXML
	private TextField availableQuantity;

	@FXML
	private TextField productCategory;

	@FXML
	private TextField productID;

	@FXML
	private Button editproductButton;

	@FXML
	private Button closeButton;

	public void editProduct() {
		String query = "Update product Set productID ='" + productID.getText() + "',productName='"
				+ productName.getText() + "',availableQuantity = '" + availableQuantity.getText() + "',productPrice='"
				+ productPrice.getText() + "',productCategory='" + productCategory.getText() + "'";
		DBUtils.executeQuery(query);
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Product Edited Successfully");
		alert.setContentText("Product Edited Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();
		new ProductManagementScreen().show();
	}

	public void backToHomeScreen() {
		new ProductManagementScreen().show();
	}

}
