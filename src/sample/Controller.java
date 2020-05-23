package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Controller extends Application {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button StatButton;

    @FXML
    private Button HealthButton;

    @FXML
    private Button NewsButton;

    @FXML
    private Button SympButton;

    @FXML
    void initialize() {
        assert StatButton != null : "fx:id=\"StatButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert HealthButton != null : "fx:id=\"HealthButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert NewsButton != null : "fx:id=\"NewsButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert SympButton != null : "fx:id=\"SympButton\" was not injected: check your FXML file 'sample.fxml'.";
        StatButton.setOnAction(actionEvent -> {
            StatButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/statistics.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("file:icon.png"));
            stage.setTitle("Статистика по Covid-19");
            stage.setResizable(false);
            stage.show();
        });

        NewsButton.setOnAction(actionEvent -> {
            NewsButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/news.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("file:icon.png"));
            stage.setTitle("Новости Covid-19");
            stage.setResizable(false);
            stage.show();
        });

        SympButton.setOnAction(actionEvent -> {
            SympButton.getScene().getWindow().hide();

            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(getClass().getResource("/sample/Symp.fxml"));

            try {
                loader1.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root1 = loader1.getRoot();
            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root1));
            stage1.getIcons().add(new Image("file:icon.png"));
            stage1.setTitle("Симптомы Covid-19");
            stage1.setResizable(false);
            stage1.show();
        });

        HealthButton.setOnAction(actionEvent -> {
            HealthButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/Health.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("file:icon.png"));
            stage.setTitle("Лечение Covid-19");
            stage.setResizable(false);
            stage.show();
        });
    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
