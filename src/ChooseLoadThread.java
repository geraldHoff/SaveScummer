import javafx.concurrent.Task;
import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class ChooseLoadThread extends Task<String> {

    @Override
    protected String call() throws Exception {

        File file;
        Scanner fileIn;
        int response;

        JFileChooser fileChooser = new JFileChooser(".");
        fileChooser.setDialogTitle("Choose file to load");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        response = fileChooser.showOpenDialog(null);

        return null;
    }
}