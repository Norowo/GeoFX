package dad.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import dad.geofx.api.IpApiService;
import dad.geofx.api.Service;
import dad.geofx.model.LocationModel;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainController implements Initializable {

	private IpApiService service;

	@FXML
	private Label asnText;

	@FXML
	private Label callingCodeText;

	@FXML
	private Button checkIpButton;

	@FXML
	private Label cityStateText;

	@FXML
	private Tab connectionTab;

	@FXML
	private CheckBox crawlerDetectedCheck;

	@FXML
	private Label currencyText;

	@FXML
	private ImageView flagImage;

	@FXML
	private Label hostnameText;

	@FXML
	private Label ipAddressText;

	@FXML
	private Label ipLocationText;

	@FXML
	private TextField ipText;

	@FXML
	private Label languageText;

	@FXML
	private Label latitudeText;

	@FXML
	private Tab locationTab;

	@FXML
	private Label longitudeText;

	@FXML
	private Label potentialThreatTypesText;

	@FXML
	private CheckBox proxyDetectedCheck;

	@FXML
	private Label registeredIspText;

	@FXML
	private Label safeText;

	@FXML
	private Tab securityTab;

	@FXML
	private Label threatLevelText;

	@FXML
	private Label timeZoneText;

	@FXML
	private CheckBox torDetectedCheck;

	@FXML
	private Label typeText;

	@FXML
	private VBox view;

	@FXML
	private Label zipCodeText;

	public MainController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		service = Service.getInstance();
		service.getLocationByIp("193.146.93.29").enqueue(new Callback<LocationModel>() {
			@Override
			public void onResponse(Call<LocationModel> call, Response<LocationModel> response) {
				if (response.isSuccessful()) {
					LocationModel location = response.body();
					System.out.println(location);
					// Actualiza la vista con la información de location
					Platform.runLater(() -> {
						updateView(location);
					});

				}
			}

			@Override
			public void onFailure(Call<LocationModel> call, Throwable throwable) {
				throwable.printStackTrace();
			}
		});
		

	}

	public VBox getView() {
		return view;
	}
	
	public void updateView(LocationModel location) {
	    // Este método actualizará las etiquetas con la información de la ubicación
	    latitudeText.setText(String.valueOf(location.getLatitude()));
	    longitudeText.setText(String.valueOf(location.getLongitude()));
	    cityStateText.setText(location.getCity() != null ? location.getCity() : "");
	    zipCodeText.setText(location.getZip() != null ? location.getZip() : "");
	    
	    List<LocationModel.Language> languages = location.getLocation().getLanguages();
        languageText.setText(languages.get(0).getName() + " (" + languages.get(0).getCode().toUpperCase() + ")");
        
	    
        ipLocationText.setText((location.getCountryName() != null ? location.getCountryName() : "") 
				+ (location.getCountryCode() != null ? " (" + location.getCountryCode() + ")" : ""));
        
        System.out.println(location.getCountryName());
        callingCodeText.setText(location.getLocation().getCallingCode());
        currencyText.setText(location.getCurrency().getCode());
        ipAddressText.setText(location.getIp());
        typeText.setText(location.getType());
        asnText.setText(String.valueOf(location.getConnection().getAsn()));
        hostnameText.setText(location.getHostname());
        proxyDetectedCheck.setSelected(location.getSecurity().isProxy());
        torDetectedCheck.setSelected(location.getSecurity().isTor());
        crawlerDetectedCheck.setSelected(location.getSecurity().isCrawler());
        threatLevelText.setText(location.getSecurity().getThreatLevel());
       
        
       
	    }
	  

	@FXML
	void onCheck(ActionEvent event) {
		String ip = ipText.getText();

		System.out.println("IP: " + ip);

		service = Service.getInstance();
		service.getLocationByIp(ip).enqueue(new Callback<LocationModel>() {
			@Override
			public void onResponse(Call<LocationModel> call, Response<LocationModel> response) {
				if (response.isSuccessful()) {
					LocationModel location = response.body();
					System.out.println(location);
					// Actualiza la vista con la información de location
					Platform.runLater(() -> {
						updateView(location);
					});

				}
			}

			@Override
			public void onFailure(Call<LocationModel> call, Throwable throwable) {
				throwable.printStackTrace();
			}
		});
	}
}
