/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Victor
 */
public class libretaDirecciones extends Application {
    private Stage escenarioPrincipal;
    private BorderPane layoutPrincipal;
    private AnchorPane vistaPersona;
    
    @Override
    public void start(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
        
        //Establezco el título
        this.escenarioPrincipal.setTitle("Libreta de Direcciones");
        
        //Inicializo el layout principal
        initLayoutPrincipal();
        
        //Muestro la vista persona
        showVistaPersona();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void initLayoutPrincipal() {
        //Cargo el layout principal a partir de la vistaPrincipal.fxml
        FXMLLoader loader = new FXMLLoader();
        URL location = libretaDirecciones.class.getResource("../view/vistaPrincipal.fxml");
        loader.setLocation(location);
        try{
            layoutPrincipal = loader.load();
        }catch(IOException ex){}
        
        //Cargo y muestro la escena que contiene ese layout principal
        Scene escena = new Scene(layoutPrincipal);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }

    public void showVistaPersona() {
        
    }
    
}
