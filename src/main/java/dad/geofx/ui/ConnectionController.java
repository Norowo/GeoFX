package dad.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ConnectionController implements Initializable {
	
	 @FXML
	    private Label asnText;

	    @FXML
	    private Label hostnameText;

	    @FXML
	    private Label ipAddressText;

	    @FXML
	    private Label registeredIspText;

	    @FXML
	    private Label typeText;

	    @FXML
	    private VBox view;

  
    public ConnectionController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConnectionView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	public VBox getView() {
		return view;
	}

}
