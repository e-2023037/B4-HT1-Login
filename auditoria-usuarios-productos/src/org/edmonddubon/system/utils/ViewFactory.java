/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.edmonddubon.system.utils;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import org.edmonddubon.system.ClasePrincipal;

/**
 * @author informatica
 */
public class ViewFactory {

    private final String PATH_VIEWS = "/org/edmonddubon/system/view/";

    public Scene loadFileFXML(String nameFXML, int width, int height) {
        String pathOfFile = PATH_VIEWS + nameFXML;
        try {
            FXMLLoader loaderFXML = new FXMLLoader();
            URL urlFile = ClasePrincipal.class.getResource(pathOfFile);
            loaderFXML.setLocation(urlFile);

            return new Scene(loaderFXML.load(), width, height);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public void loadScene(String nameFXML) {
        Scene scene = null;
        try {
            switch (nameFXML) {
                case "login" -> {
                    SceneManager.getInstanciaSceneManager().getStagePrincipal().setTitle("LOGIN GUMIMANIA");
                    SceneManager.getInstanciaSceneManager().getStagePrincipal().setResizable(false);
                    scene = loadFileFXML("LoginView.fxml", 350, 475);
                }
                default ->
                    scene = loadFileFXML("LoginView.fxml", 300, 400);
            }
            SceneManager.getInstanciaSceneManager().changeScene(scene);
        } catch (Exception e) {
            System.out.println("LOL que mal hubo un error load scene");
            e.printStackTrace();
        }
    }

    public void viewLogin() {
        loadScene("login");
    }
}
