
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    Connection conn = null;
    
    public boolean Connection (){
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uc11", "root", "bancodedadosbrabao");
            return true;
            
        } catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + ex.getMessage());
        return false;
        }
        
    }
    
public void desconectar(){
try{    
conn.close();
}catch(SQLException ex){
    
}

}
}
