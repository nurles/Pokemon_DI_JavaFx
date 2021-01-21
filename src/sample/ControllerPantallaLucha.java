package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ControllerPantallaLucha {


    private ControllerPantallaSeleccion ventana1Controller;

    @FXML
    public Label label;

    @FXML
    public ImageView imagen;

    public void mandarInfoDesdeVentana(Pokemon pokemon, ImageView imagenRecibida) {

        label.setText(pokemon.getNombre());
        imagen.setImage
    }

    public void setVentana1(ControllerPantallaSeleccion ventana1){
       ventana1Controller = ventana1;
       ventana1Controller.recibirInformacion("JAJAJAJA");

    }
}
