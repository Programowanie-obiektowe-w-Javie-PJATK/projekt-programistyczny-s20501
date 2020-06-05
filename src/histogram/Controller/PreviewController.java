package histogram.Controller;
import histogram.Class.HistogramText;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;


public class PreviewController {

    @FXML
    private Text textForm ;

    @FXML
    private GridPane gp;



  private HistogramText histogram;

    // Konstruktor ustawia histogram
    public void setHistogram(HistogramText histogram) {
        this.histogram = histogram;

        textForm.setText(this.histogram.getHistogram());
    }

    // Otwiera okienko z wyborem
    public void saveFile() {
        Stage stage = (Stage) gp.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        // Pokazuje dialog do wyboru pliku
        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            trySaveTextToFile(histogram.getHistogram(), file);
        }


    }
    // Probuje zapisac plik
    private void trySaveTextToFile(String content, File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(content);
            writer.close();
        } catch (IOException ex) {
            System.out.print(ex);
        }
    }
}