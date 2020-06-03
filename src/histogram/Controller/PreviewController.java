package histogram.Controller;

import histogram.Class.HistogramText;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PreviewController {

    @FXML
    private Text textForm ;


  private HistogramText histogram;




    public void setHistogram(HistogramText histogram) {
        this.histogram = histogram;

        textForm.setText(this.histogram.getHistogram());
    }
}