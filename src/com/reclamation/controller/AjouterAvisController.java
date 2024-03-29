/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reclamation.controller;

import com.reclamation.controller.*;
import com.reclamation.dao.AvisDao;
import com.reclamation.entity.Avis;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class AjouterAvisController implements Initializable {

    @FXML
    private Pane BoutonValider;
    @FXML
    private Button btn;
    @FXML
    private JFXButton btn_sad;
    @FXML
    private JFXButton btn_happy;
    @FXML
    private JFXButton btn_undffrent;
    @FXML
    private JFXButton btn_sohappy;
    @FXML
    private JFXTextArea commentaire;
    @FXML
    private JFXButton home;
    @FXML
    private JFXButton quiz;
    @FXML
    private JFXButton rating;
    @FXML
    private JFXButton reclamation;
    
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Avis Ajouté avec succés!");
        btn_sad.setOnAction((event) -> {
            Avis Av = new Avis("Sad", commentaire.getText());
            AvisDao pdao = AvisDao.getInstance();
            pdao.insert(Av);
            alert.show();
             System.out.println(commentaire.getText());
                   });
        
        btn_happy.setOnAction((event1) -> {
           Avis Av = new Avis("happy", commentaire.getText());
            AvisDao pdao = AvisDao.getInstance();
            pdao.insert(Av);
     
alert.show();
        });
        
        btn_sohappy.setOnAction((event2) -> {
           Avis Av = new Avis("sohappy", commentaire.getText());
            AvisDao pdao = AvisDao.getInstance();
            pdao.insert(Av);
            alert.show();

        });
        
        btn_undffrent.setOnAction((event3) -> {
           Avis Av = new Avis("Undifferent", commentaire.getText());
            AvisDao pdao = AvisDao.getInstance();
            pdao.insert(Av);
            alert.show();

        });
       

        commentaire.setText("");
    }

    @FXML
    private void retour(ActionEvent event) {
        try {
                Parent page1 = FXMLLoader.load(getClass().getResource("/com/reclamation/view/Accueil.fxml"));
                Scene scene = new Scene(page1);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @FXML
    private void reclam(ActionEvent event) {
        try {
                Parent page1 = FXMLLoader.load(getClass().getResource("/com/reclamation/view/AjouterReclamation.fxml"));
                Scene scene = new Scene(page1);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
