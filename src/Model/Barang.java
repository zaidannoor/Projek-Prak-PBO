/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Config.Connector;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class Barang {
    Connector connector = new Connector();
    
    public int getSizeBarang(){
        int size = 0;
        try{
            String query = "SELECT count(*) as jumlah FROM barang";
            connector.statement = connector.koneksi.createStatement();
            ResultSet rs = connector.statement.executeQuery(query);
            while(rs.next()){
                size = rs.getInt("jumlah");
            }
            
            connector.statement.close();
            return size;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return 0;
        }finally{
            
        }
    }
    
    public String[][] getAllBarang(){
        String data[][] = new String[getSizeBarang()][6];
        int jmlData = 0;
        try{
            String query = "SELECT * FROM barang";
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query);
            while(resultSet.next()){ //konversi tabel ke string
                data[jmlData][0] = resultSet.getString("id"); 
                data[jmlData][1] = resultSet.getString("kategori"); 
                data[jmlData][2] = resultSet.getString("stok");
                data[jmlData][3] = resultSet.getString("bBaik");
                data[jmlData][4] = resultSet.getString("bRusak");
                data[jmlData][5] = resultSet.getString("keterangan");
                jmlData++; 
            }
            connector.statement.close();
           
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }finally{
            return data;
        }
    }
    
    public boolean insertBarang(String kategori,int stok,int bBaik,int bRusak,String keterangan) {

        try {
            String query = "INSERT INTO barang (kategori,stok,bBaik,bRusak,keterangan) "
                    + "VALUES ('"+kategori+"','"+stok+"','"+bBaik+"','"+bRusak+"','"+keterangan+"')";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query); // eksekusi query

            
            return true;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public int updateBarang(String id,String kategori,int stok,int bBaik,int bRusak,String keterangan) {

        try {
            String query = "UPDATE barang set"
                    + " kategori='"+kategori+"', stok='"+stok+"', bBaik='"+bBaik+"', "
                    + "bRusak='"+bRusak+"', keterangan='"+keterangan+"'  WHERE id='"+id+"'";
            
            connector.statement = connector.koneksi.createStatement();
            int affectedRow = connector.statement.executeUpdate(query); // eksekusi query
             
            return affectedRow;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    
    public int deleteBarang(String id) {
        try {
            String query = "DELETE FROM barang WHERE id='"+id+"'";
            
            connector.statement = connector.koneksi.createStatement();
            int affectedRow = connector.statement.executeUpdate(query); // eksekusi query
             
            return affectedRow;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
}
