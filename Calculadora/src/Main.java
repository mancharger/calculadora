import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class Main extends Application{

    public static void main(String[] args) throws Exception{
        launch(args);

    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmloader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = fxmloader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Calculadora das Galáxias");
        primaryStage.setScene(tela);
        primaryStage.show();

    }
    
    // Será criado outro arquivo para continuação da calculadora, utilizando uma interface gráfica
     
     

}