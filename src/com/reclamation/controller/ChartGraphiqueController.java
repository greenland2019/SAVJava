/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reclamation.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;

/**
 * FXML Controller class
 *
 * @author wiemhjiri
 */
public class ChartGraphiqueController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private BarChart<String, Integer> chart;

    @FXML
    private CategoryAxis xaxis;

    private ObservableList<String> names = FXCollections.observableArrayList();

    private ListData listData = new ListData();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        names = FXCollections
//                .observableArrayList(listData.getPersons().stream()
//                        .map(p -> p.getNom()).collect(Collectors.toList()));
//    xaxis.setCategories(names);
    
    
    }
//    public void setXYData(List<Personne> persons) {
//        
//        
//        List<String> distinctNames=persons.stream()
//                .map(p->p.getNom())
//                .distinct()
//                .collect(Collectors.toList());
//        
//       
//        
//        int[] nameCounter =new int[distinctNames.size()];
//       
//        
//        
//        for (Reclamation p : persons) {
//            String name = p.getNom();
//             nameCounter[]++;
//        }
//
//        XYChart.Series<String, Integer> series = new XYChart.Series<>();
//
//        // Create a XYChart.Data object for each month. Add it to the series.
//        for (int i = 0; i < monthCounter.length; i++) {
//            series.getData().add(new XYChart.Data<>(monthNames.get(i), monthCounter[i]));
//        }
//
//        barChart.getData().add(series);
//    }
    
}
