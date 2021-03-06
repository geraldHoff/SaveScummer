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
        //Image background = new Image(
        //        getClass().getResource("resources/screen1.jpg").toString()
       // );
       // ImageView paperView = new ImageView(background);
        //paperView.setPreserveRatio(true);

        window.setTitle("SaveScummer");

        JFileChooser fileChooser = new JFileChooser(".");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        button = new Button("Click me");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        //Group root = new Group(paperView);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
