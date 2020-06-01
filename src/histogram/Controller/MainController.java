package histogram.Controller;

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

    public void initialize() {
        // initialization here, if needed...
    }

    @FXML
    private void createHistogram(ActionEvent event) {
            System.out.println("Histogram click");
    }

    @FXML
    private void importFile(ActionEvent event) {
        System.out.println("Import Click");
    }
}