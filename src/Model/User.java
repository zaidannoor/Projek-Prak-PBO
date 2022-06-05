/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Config.Connector;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class User {
    Connector connector = new Connector();
    
    public String[][] getUserByUsername(String username){
        String data[][] = new String[1][3];
        try{
            String query = "SELECT id,username,password FROM users WHERE username='"+username+"'";
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query);
            while(resultSet.next()){ //konversi tabel ke string
                data[0][0] = resultSet.getString("id"); 
                data[0][1] = resultSet.getString("username"); 
                data[0][2] = resultSet.getString("password");
            }
            connector.statement.close();
           
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }finally{
            return data;
        }
    }
    
    public int insertUser(String username,String password){
        try {
            String query = "INSERT INTO users (username,password,role) "
                    + "VALUES ('"+username+"','"+password+"','pegawai')";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query); // eksekusi query

            
            return 1;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            return 0;
        }
    }
}
