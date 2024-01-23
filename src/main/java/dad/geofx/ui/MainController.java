package dad.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;

public class MainController implements Initializable {

	// controllers

	private LocationController locationController = new LocationController();
	private ConnectionController connectionController = new ConnectionController();
	private SecurityController securityController = new SecurityController();

	@FXML
	private Tab connectionTab;

	@FXML
	private Tab locationTab;

	@FXML
	private Tab securityTab;

	@FXML
	private VBox view;

	public MainController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		locationTab.setContent(locationController.getView());
		connectionTab.setContent(connectionController.getView());
		securityTab.setContent(securityController.getView());
	}

	public VBox getView() {
		return view;
	}

}
