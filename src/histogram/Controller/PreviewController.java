package histogram.Controller;

import histogram.Class.HistogramText;
import javafx.fxml.FXML;
import javafx.scene.text.Text;


public class PreviewController {

    @FXML
    private Text textForm ;



  private HistogramText histogram;


    public void setHistogram(HistogramText histogram) {
        this.histogram = histogram;

        textForm.setText(this.histogram.getHistogram());
    }


}