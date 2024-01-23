package dad.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class LocationController implements Initializable {
	
    @FXML
    private Label callingCodeText;

    @FXML
    private Button checkIpButton;

    @FXML
    private Label cityStateText;

    @FXML
    private Label currencyText;

    @FXML
    private ImageView flagImage;

    @FXML
    private Label ipLocationText;

    @FXML
    private TextField ipText;

    @FXML
    private Label languageText;

    @FXML
    private Label latitudeText;

    @FXML
    private Label longitudeText;

    @FXML
    private Label timeZoneText;

    @FXML
    private VBox view;

    @FXML
    private Label zipCodeText;

    @FXML
    void onCheckIP(ActionEvent event) {

    }
    
    public LocationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
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
