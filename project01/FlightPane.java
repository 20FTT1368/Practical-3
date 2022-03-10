package project01;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class FlightPane extends Pane {
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	public Bird bird;

	public FlightPane() {
		this.setPrefWidth(WIDTH);
		this.setPrefHeight(HEIGHT);
		this.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));

		bird = new Bird();
		this.getChildren().add(bird);
		bird.setLayoutX(10);
		bird.setLayoutY(300);

	}
}
