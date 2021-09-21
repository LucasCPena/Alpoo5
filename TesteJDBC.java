import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
public class TesteJDBC {
    //main
    public static void main(String[] args) {
        DBCConnection db = new DBCConnection();
        Connection conn = null;
        PreparedStatement ps =null;
        String sqlString = "INSERT INTO tblivro(titulo,edicao) VALUES ('0 ABC do jAVA', 2)";

        try{
            //cria conexão
            conn = db.conectar();
            //cria statment
            ps = conn.prepareStatement(sqlString);

        }
        catch(SQLException exc){
              JOptionPane.showMessageDialog(null,"fds unip");
              
        }
        System.exit(0);


    }
}
