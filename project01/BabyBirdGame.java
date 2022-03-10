package project01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BabyBirdGame extends Application {
	private static Stage primaryStage;

	private static int score = 0;
	private static int previousScore = 0;

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
			
			previousScore = score;
			score = 0;

			// Title
			Label titleLabel = new Label("Baby Bird");
			titleLabel.setFont(Font.font(32));
			titleLabel.setTextFill(Color.WHITE);

			// Score
			ScorePane scorePane = new ScorePane("Score: ", score,
					 Color.DARKBLUE, Color.WHITE);

			// Previous Score
			ScorePane previousScorePane = new ScorePane("Previous Score: ",
					previousScore,
					 Color.DARKCYAN, Color.WHITE);

			// Bird Flight

			// Help Message


			rootPane.getChildren().addAll(titleLabel, scorePane,
					previousScorePane);

			Scene scene = new Scene(rootPane);

			primaryStage.setScene(scene);

		}

		public static void main(String[] args) {
			Application.launch(args);
		}
	}
