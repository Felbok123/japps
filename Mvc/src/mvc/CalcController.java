package mvc;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CalcController implements Initializable {

	@FXML
	Button clear;
	@FXML
	Button exit;
	@FXML
	Button minus;
	@FXML
	Button plus;
	@FXML
	Button divide;
	@FXML
	Button multiply;
	@FXML
	Button modulo;
	@FXML
	TextField textC1;
	@FXML
	TextField textC2;
	@FXML
	Label res;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		CalcModel calculated = new CalcModel();

		clear.setOnAction(e -> {
			textC1.clear();
			textC2.clear();
			res.setText("");
		});

		divide.setOnAction(e -> {

			res.setText("" + calculated.divide(textC1.getText(), textC2.getText()));

		});

		exit.setOnAction(e -> {

			Stage stage = (Stage) exit.getScene().getWindow();
			stage.close();

		});

		minus.setOnAction(e -> {

			res.setText("" + calculated.minus(textC1.getText(), textC2.getText()));

		});

		plus.setOnAction(e -> {

			res.setText("" + calculated.plus(textC1.getText(), textC2.getText()));

		});

		multiply.setOnAction(e -> {

			res.setText("" + calculated.multiply(textC1.getText(), textC2.getText()));

		});

		modulo.setOnAction(e -> {

			res.setText("" + calculated.modulo(textC1.getText(), textC2.getText()));

		});

	}

}
