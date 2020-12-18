package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    public Button boton;

    @FXML
    public Label nombre;

    @FXML
    public Label nivel;

    @FXML
    public Label vida;

    @FXML
    public ImageView gen;

    @FXML
    public ProgressBar pb;

    @FXML
    public ImageView imagen;

    @FXML
    public Label nombre2;

    @FXML
    public Label nivel2;

    @FXML
    public Label vida2;

    @FXML
    public ImageView gen2;

    @FXML
    public ProgressBar pb2;

    @FXML
    public ImageView imagen2;

    @FXML
    public Label nombre3;

    @FXML
    public Label nivel3;

    @FXML
    public Label vida3;

    @FXML
    public ImageView gen3;

    @FXML
    public ProgressBar pb3;

    @FXML
    public ImageView imagen3;

    @FXML
    public Label nombre4;

    @FXML
    public Label nivel4;

    @FXML
    public Label vida4;

    @FXML
    public ImageView gen4;

    @FXML
    public ProgressBar pb4;

    @FXML
    public ImageView imagen4;

    @FXML
    public Label nombre5;

    @FXML
    public Label nivel5;

    @FXML
    public Label vida5;

    @FXML
    public ImageView gen5;

    @FXML
    public ProgressBar pb5;

    @FXML
    public ImageView imagen5;

    @FXML
    public Label nombre6;

    @FXML
    public Label nivel6;

    @FXML
    public Label vida6;

    @FXML
    public ImageView gen6;

    @FXML
    public ProgressBar pb6;

    @FXML
    public ImageView imagen6;


    @FXML
    public void initialize(){
        //Pokemon 1
        Pokemon p = new Pokemon("Psyduck", 60, 20, 'M');
        datosPokemon(nombre, nivel, vida, gen, pb, p);
        //Pokemon 2
        Pokemon p2 = new Pokemon("Meowth", 20, 6, 'F');
        datosPokemon(nombre2, nivel2, vida2, gen2, pb2, p2);
        //Pokemon 3
        Pokemon p3 = new Pokemon("Snorlax", 350, 60, 'M');
        datosPokemon(nombre3, nivel3, vida3, gen3, pb3, p3);
        //Pokemon 4
        Pokemon p4 = new Pokemon("Bulbasaur", 42, 15, 'M');
        datosPokemon(nombre4, nivel4, vida4, gen4, pb4, p4);
        //Pokemon 5
        Pokemon p5 = new Pokemon("Pikachu", 105, 40, 'M');
        datosPokemon(nombre5, nivel5, vida5, gen5, pb5, p5);
        //Pokemon 6
        Pokemon p6 = new Pokemon("Rattata", 28, 10, 'F');
        datosPokemon(nombre6, nivel6, vida6, gen6, pb6, p6);

    }

    public void datosPokemon (Label nombre, Label nivel, Label vida, ImageView genero, ProgressBar pb, Pokemon p){
        nombre.setText(p.getNombre());
        nivel.setText("Nv "+p.getNivel());
        vida.setText(p.getVida()+"/"+ p.getVida());
        Image image;
        if(p.getGenero() == 'M'){
            image = new Image("img/masculino.png");
        }
        else{
            image = new Image("img/hembra.png");
        }
        genero.setImage(image);
        pb.setStyle("-fx-accent: green");
    }

    @FXML
    public void elegirPsyduck(){
        cambioValores(imagen, nombre, nivel, vida, boton);

        valoresIniciales(imagen2, nombre2, nivel2, vida2);
        valoresIniciales(imagen3, nombre3, nivel3, vida3);
        valoresIniciales(imagen4, nombre4, nivel4, vida4);
        valoresIniciales(imagen5, nombre5, nivel5, vida5);
        valoresIniciales(imagen6, nombre6, nivel6, vida6);
    }

    @FXML
    public void elegirMeowth(){
        cambioValores(imagen2, nombre2, nivel2, vida2, boton);

        valoresIniciales(imagen, nombre, nivel, vida);
        valoresIniciales(imagen3, nombre3, nivel3, vida3);
        valoresIniciales(imagen4, nombre4, nivel4, vida4);
        valoresIniciales(imagen5, nombre5, nivel5, vida5);
        valoresIniciales(imagen6, nombre6, nivel6, vida6);
    }

    @FXML
    public void elegirSnorlax(){
        cambioValores(imagen3, nombre3, nivel3, vida3, boton);

        valoresIniciales(imagen, nombre, nivel, vida);
        valoresIniciales(imagen2, nombre2, nivel2, vida2);
        valoresIniciales(imagen4, nombre4, nivel4, vida4);
        valoresIniciales(imagen5, nombre5, nivel5, vida5);
        valoresIniciales(imagen6, nombre6, nivel6, vida6);
    }

    @FXML
    public void elegirBulbasaur(){
        cambioValores(imagen4, nombre4, nivel4, vida4, boton);

        valoresIniciales(imagen, nombre, nivel, vida);
        valoresIniciales(imagen2, nombre2, nivel2, vida2);
        valoresIniciales(imagen3, nombre3, nivel3, vida3);
        valoresIniciales(imagen5, nombre5, nivel5, vida5);
        valoresIniciales(imagen6, nombre6, nivel6, vida6);
    }

    @FXML
    public void elegirPikachu(){
        cambioValores(imagen5, nombre5, nivel5, vida5, boton);

        valoresIniciales(imagen, nombre, nivel, vida);
        valoresIniciales(imagen2, nombre2, nivel2, vida2);
        valoresIniciales(imagen3, nombre3, nivel3, vida3);
        valoresIniciales(imagen4, nombre4, nivel4, vida4);
        valoresIniciales(imagen6, nombre6, nivel6, vida6);
    }

    @FXML
    public void elegirRattata(){
        cambioValores(imagen6, nombre6, nivel6, vida6, boton);

        valoresIniciales(imagen, nombre, nivel, vida);
        valoresIniciales(imagen2, nombre2, nivel2, vida2);
        valoresIniciales(imagen3, nombre3, nivel3, vida3);
        valoresIniciales(imagen4, nombre4, nivel4, vida4);
        valoresIniciales(imagen5, nombre5, nivel5, vida5);
    }

    public void cambioValores(ImageView imagen, Label nombre, Label nivel, Label vida, Button boton){
        imagen.setEffect(new DropShadow(20, Color.rgb(0, 0, 0, 0.8)));
        boton.setText("Siguiente");
        nombre.setTextFill(Color.PURPLE);
        nivel.setTextFill(Color.PURPLE);
        vida.setTextFill(Color.PURPLE);
    }

    public void valoresIniciales (ImageView imagen, Label nombre, Label nivel, Label vida){
        imagen.setEffect(null);
        nombre.setTextFill(Color.BLACK);
        nivel.setTextFill(Color.BLACK);
        vida.setTextFill(Color.BLACK);
    }
}
