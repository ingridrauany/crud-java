package Controle;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    Connection con = null;
    
    public void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AulaQualidade?zeroDateTimeBehavior=convertToNull", "root", "");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void desconectar(){
        try{
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
