package histogram;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("View/main.fxml"));

        Scene MainScene = new Scene(root, 400, 375);
        primaryStage.setScene(MainScene);
        primaryStage.setTitle("Histogram");
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
