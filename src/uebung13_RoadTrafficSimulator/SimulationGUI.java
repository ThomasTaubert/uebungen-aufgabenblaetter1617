package uebung13_RoadTrafficSimulator;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.sun.javafx.geom.Rectangle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class SimulationGUI extends Application {

	/**
	 * 
	 * Java main for when running without JavaFX launcher
	 * 
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(createContent()));

		primaryStage.show();

	}

	private Parent createContent() {
		/**
		 * Simulator erstellen
		 */
		RoadTrafficSimulator sim = new RoadTrafficSimulator();
		sim.calcLinkOccupation();

		/**
		 * mainPane erstellen
		 */
		BorderPane mainPane = new BorderPane();

		/**
		 * Verkehr erhöhen
		 */
		Button butIncr = new Button("Erhöhen");
		butIncr.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				sim.increaseTrafficVolume();
				sim.calcLinkOccupation();
				for (Link line : lines.values()) {

				}
			}
		});
		mainPane.setLeft(butIncr);

		/**
		 * Verkehr verringern
		 */
		Button butDecr = new Button("Verringern");
		butDecr.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				sim.decreaseTrafficVolume();
				sim.calcLinkOccupation();
			}
		});
		mainPane.setRight(butDecr);

		/**
		 * Netz zeichnen
		 */
		Pane simPane = new Pane();
		Map<Integer, Line> lines = new HashMap<>();
		Integer ii = 1;
		for (Link link : sim.getLinks().values()) {
			// Create line shape
			Line line = new Line(link.getStartNode().getCoordinateX(), link.getStartNode().getCoordinateY(),
					link.getEndNode().getCoordinateX(), link.getEndNode().getCoordinateY());
			if (link.getOccupation() < 1) {
				line.setStroke(Color.BLACK);
				line.setStrokeWidth(1);
			} else {
				line.setStroke(Color.RED);
				line.setStrokeWidth(1/* link.getOccupation() */);
			}
			lines.put(ii++, line);
			simPane.getChildren().add(line);
		}

		return mainPane;
	}
}
