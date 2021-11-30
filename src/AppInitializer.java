import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("Views/LogInForm.fxml"));
        Scene scene = new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("A Plus Education Center");
        primaryStage.getIcons().add(new Image("assect/f6e3cfc6f0571c4fb2c1a4244345797e.png"));
        primaryStage.show();

        /*primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Views/LogInForm.fxml"))));
        primaryStage.setResizable(false);
        primaryStage.setTitle("A Plus Education Center");
        primaryStage.show();*/
    }
}
