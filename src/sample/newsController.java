package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class newsController{

    @FXML
    private WebView webView;

    @FXML
    private Button BackButton;

    @FXML
    void initialize(){
        assert BackButton != null : "fx:id=\"BackButton\" was not injected: check your FXML file 'statistics.fxml'.";

        BackButton.setOnAction(actionEvent -> {
            BackButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("file:icon.png"));
            stage.setTitle("Covid-19 Visualizer");
            stage.setResizable(false);
            stage.show();
        });
    }
}
