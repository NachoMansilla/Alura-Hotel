package dao;

import factory.ConnectionFactory;
import modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    final private Connection con = new ConnectionFactory().recuperaConexion();

    public boolean authUser(String username, String password){

        String sql = "SELECT * FROM user WHERE  username = ?";

        try(PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()) {
                String storedPassword = resultSet.getString("password");

                return storedPassword.equals(password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
