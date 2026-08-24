package org.edmonddubon.system.repository;

import org.edmonddubon.system.config.ConexionDB;
import org.edmonddubon.system.model.User;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class UserRepository implements UserInterface {

    private CallableStatement callSP;
    private ConexionDB conexionDB; 

    public UserRepository() {
        this.conexionDB = ConexionDB.getInstanciaConexionDB();
    }

    @Override
    public void create(User user) {
        try {
            callSP = conexionDB.getConnection()
                    .prepareCall("{call sp_create_users(?,?,?,?,?)}");
            callSP.setString(1, user.getName());
            callSP.setString(2, user.getLastname());
            callSP.setString(3, user.getEmail());
            callSP.setString(4, user.getUser());
            callSP.setString(5, user.getPassword());

            callSP.execute();  

        } catch (SQLException e) {  
            System.out.println("Error SQL: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
