package histogram.Controller;

import histogram.Class.HistogramText;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML
    private Button histogramBtn ;

    @FXML
    private Button importBtn ;

    @FXML
    private TextArea textForm ;
    

    @FXML
    private void createHistogram(ActionEvent event) {
        HistogramText histogram = new HistogramText(textForm.getText());

           System.out.println( histogram.getHistogram());
    }

    @FXML
    private void importFile(ActionEvent event) {
        System.out.println("Import Click");
    }
}