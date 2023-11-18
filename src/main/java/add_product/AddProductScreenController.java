package add_product;

import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class AddProductScreenController {

	@FXML
	private TextField productName;

	@FXML
	private TextField productQuantity;

	@FXML
	private TextField productPrice;

	@FXML
	private TextField productCategory;

	@FXML
	private TextField productID;

	@FXML
	private Button addProductButton;

	@FXML
	private Button closeButton;

	public void addProduct() throws SQLException {
		String query = "INSERT INTO product(productID , productName , availableQuantity , productPrice , productCategory ) VALUES ( '"
				+ productID.getText() + "' ,'" + productName.getText() + "' , '" + productQuantity.getText() + "' , '"
				+ productPrice.getText() + "','" + productCategory.getText() + "' );";
		DBUtils.executeQuery(query);
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Product Added Successfully");
		alert.setContentText("Product Added Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();
		new ProductManagementScreen().show();
	}

	public void backToHomeScreen() {
		new ProductManagementScreen().show();

	}

}
