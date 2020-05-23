package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StatisticsController {

    @FXML
    private Button BackButton;

    @FXML
    private Button Kazakhstan;


    @FXML
    void initialize(){
        assert BackButton != null : "fx:id=\"BackButton\" was not injected: check your FXML file 'statistics.fxml'.";
        assert Kazakhstan != null : "fx:id=\"Kazakhstan\" was not injected: check your FXML file 'statistics.fxml'.";
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

        Kazakhstan.setOnAction(actionEvent -> {
            Kazakhstan.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/webview.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });
    }
}