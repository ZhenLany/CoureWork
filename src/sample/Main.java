package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Редактор диаграмм пакетов");
        primaryStage.setScene(new Scene(root, Color.GRAY));
        primaryStage.getIcons().add(new Image("Img/Redactor.png"));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
