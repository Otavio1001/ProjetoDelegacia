package rpdms;

import java.sql.*;
        
public class Banco {
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/RPDMS";
    private String user;
    private String pass;
    private Connection connect;
    private Statement statement;
    private ResultSet result;
    
    public Banco(String usuario, String senha){
        user = usuario;
        pass = senha;
    }
    
    public boolean Conecta(){
        try{
            Class.forName(driver);
            connect = DriverManager.getConnection(url, user, pass);
            return true;
        }
        catch(ClassNotFoundException | SQLException e){
            return false;
        }
    }
    
    public boolean Desconecta(){
        try{
            connect.close();
            return true;
        }
        catch (SQLException e){
            return false;
        }
    }
    
}
