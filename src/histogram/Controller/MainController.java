package histogram.Controller;

import histogram.Class.HistogramText;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.FileChooser;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainController   {

    @FXML
    private TextArea textForm ;

    @FXML
    private GridPane gp;



    // Tworzy histogram
    @FXML
    private void createHistogram(ActionEvent event) throws IOException {

        // Sprawdza czy puste
       if  (textForm.getText() == null || textForm.getText().trim().isEmpty()) {
            return;
        }


        HistogramText histogram = new HistogramText(textForm.getText());

        FXMLLoader  loader  = new FXMLLoader(getClass().getResource("../View/preview.fxml"));
        Parent root = loader.load();

        PreviewController previewController = loader.getController();
        previewController.setHistogram(histogram);


        Stage preview = new Stage();
        preview.setScene(new Scene(root,200,200));


        preview.setTitle("Podgląd");
        preview.initModality(Modality.APPLICATION_MODAL);
        preview.show();

    }
    // Importuje zawartość pliku
    @FXML
    private void importFile() throws FileNotFoundException {
        Stage stage = (Stage) gp.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        File file =fileChooser.showOpenDialog(stage);
        Scanner scan = new Scanner(file);
        scan.useDelimiter("\\Z");
        textForm.setText( scan.next());
    }
}