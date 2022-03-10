package project01;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ScorePane extends HBox {
	private Label scoreTitleLabel, scoreLabel;

	public ScorePane(String title, int score, Color backgroundColour, Color
			textColour) {

		scoreTitleLabel = new Label(title);
		scoreTitleLabel.setFont(Font.font(14));
		scoreTitleLabel.setTextFill(textColour);

		scoreLabel = new Label("" + score);
		scoreLabel.setFont(Font.font("Serif", FontWeight.BOLD, 24));
		scoreLabel.setTextFill(textColour);

		this.getChildren().addAll(scoreTitleLabel, scoreLabel);
		this.setSpacing(10);
		this.setAlignment(Pos.CENTER);
		this.setBackground(new Background(new BackgroundFill(backgroundColour,
				null, null)));

	}
}
