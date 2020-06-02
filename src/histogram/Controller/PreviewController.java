package histogram.Controller;

import histogram.Class.HistogramText;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PreviewController {

  private HistogramText histogram;


    public void setHistogram(HistogramText histogram) {
        this.histogram = histogram;
    }
}