package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Covid-19 Visualizer");
        primaryStage.setScene(new Scene(root, 1200, 675));
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("file:icon.png"));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
