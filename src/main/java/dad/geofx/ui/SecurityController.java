package dad.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SecurityController implements Initializable {
	
	@FXML
    private CheckBox crawlerDetectedCheck;

    @FXML
    private Label potentialThreatTypesText;

    @FXML
    private CheckBox proxyDetectedCheck;

    @FXML
    private Label safeText;

    @FXML
    private Label threatLevelText;

    @FXML
    private CheckBox torDetectedCheck;

    @FXML
    private VBox view;

    @FXML
    void onCheckIP(ActionEvent event) {

    }
    
    public SecurityController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityView.fxml"));
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
