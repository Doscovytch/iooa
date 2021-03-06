package week3.opdracht1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;


import java.io.FileInputStream;

import static javafx.application.Application.launch;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("Hello World!");

            // Oefening 1
            // BorderPane root = new BorderPane();
            // Label label = new Label("Hello World!");
            // label.setFont(new Font("", 30));
            // label.setTextFill(Color.web("#0076a3"));
            //
            // root.setCenter(label);

            // Oefening 2
            // BorderPane root = new BorderPane();
            // TextField field = new TextField();
            //
            // root.setCenter(field);

            // Oefening 3
            // BorderPane root = new BorderPane();
            // FileInputStream file = new FileInputStream("C:\\Users\\Koning Max\\IdeaProjects\\iooa\\src\\week3\\opdracht1\\Interstellar.jpg");
            // Image image = new Image(file);
            // ImageView imageview = new ImageView(image);
            //
            // root.setCenter(imageview);

            // Oefening 4
            GridPane root = new GridPane();

            Label label1 = new Label("Enter username");
            Label label2 = new Label("Enter password");

            TextField field1 = new TextField();
            TextField field2 = new TextField();

            Button button1 = new Button("Submit");
            Button button2 = new Button("Clear");

            root.add(label1, 0,0);
            root.add(label2, 0, 1);
            root.add(field1, 1, 0);
            root.add(field2, 1, 1);
            root.add(button1, 0, 2);
            root.add(button2, 1, 2);

            Scene scene = new Scene(root, 500, 500);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }


    public static void main(String[] args) {
        launch(args);
    }
}
