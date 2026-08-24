/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.edmonddubon.system.model;

/**
 *
 * @author informatica
 */
public class User {

    // 1. Atributos (Se agregó "password" que faltaba arriba)
    private String id_user;
    private String email;
    private String name;
    private String lastname;
    private String password;
    private String user;

    // 2. Constructor vacío
    public User() {
    }
    
    // 3. Constructor completo (Corregida la 'K' por '{' y se cerró el bloque)
    public User(String id_user, String email, String name, String lastname, String password, String user) {
        this.id_user = id_user;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.user = user;
    }

    // 4. Constructor alternativo (Se agregó la llave de cierre '}')
    public User(String id_user, String email, String name, String lastname, String user) {
        this.id_user = id_user;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.user = user;
    }

    // 5. Métodos Getter y Setter (Corregidas las llaves de cierre de cada método y de la clase)
    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
