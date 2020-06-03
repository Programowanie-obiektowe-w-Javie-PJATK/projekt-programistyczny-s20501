package histogram.Controller;

import histogram.Class.HistogramText;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController  {

    @FXML
    private Button histogramBtn ;

    @FXML
    private Button importBtn ;

    @FXML
    private TextArea textForm ;
    

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

    @FXML
    private void importFile(ActionEvent event) {
        System.out.println("Import Click");
    }
}