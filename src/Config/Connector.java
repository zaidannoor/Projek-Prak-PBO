/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class Connector {
    protected String DBurl = "jdbc:mysql://localhost/inventaris";
    protected String DBusername = "root";
    protected String DBpassword = "";
    public java.sql.Connection koneksi;
    public Statement statement;
    public Connector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (java.sql.Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            //System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
            System.out.println(ex);
        }
    }
}
