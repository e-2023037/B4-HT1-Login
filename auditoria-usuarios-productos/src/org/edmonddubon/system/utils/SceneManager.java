/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.edmonddubon.system.utils;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author informatica
 */
public class SceneManager {

    private static SceneManager instanciaSceneManager;
    private Stage stagePrincipal;

    private SceneManager() {

    }

    public static SceneManager getInstanciaSceneManager() {
        if (instanciaSceneManager == null) {
            instanciaSceneManager = new SceneManager();
        }
        return instanciaSceneManager;
    }

    public void changeScene(Scene scene) {
        try {
            stagePrincipal.setScene(scene);
            stagePrincipal.sizeToScene();
            stagePrincipal.show();
        } catch (NullPointerException objetivoNulo) {
            System.out.println("LOL que mal hubo un error de objeto nulo en el scene manager");
        }

    }

    /**
     * Este metodo permite recibir un parametro de tipo Scene y es la escena que
     * se motrara en el Stage
     * @param scene Escena a mostrar en el Stage
     */
    public Stage getStagePrincipal() {
        return stagePrincipal;
    }

    public void setStagePrincipal(Stage stagePrincipal) {
        this.stagePrincipal = stagePrincipal;
    }

}
