/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.edmonddubon.system.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author informatica
 */
public class ConexionDB {

    private static ConexionDB instanciaConexionDB;
    private Connection connection;

    private ConexionDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager
                    .getConnection("jdbc:mysql://"
                            + Enviroment.LOCATION_SERVICE + "/"
                            + Enviroment.DATA_BASE,
                            Enviroment.USER,
                            Enviroment.PASWORD);
            System.out.println("Conexión establecida exitosamente");
        } catch (ClassNotFoundException classNotFound) {
            System.out.println("Error: Driver de MySQL no encontrado. Verifica que tengas el JAR de MySQL Connector");
            classNotFound.printStackTrace();
        } catch (SQLException sqlExeption) {
            System.out.println("Error de conexión SQL: " + sqlExeption.getMessage());
            System.out.println("Verifica que el servidor MySQL esté corriendo y los datos de conexión sean correctos");
            sqlExeption.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static ConexionDB getInstanciaConexionDB() {
        if (instanciaConexionDB == null) {
            instanciaConexionDB = new ConexionDB();
        }
        return instanciaConexionDB;
    }

    public Connection getConnection() {
        return connection;
    }

    public void cerrarConexion() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada correctamente");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
