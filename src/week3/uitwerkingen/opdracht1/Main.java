package week3.uitwerkingen.opdracht1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Opdracht 1
            FlowPane root = createFlowPaneLogin();
            // Opdracht 2

            // Optioneel: Scrollbar (d.m.v. ScrollPane)
//            FlowPane fP = fillFlowPaneWithImages(fileInputStreamToImages(filmFileInputStream()));
//            // FlowPane fP = new FlowPane();
//            ScrollPane sP = new ScrollPane(fP);
//            BorderPane root = new BorderPane(sP);
            Scene scene = new Scene(root, 1200, 720);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Favo films");
            primaryStage.setFullScreen(true);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private FlowPane createFlowPaneLogin() {
        Text enterUsernameText = new Text("Enter Username");
        Text enterPasswordText = new Text("Enter Password");

        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();

        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");

        FlowPane flowPane = new FlowPane(Orientation.VERTICAL);

        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setVgap(5);

        flowPane.getChildren().add(enterUsernameText);
        flowPane.getChildren().add(usernameField);
        flowPane.getChildren().add(enterPasswordText);
        flowPane.getChildren().add(passwordField);
        flowPane.getChildren().add(submitButton);
        flowPane.getChildren().add(clearButton);

        return flowPane;
    }

    private ArrayList<FileInputStream> filmFileInputStream() throws FileNotFoundException {
        ArrayList<FileInputStream> list = new ArrayList<>();

        FileInputStream interstellar = new FileInputStream("C:\\Users\\Koning Max\\IdeaProjects\\iooa\\src\\week3\\uitwerkingen\\opdracht1\\Interstellar.jpg");
        FileInputStream rogueone = new FileInputStream("C:\\Users\\Koning Max\\IdeaProjects\\iooa\\src\\week3\\uitwerkingen\\opdracht1\\rogueone.jpg");
        FileInputStream startrek = new FileInputStream("C:\\Users\\Koning Max\\IdeaProjects\\iooa\\src\\week3\\uitwerkingen\\opdracht1\\startrek.jpg");

        list.add(interstellar);
        list.add(rogueone);
        list.add(startrek);

        return list;
    }

    private ArrayList<ImageView> fileInputStreamToImages(ArrayList<FileInputStream> list) throws FileNotFoundException {
        ArrayList<ImageView> ivList = new ArrayList<>();
        list.forEach(image -> {
            ImageView img = new ImageView(new Image(image));
            ivList.add(img);
        });
        return ivList;
    }

    private FlowPane fillFlowPaneWithImages(ArrayList<ImageView> ivList) {
        FlowPane imgPane = new FlowPane(Orientation.HORIZONTAL);
        imgPane.setPadding(new Insets(10, 10, 10, 10));
        imgPane.setVgap(10);

        ivList.forEach(image -> {
            imgPane.getChildren().add(image);
        });

        return imgPane;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
