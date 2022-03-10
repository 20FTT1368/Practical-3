package project01;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class Bird extends Pane {
	Polygon beak, wing;
	Circle body, eye;

	public Bird() {
		
		beak = new Polygon();
		beak.getPoints().addAll(
				35.0, 15.0,
				50.0, 20.0,
				35.0, 25.0
				);
		beak.setFill(Color.YELLOW);
		
		body = new Circle(20, 20, 20);
		body.setFill(Color.BROWN);
		
		eye = new Circle(30, 15, 5);
		eye.setFill(Color.BLACK);
		eye.setStroke(Color.WHITE);
		eye.setStrokeWidth(3);
		
		wing = new Polygon();
		wing.getPoints().addAll(
				10.0, 20.0,
				25.0, 25.0,
				15.0, 35.0
				);
		wing.setFill(Color.ORANGE);
		wing.setStroke(Color.BLACK);
		
		this.getChildren().addAll(beak, body, eye, wing);
	}

}
