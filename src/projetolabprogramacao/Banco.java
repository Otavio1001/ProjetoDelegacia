package projetolabprogramacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Banco {
        String driver = "org.postgresql.Driver";
        String user   = "rpdadm";
        String senha = "rpd2019";
        String url = "jdbc:postgresql://localhost:5432/RPDMS";
        
        try
        {
            
        }
        catch (ClassNotFoundException ex)
        {
            System.err.print(ex.getMessage());
        } 
        catch (SQLException e)
        {
            System.err.print(e.getMessage());
        }
        
        public boolean setConecta() {
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão realizada com sucesso.");
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error" + e);
            return false;
        }
    }

    public boolean setDesconecta() {
        try {
            conection.close();
            return true;
        } catch(SQLException e) {
            System.out.println("Error:" + e);
            return false;
        }
    }
}
