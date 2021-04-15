package manese.ashley;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * The picture must have n rows and n columns of squares based on the user input.
Each square should be numbered from 1 to n^2 starting at the top, numbering from left to right, top to bottom.
Each number should have a random color with no transparency (alpha channel value of 1.0).
Each number should be rotated a random number of degrees between 0 and 360.
 */


public class MaddeningMatrices extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		TextInputDialog input = new TextInputDialog("Enter an integer");
		input.setHeaderText("Numbers of Row & Columns: n x n");
		//Shows the dialog and waits returns value the users input).
		input.showAndWait();
		int n = Integer.parseInt(input.getEditor().getText());



		GridPane grid = new GridPane();
		grid.setPadding(new Insets(20, 20, 20, 20));
		grid.setVgap(15);
		grid.setHgap(15);

		int count = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				grid.add(createSquare(), j, i);
			}
		}

		Scene scene = new Scene(grid, 100, 100);
		primaryStage.setTitle("Maddening Matrices");
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	public static void main(String[] args) {
		Application.launch(args);

	}

	public static StackPane returnStackPane(int count) {
		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(createSquare(), createText("" + count));


		return stackPane;						
	}

	public static Rectangle createSquare() {
		Random r = new Random();
		double alpha = (Math.random() * 0.75 + 0.25);
		int redValue = r.nextInt(256);
		int greenValue = r.nextInt(256);
		int blueValue = r.nextInt(256);
		int sides = 25 + r.nextInt(51);
		int rotate  = r.nextInt(360);

		Rectangle square = new Rectangle(100, 100, sides, sides);
		square.setRotate(rotate);
		Color rgbColor = Color.rgb(redValue,greenValue, blueValue, alpha);
		square.setFill(rgbColor);

		return square;

	}

	public static Text createText(String str) {
		Random r = new Random();
		Text text = new Text(str);
		text.setFill(Color.color(Math.random(), Math.random(),Math.random()));
		text.setFont(Font.font("Courier", FontWeight.BOLD, 15));
		int rotate  = r.nextInt(360);
		text.setRotate(rotate);

		return text;
	}







}
