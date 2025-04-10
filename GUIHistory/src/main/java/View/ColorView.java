package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ColorView extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ColorView.class.getResource("color-main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Color View");
        stage.setScene(scene);
        stage.show();
    }
}
