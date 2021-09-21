import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBCConnection {

    private String sgbd, server, porta,banco,usuario,senha,strCnx;

    //construtor

    public DBCConnection(){
        //String de conexão -> "jdbc:mysql://localhost:3306/unip_alpoo"
        sgbd ="mysql";
        server = "localhost";
        porta = "3306";
        banco ="unip_alpoo";
        usuario = "root";
        senha = "Dtg53nop159";
        strCnx= "jdbc" + sgbd +"://" + server + ":" + porta + "/" + banco;
    }
    // faz conexão
    public  Connection conectar() throws SQLException{
       return DriverManager.getConnection(strCnx, usuario, senha);
    }
    
}
