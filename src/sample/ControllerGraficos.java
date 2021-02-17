package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

import java.net.URL;
import java.util.ResourceBundle;


public class ControllerGraficos implements Initializable {

    @FXML
    private PieChart pieChart;

    public static double danioPokemonAmigo;
    public static double danioPokemonRival;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        double valor = danioPokemonAmigo;
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Mi Pokemon", valor),
                        new PieChart.Data("Pokemon Rival", danioPokemonRival));
        pieChart.setData(pieChartData);


    }

    public void recibirDatosPieChart(double vidaPokemonAmigo, double vidaPokemonRival){
        danioPokemonAmigo = vidaPokemonAmigo;
        danioPokemonRival = vidaPokemonRival;
    }


}



