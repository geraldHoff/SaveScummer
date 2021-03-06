import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Driver extends Application {

    Button saveButton;
    Button loadButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {

        //get paper image from resources, and pass it to an ImageView.
        Image background = new Image(
                getClass().getResource("resources/backgrounds/screen" +
                        (int)(Math.random() * (14) + 1) + ".jpg").toString()
        );
        ImageView paperView = new ImageView(background);
        paperView.setFitWidth(400);
        paperView.setFitHeight(400);

        window.setTitle("SaveScummer");



        //setup buttons
        saveButton = new Button("Copy Save File");
        saveButton.setTranslateY(330);
        saveButton.setTranslateX(256);
        saveButton.setOnAction(
                e -> {
                    ChooseCopyThread copyThread = new ChooseCopyThread();
                    try {
                        String blankString = copyThread.call();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
        );

        loadButton = new Button("Load Save File");
        loadButton.setTranslateY(330);
        loadButton.setTranslateX(56);
        loadButton.setOnAction(
                e -> {
                    ChooseLoadThread loadThread = new ChooseLoadThread();
                    try {
                        String blankString = loadThread.call();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
        );

        StackPane layout = new StackPane();
        layout.getChildren().add(saveButton);

        Group root = new Group(paperView, saveButton, loadButton);

        Scene scene = new Scene(root, 400, 400);
        window.setScene(scene);
        window.show();
    }
}