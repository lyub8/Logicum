import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Menu extends Application {
	private Stage stage;

	public Menu() {

	}

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		stage = primaryStage;
		VBox stack = new VBox();
		stack.setStyle("-fx-background-color: black; -fx-alignment: center;");
		Button start = new Button("start");
		Button exit = new Button("exit");
		List<Button> buttons = new ArrayList<>();
		buttons.add(start);
		buttons.add(exit);
		
		for (Button b : buttons) {
			b.setStyle("-fx-font-family: monospace; "+ "-fx-font-weight: bold; " + "-fx-background-radius: 500; " + "-fx-border-radius: 500; " + "-fx-border-width: 3; " + "-fx-border-color: #9acd32; "
				+ "-fx-background-color: transparent; " + "-fx-font-size: 40px; " + "-fx-text-fill: #9acd32; "
				+ "-fx-pref-height: 40px; " + "-fx-pref-width: 300px; " + "-fx-margin: 10px; ");}
		
		for (Button b : buttons) {
			b.setOnMouseEntered(e -> b.setStyle("-fx-font-family: monospace; "+ "-fx-font-weight: bold; " + "-fx-background-radius: 500; " + "-fx-border-radius: 500; "+ "-fx-border-width: 3; " + "-fx-border-color: black; "
						+ "-fx-background-color: #9acd32; " + "-fx-font-size: 40px; " + "-fx-text-fill: black; "
						+ "-fx-pref-height: 40px; " + "-fx-pref-width: 300px; " + "-fx-margin: 10px; "));}
		
		for (Button b : buttons) {
			b.setOnMouseExited(e -> b.setStyle("-fx-font-family: monospace; "+ "-fx-font-weight: bold; " + "-fx-background-radius: 500; "+ "-fx-border-radius: 500; "+ "-fx-border-width: 3; " + "-fx-border-color: #9acd32; "
				+ "-fx-background-color: transparent; " + "-fx-font-size: 40px; " + "-fx-text-fill: #9acd32; "
				+ "-fx-pref-height: 40px; " + "-fx-pref-width: 300px; " + "-fx-margin: 10px; "));}
		
		stack.setMargin(start, new Insets(10));
		stack.setMargin(exit, new Insets(10));
		
		start.setOnAction(e -> startGame());
		exit.setOnAction(e -> System.exit(0));
		stack.getChildren().addAll(start, exit);

		Scene scene = new Scene(stack);
		stage.setTitle("Logicube");
		stage.setWidth(500);
		stage.setHeight(400);
		stage.setScene(scene);
		stage.show();
	}
	
	private void startGame() {
		Game g = new Game();
		g.start(new Stage());
		stage.close();
	}

}
