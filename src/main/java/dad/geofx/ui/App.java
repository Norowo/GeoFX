package dad.geofx.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private MainController mainController;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		mainController = new MainController();
		
		Scene scene = new Scene(mainController.getView());
		
		primaryStage.setTitle("GeoFX");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
