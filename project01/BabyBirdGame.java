package project01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BabyBirdGame extends Application {
	private static Stage primaryStage;

	@Override
	public void start(Stage arg0) throws Exception {	
		primaryStage = arg0;
		initGUI();

		arg0.setTitle("Baby Bird");
		arg0.setResizable(false);
		arg0.sizeToScene();
		arg0.show();


	}

	public static void initGUI() {
		VBox rootPane = new VBox();
		rootPane.setAlignment(Pos.TOP_CENTER);
		rootPane.setBackground(new Background(new BackgroundFill(Color.BLACK,
				null, null)));

		// Title

		// Score

		// Previous Score

		// Bird Flight

		// Help Message

		Scene scene = new Scene(rootPane);

		primaryStage.setScene(scene);

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
