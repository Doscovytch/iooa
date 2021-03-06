package week3.opdracht4;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class JavaFXApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("Hello World!");

            FlowPane root = createFlowPaneLogin();

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

    public FlowPane createFlowPaneLogin() {
        FlowPane root = new FlowPane(Orientation.VERTICAL);
        root.setVgap(6);
        root.setHgap(5);
        root.setPrefWrapLength(250);

        Label label1 = new Label("Enter username");
        Label label2 = new Label("Enter password");

        TextField field1 = new TextField();
        TextField field2 = new TextField();

        Button button1 = new Button("Submit");
        Button button2 = new Button("Clear");

        root.getChildren().add(label1);
        root.getChildren().add(field1);

        root.getChildren().add(label2);
        root.getChildren().add(field2);

        root.getChildren().add(button1);
        root.getChildren().add(button2);

        return root;
    }

}
