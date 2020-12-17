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
        gen.setImage(image);
        pb.setStyle("-fx-accent: green");
        //Pokemon 2
        Pokemon p2 = new Pokemon("Meowth", 20, 6, 'F');
        nombre2.setText(p2.getNombre());
        nivel2.setText("Nv "+p2.getNivel());
        vida2.setText(p2.getVida()+"/"+ p2.getVida());
        Image image2;
        if(p2.getGenero() == 'M'){
            image2 = new Image("img/masculino.png");
        }
        else{
            image2 = new Image("img/hembra.png");
        }
        gen2.setImage(image2);
        pb2.setStyle("-fx-accent: green");
        //Pokemon 3
        Pokemon p3 = new Pokemon("Snorlax", 350, 60, 'M');
        nombre3.setText(p3.getNombre());
        nivel3.setText("Nv "+p3.getNivel());
        vida3.setText(p3.getVida()+"/"+ p3.getVida());
        Image image3;
        if(p3.getGenero() == 'M'){
            image3 = new Image("img/masculino.png");
        }
        else{
            image3 = new Image("img/hembra.png");
        }
        gen3.setImage(image3);
        pb3.setStyle("-fx-accent: green");
        //Pokemon 4
        Pokemon p4 = new Pokemon("Bulbasaur", 42, 15, 'M');
        nombre4.setText(p4.getNombre());
        nivel4.setText("Nv "+p4.getNivel());
        vida4.setText(p4.getVida()+"/"+ p4.getVida());
        Image image4;
        if(p4.getGenero() == 'M'){
            image4 = new Image("img/masculino.png");
        }
        else{
            image4 = new Image("img/hembra.png");
        }
        gen4.setImage(image4);
        pb4.setStyle("-fx-accent: green");
        //Pokemon 5
        Pokemon p5 = new Pokemon("Pikachu", 105, 40, 'M');
        nombre5.setText(p5.getNombre());
        nivel5.setText("Nv "+p5.getNivel());
        vida5.setText(p5.getVida()+"/"+ p5.getVida());
        Image image5;
        if(p5.getGenero() == 'M'){
            image5 = new Image("img/masculino.png");
        }
        else{
            image5 = new Image("img/hembra.png");
        }
        gen5.setImage(image5);
        pb5.setStyle("-fx-accent: green");
        //Pokemon 6
        Pokemon p6 = new Pokemon("Rattata", 28, 10, 'F');
        nombre6.setText(p6.getNombre());
        nivel6.setText("Nv "+p6.getNivel());
        vida6.setText(p6.getVida()+"/"+ p6.getVida());
        Image image6;
        if(p6.getGenero() == 'M'){
            image6 = new Image("img/masculino.png");
        }
        else{
            image6 = new Image("img/hembra.png");
        }
        gen6.setImage(image6);
        pb6.setStyle("-fx-accent: green");

    }

    @FXML
    public void elegirPsyduck(){
        imagen.setEffect(new DropShadow(20, Color.rgb(0, 0, 0, 0.8)));
        boton.setText("Siguiente");
        nombre.setTextFill(Color.RED);
        nivel.setTextFill(Color.RED);
        vida.setTextFill(Color.RED);
        //Ponemos los valores de los demas pokemon como al inicio
        imagen2.setEffect(null);
        nombre2.setTextFill(Color.BLACK);
        nivel2.setTextFill(Color.BLACK);
        vida2.setTextFill(Color.BLACK);
        imagen3.setEffect(null);
        nombre3.setTextFill(Color.BLACK);
        nivel3.setTextFill(Color.BLACK);
        vida3.setTextFill(Color.BLACK);
        imagen4.setEffect(null);
        nombre4.setTextFill(Color.BLACK);
        nivel4.setTextFill(Color.BLACK);
        vida4.setTextFill(Color.BLACK);
        imagen5.setEffect(null);
        nombre5.setTextFill(Color.BLACK);
        nivel5.setTextFill(Color.BLACK);
        vida5.setTextFill(Color.BLACK);
        imagen6.setEffect(null);
        nombre6.setTextFill(Color.BLACK);
        nivel6.setTextFill(Color.BLACK);
        vida6.setTextFill(Color.BLACK);
    }

    @FXML
    public void elegirMeowth(){
        imagen2.setEffect(new DropShadow(20, Color.rgb(0, 0, 0, 0.8)));
        boton.setText("Siguiente");
        nombre2.setTextFill(Color.RED);
        nivel2.setTextFill(Color.RED);
        vida2.setTextFill(Color.RED);

        imagen.setEffect(null);
        nombre.setTextFill(Color.BLACK);
        nivel.setTextFill(Color.BLACK);
        vida.setTextFill(Color.BLACK);
        imagen3.setEffect(null);
        nombre3.setTextFill(Color.BLACK);
        nivel3.setTextFill(Color.BLACK);
        vida3.setTextFill(Color.BLACK);
        imagen4.setEffect(null);
        nombre4.setTextFill(Color.BLACK);
        nivel4.setTextFill(Color.BLACK);
        vida4.setTextFill(Color.BLACK);
        imagen5.setEffect(null);
        nombre5.setTextFill(Color.BLACK);
        nivel5.setTextFill(Color.BLACK);
        vida5.setTextFill(Color.BLACK);
        imagen6.setEffect(null);
        nombre6.setTextFill(Color.BLACK);
        nivel6.setTextFill(Color.BLACK);
        vida6.setTextFill(Color.BLACK);
    }

    @FXML
    public void elegirSnorlax(){
        imagen3.setEffect(new DropShadow(20, Color.rgb(0, 0, 0, 0.8)));
        boton.setText("Siguiente");
        nombre3.setTextFill(Color.RED);
        nivel3.setTextFill(Color.RED);
        vida3.setTextFill(Color.RED);

        imagen.setEffect(null);
        nombre.setTextFill(Color.BLACK);
        nivel.setTextFill(Color.BLACK);
        vida.setTextFill(Color.BLACK);
        imagen2.setEffect(null);
        nombre2.setTextFill(Color.BLACK);
        nivel2.setTextFill(Color.BLACK);
        vida2.setTextFill(Color.BLACK);
        imagen4.setEffect(null);
        nombre4.setTextFill(Color.BLACK);
        nivel4.setTextFill(Color.BLACK);
        vida4.setTextFill(Color.BLACK);
        imagen5.setEffect(null);
        nombre5.setTextFill(Color.BLACK);
        nivel5.setTextFill(Color.BLACK);
        vida5.setTextFill(Color.BLACK);
        imagen6.setEffect(null);
        nombre6.setTextFill(Color.BLACK);
        nivel6.setTextFill(Color.BLACK);
        vida6.setTextFill(Color.BLACK);
    }

    @FXML
    public void elegirBulbasaur(){
        imagen4.setEffect(new DropShadow(20, Color.rgb(0, 0, 0, 0.8)));
        boton.setText("Siguiente");
        nombre4.setTextFill(Color.RED);
        nivel4.setTextFill(Color.RED);
        vida4.setTextFill(Color.RED);

        imagen.setEffect(null);
        nombre.setTextFill(Color.BLACK);
        nivel.setTextFill(Color.BLACK);
        vida.setTextFill(Color.BLACK);
        imagen2.setEffect(null);
        nombre2.setTextFill(Color.BLACK);
        nivel2.setTextFill(Color.BLACK);
        vida2.setTextFill(Color.BLACK);
        imagen3.setEffect(null);
        nombre3.setTextFill(Color.BLACK);
        nivel3.setTextFill(Color.BLACK);
        vida3.setTextFill(Color.BLACK);
        imagen5.setEffect(null);
        nombre5.setTextFill(Color.BLACK);
        nivel5.setTextFill(Color.BLACK);
        vida5.setTextFill(Color.BLACK);
        imagen6.setEffect(null);
        nombre6.setTextFill(Color.BLACK);
        nivel6.setTextFill(Color.BLACK);
        vida6.setTextFill(Color.BLACK);
    }

    @FXML
    public void elegirPikachu(){
        imagen5.setEffect(new DropShadow(20, Color.rgb(0, 0, 0, 0.8)));
        boton.setText("Siguiente");
        nombre5.setTextFill(Color.RED);
        nivel5.setTextFill(Color.RED);
        vida5.setTextFill(Color.RED);

        imagen.setEffect(null);
        nombre.setTextFill(Color.BLACK);
        nivel.setTextFill(Color.BLACK);
        vida.setTextFill(Color.BLACK);
        imagen2.setEffect(null);
        nombre2.setTextFill(Color.BLACK);
        nivel2.setTextFill(Color.BLACK);
        vida2.setTextFill(Color.BLACK);
        imagen3.setEffect(null);
        nombre3.setTextFill(Color.BLACK);
        nivel3.setTextFill(Color.BLACK);
        vida3.setTextFill(Color.BLACK);
        imagen4.setEffect(null);
        nombre4.setTextFill(Color.BLACK);
        nivel4.setTextFill(Color.BLACK);
        vida4.setTextFill(Color.BLACK);
        imagen6.setEffect(null);
        nombre6.setTextFill(Color.BLACK);
        nivel6.setTextFill(Color.BLACK);
        vida6.setTextFill(Color.BLACK);
    }

    @FXML
    public void elegirRattata(){
        imagen6.setEffect(new DropShadow(20, Color.rgb(0, 0, 0, 0.8)));
        boton.setText("Siguiente");
        nombre6.setTextFill(Color.RED);
        nivel6.setTextFill(Color.RED);
        vida6.setTextFill(Color.RED);

        imagen.setEffect(null);
        nombre.setTextFill(Color.BLACK);
        nivel.setTextFill(Color.BLACK);
        vida.setTextFill(Color.BLACK);
        imagen2.setEffect(null);
        nombre2.setTextFill(Color.BLACK);
        nivel2.setTextFill(Color.BLACK);
        vida2.setTextFill(Color.BLACK);
        imagen3.setEffect(null);
        nombre3.setTextFill(Color.BLACK);
        nivel3.setTextFill(Color.BLACK);
        vida3.setTextFill(Color.BLACK);
        imagen4.setEffect(null);
        nombre4.setTextFill(Color.BLACK);
        nivel4.setTextFill(Color.BLACK);
        vida4.setTextFill(Color.BLACK);
        imagen5.setEffect(null);
        nombre5.setTextFill(Color.BLACK);
        nivel5.setTextFill(Color.BLACK);
        vida5.setTextFill(Color.BLACK);
    }
}
