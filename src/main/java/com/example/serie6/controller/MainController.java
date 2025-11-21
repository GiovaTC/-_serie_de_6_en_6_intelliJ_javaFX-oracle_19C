package com.example.serie6.controller;

import com.example.serie6.database.OracleConnection;
import com.example.serie6.model.Serie;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MainController {
    @FXML
    private Label lblResultado;

    public void generarSerie(ActionEvent actionEvent) {
        Serie serie = new Serie();
        int resultado = serie.calcular(100);
        lblResultado.setText("Resultado: " + resultado);

        try (Connection con = OracleConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement("INSERT INTO SERIES(VALOR) VALUES(?)");
            ps.setInt(1, resultado);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}   
