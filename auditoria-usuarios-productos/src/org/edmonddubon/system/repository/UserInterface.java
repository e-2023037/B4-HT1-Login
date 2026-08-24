/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.edmonddubon.system.repository;

import org.edmonddubon.system.model.User;

/**
 *
 * @author informatica
 */
// 1. Cambiado de 'class' a 'interface' directamente
public interface UserInterface {
    
    // 2. Definición del método abstracto
    void create(User user);
}

