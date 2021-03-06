/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class CalculatorFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Calculadora"); //TITULO DE LA APLICACION
        stage.setResizable(false); //EVITAR QUE SE PUEDA MODIFICAR EL TAMAÑO DE LA VENTANA
        stage.sizeToScene(); // AJUSTAR LA VENTANA AL TAMAÑO DEL PANE (PARA QUE NO HAYA PADING EN LA VENTANA)
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
