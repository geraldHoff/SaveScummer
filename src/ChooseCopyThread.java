import javafx.concurrent.Task;
import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class ChooseCopyThread extends Task<String> {

    @Override
    protected String call() throws Exception {

        File file;
        Scanner fileIn;
        int response;

        String directory = System.getProperty("user.home") +
                "\\Documents\\Paradox Interactive\\Europa Universalis IV\\save games";

        JFileChooser fileChooser = new JFileChooser(directory);
        fileChooser.setDialogTitle(directory);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setOpaque(true);
        response = fileChooser.showOpenDialog(null);

        return null;
    }
}
