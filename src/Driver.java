import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Driver extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {

        //get paper image from resources, and pass it to an ImageView.
        Image aiBackground = new Image(
                getClass().getResource("resources/backgrounds/screen" +
                        (int)(Math.random() * (14) + 1) + ".jpg").toString()
        );
        ImageView paperView = new ImageView(aiBackground);
        paperView.setFitWidth(400);
        paperView.setFitHeight(400);

        window.setTitle("SaveScummer");

        button = new Button("Click me");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Group root = new Group(paperView);

        Scene scene = new Scene(root, 400, 400);
        window.setScene(scene);
        window.show();
    }
}
