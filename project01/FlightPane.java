package project01;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class FlightPane extends Pane {
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	public Bird bird;
	public boolean gameStart = false;

	public FlightPane() {
		this.setPrefWidth(WIDTH);
		this.setPrefHeight(HEIGHT);
		this.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));

		bird = new Bird();
		this.getChildren().add(bird);
		bird.setLayoutX(10);
		bird.setLayoutY(300);

		Timeline animation = new Timeline(new KeyFrame(Duration.millis(50), e -> {
			bird.setLayoutY(bird.getLayoutY() + 5);

			if(gameStart == true) {
				bird.setLayoutY(bird.getLayoutY() + 5);
			}
			
		}));

		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	}

	public void moveBirdUp() {
		bird.setLayoutY(bird.getLayoutY() - 50);
	}
}
