package manese.ashley;

import java.util.Random;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScenesFromAComputer extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane rootPane = new Pane();
		GridPane grid1 = new GridPane();
		grid1.setPadding(new Insets(10, 10, 10, 10));
		grid1.setHgap(15);
		grid1.setVgap(15);

		GridPane grid2 = new GridPane();
		grid2.setPadding(new Insets(10, 10, 10, 10));
		grid2.setHgap(25);
		grid2.setVgap(10);

		GridPane grid3 = new GridPane();
		grid3.setPadding(new Insets(10, 10, 10, 10));
		grid3.setHgap(60);
		grid3.setVgap(10);




		for(int i = 0; i < 5; i++) {
			Rectangle stump = new Rectangle(110, 550, 100, 160);
			Rectangle stump2 = new Rectangle(1190, 550, 100, 160);
			rootPane.getChildren().add(stump);
			rootPane.getChildren().add(stump2);
			stump.setFill(Color.web("#966f4d"));
			stump2.setFill(Color.web("#966f4d"));
			grid1.add(tree(), i * 4 , 5);


		}
		
	
		
		

		for(int i = 0; i < 80; i++) {
			Arc arc1 = new Arc(150,100, 80, 80, 320, 35 );
			Arc arc2 = new Arc(150,100, 80, 80, 320, 35 );
			Arc arc3 = new Arc(150,100, 80, 80, 178, 35 );
			arc1.setFill(Color.LAWNGREEN);
			arc2.setFill(Color.LAWNGREEN);
			arc3.setFill(Color.FORESTGREEN);
			arc1.setType(ArcType.CHORD);
			arc2.setType(ArcType.CHORD);
			arc3.setType(ArcType.CHORD);
			grid2.add(arc1, i , 70);
			grid2.add(arc2, i + 1 , 75);
			grid2.add(arc3, i + 2 , 73);


		}

		for(int i = 0; i < 12; i++) {
			grid3.add(flower(), i , 65);
		}



		Text text = new Text(1350, 885, "Ashley Manese");
		rootPane.getChildren().addAll(grid1,grid2,grid3, face(), ears1(), ears2(), pinkEar1(),
				pinkEar2(), face2(), mouth(), eyes(), eyes2(), iris(), iris2(), text);
		Scene scene = new Scene(rootPane, 400, 400);
		primaryStage.setTitle("Generic Animal Crossing");
		primaryStage.setScene(scene);
		primaryStage.show();



	}

	public static Path flower() {

		Circle c = new Circle(100, 25, 30);
		Line line = new Line(100, 100, 100, 25);
		line.setStrokeWidth(5);
		Path path = (Path) Path.union(c, line);
		path.setFill(Color.color(Math.random(), Math.random(),Math.random()));
		return path;
	}

	public static Ellipse iris() {
		Ellipse e = new Ellipse(620, 450, 25, 50);
		e.setFill(Color.web("#4267c7"));
		return e;
	}

	public static Ellipse iris2() {
		Ellipse e = new Ellipse(785, 450, 25, 50);
		e.setFill(Color.web("#4267c7"));
		return e;
	}

	public static Polygon tree() {
		Polygon tree = new Polygon();
		tree.setFill(Color.DARKOLIVEGREEN);

		tree.getPoints().addAll(new Double[]{  
				180.0 , 160.0 ,  
				360.0 , 660.0 ,  
				60.0, 660.0 });  

		return tree;
	}

	public static Ellipse eyes() {
		Ellipse e = new Ellipse(620, 450, 50, 100);
		e.setFill(Color.WHITE);
		return e;

	}

	public static Ellipse eyes2() {
		Ellipse e = new Ellipse(785, 450, 50, 100);
		e.setFill(Color.WHITE);
		return e;

	}
	public static Circle ears1() {
		Circle ear = new Circle(470, 325, 115);
		ear.setFill(Color.web("#A36F2F", 1.0));
		return ear;
	}

	public static Circle ears2() {
		Circle ear = new Circle(950, 325, 115);
		ear.setFill(Color.web("#A36F2F", 1.0));
		return ear;
	}

	public static Ellipse mouth() {
		Ellipse mouth = new Ellipse(720, 625, 75, 40);
		mouth.setFill(Color.web("#6e491f"));
		return mouth;

	}

	public static Path pinkEar2() { 
		Circle ears4 = new Circle(950, 325, 80);
		Path path2 = (Path) Path.union(ears4, face());
		path2 = (Path) Path.subtract(path2, face());
		path2.setFill(Color.web("#e37d9b",1.0));	
		return path2;
	}

	public static Path pinkEar1() { 
		Circle ears3 = new Circle(470, 325, 80);
		Path path1 = (Path) Path.union(ears3, face());
		path1 = (Path) Path.subtract(path1, face());
		path1.setFill(Color.web("#e37d9b",1.0));  
		return path1;
	}

	public static Ellipse face2() {
		Ellipse face = new Ellipse(700, 450, 275, 125);
		face.setFill(Color.web("#6e491f"));
		return face;
	}

	public static Ellipse face() {
		Ellipse face = new Ellipse(700, 550, 350, 275);
		Color brwn = Color.web("#A36F2F", 1.0);
		face.setFill(brwn);	
		return face;
	}

	public static void main(String[] args) {
		launch(args);
	}



}
