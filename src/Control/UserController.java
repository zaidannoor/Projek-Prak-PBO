/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Config.Connector;
import View.ViewLogin;
import Model.User;
import View.ViewDetail;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class UserController {
    Connector connector = new Connector();
    User user = new User();
    
    public void login(ViewLogin viewlogin){
        String username = viewlogin.getTxtUsername().getText();
        String password = viewlogin.getTxtPasword().getText();
        String data[][] = user.getUserByUsername(username);
        
        if(data[0][0] == null){ // mengecek ada atau tidak username tersebut di database
                                // jika tidak ada maka tampilkan pesan kesalahan
            JOptionPane.showMessageDialog(null,"Username anda tidak terdaftar dalam aplikasi kami");
            JOptionPane.showMessageDialog(null,"Mohon cek kembali username anda");
        }
        else{
            String passwordDB = data[0][2]; // mengambil password yang didapat dari query
            if (password.equals(passwordDB)) {
                new ViewDetail("Hello, "+username).setVisible(true);
                viewlogin.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Login gagal, password anda salah");
                JOptionPane.showMessageDialog(null,"tolong masukkan pasword anda dengan beanr");
            }
        }
    }
    
    public void regis(ViewLogin viewlogin){
        String username = viewlogin.getTxtUsername().getText();
        String password = viewlogin.getTxtPasword().getText();
        String data[][] = user.getUserByUsername(username);
        if(username.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(null,"Username atau password tidak boleh kosong");
        }
        else{
           if (data[0][0] == null) { // jika tidak ada username yang sama di db
                if(user.insertUser(username, password) > 0){
                    JOptionPane.showMessageDialog(null,"Registrasi Berhasil !!");
                }
                 else{
                    JOptionPane.showMessageDialog(null,"Registrasi Gagal !!");
                }
            }
            else{ // ada username di dalam db
                 JOptionPane.showMessageDialog(null,"Username " +username+" telah terdaftar");
            } 
        }   
    }
    
    
    
    
    
}
