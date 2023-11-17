package search_product;

import java.sql.ResultSet;

import db_operations.DBUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class SearchProductScreenController {

	@FXML
	private TextField searchProductName;

	@FXML
	private TextField productName;

	@FXML
	private TextField productID;

	@FXML
	private TextField productPrice;

	@FXML
	private TextField availableQuantity;

	@FXML
	private TextField productCategory;

	@FXML
	private Button closeButton;

	@FXML
	private Button searchButton;

	public void searchProduct() {
		String query = "SELECT * FROM Product WHERE productName = '" + searchProductName.getText() + "' ";

		ResultSet rs = DBUtils.executeQueryGetResult(query);
		try {
			while (rs.next()) {
				productName.setText(rs.getString("productName"));
				productID.setText(rs.getString("productID"));
				productPrice.setText(rs.getString("productPrice"));
				availableQuantity.setText(rs.getString("availableQuantity"));
				productCategory.setText(rs.getString("productCategory"));
			}
		} catch (Exception e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Product Not Found");
			alert.setContentText("Product Not Found!");
			alert.setHeaderText("Product Not Found!!!!!");
			alert.show();
		}
	}

	public void backToHomeScreen() {
		ProductManagementScreen.showProductManagementScreen();
	}
}
