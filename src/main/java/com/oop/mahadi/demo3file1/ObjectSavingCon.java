package com.oop.mahadi.demo3file1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ObjectSavingCon {

    @FXML
    private TextArea textAreafxid;
    List<Serializable> objectsToSave = new ArrayList<>();
    @FXML
    void buttonOnaction(ActionEvent event) {
        objectsToSave.add(new P("Object 1"));
        objectsToSave.add(new P("Object 2"));
        objectsToSave.add(new P("Object 3"));



        String filePath2 = "datafile.bin"; // Your existing file path

        // Append new objects to the existing file
        AppendObjects.appendObjectsToFile(objectsToSave, filePath2);


        String filePath = "datafile2.bin"; // Specified file name

        // Save objects
        SaveObjects.saveObjectsToFile(objectsToSave, filePath);

        // Load objects
        List<Serializable> loadedObjects = LoadObjects.loadObjectsFromFile(filePath);
        for (Serializable obj : loadedObjects) {
            System.out.println(obj.toString());
        }

    }

    @javafx.fxml.FXML
    public void initialize() {


    }






}
