/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Barang;
import View.ViewDetail;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Config.Connector;
import View.ViewLogin;
import Model.User;
import View.ViewDetail;
import View.ViewSave;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class BarangController {
    Barang barang = new Barang();
    
    public void showTable(ViewDetail viewdetail){
        String list[][] = barang.getAllBarang();
        DefaultTableModel tableModel = (DefaultTableModel)viewdetail.getTable().getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < barang.getSizeBarang(); i++) {
            row[0] = list[i][0];
            row[1] = list[i][1];
            row[2] = list[i][2];
            row[3] = list[i][3];
            row[4] = list[i][4];
            row[5] = list[i][5];
            tableModel.addRow(row);
        }
        
    }
    
    public void insertForm(ViewSave viewsave){
        String keterangan;
        String kategori = viewsave.getTxtKategori().getText();
        int stok = Integer.parseInt(viewsave.getTxtSBarang().getText());
        int bBaik = Integer.parseInt(viewsave.getTxtBBaik().getText());
        int bRusak = stok - bBaik;
        
        
        if(stok > 500){
            keterangan = "Stok Masih Aman";
        }
        else{
            keterangan = "Harap Hubungi Supplier";
        }

        if(barang.insertBarang(kategori, stok, bBaik, bRusak, keterangan)){
            JOptionPane.showMessageDialog(null,"Insert data Berhasil !!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Insert data Gagal !!");
        }
    }
    
    public void updateForm(ViewDetail viewdetail){
        String keterangan;
        String id = viewdetail.getTxtID().getText();
        String kategori = viewdetail.getTxtKategori1().getText();
        int stok = Integer.parseInt(viewdetail.getTxtSBarang().getText());
        int bBaik = Integer.parseInt(viewdetail.getTxtBBaik().getText());
        int bRusak = stok - bBaik;
        
        if(stok > 500){
            keterangan = "Stok Masih Aman";
        }
        else{
            keterangan = "Harap Hubungi Supplier";
        }
        
        if (barang.updateBarang(id, kategori, stok, bBaik, bRusak, keterangan) > 0) {
            JOptionPane.showMessageDialog(null,"Data Barang Telah Diupdate !!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Data Barang gagal Diupdate !!");
        }
        
    }
    
    public void deleteForm(ViewDetail viewdetail){
        String id = viewdetail.getTxtID().getText();
        
        if (barang.deleteBarang(id) > 0) {
            JOptionPane.showMessageDialog(null,"Data Barang dengan " +id+ " Telah Dihapus !!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Data Barang dengan " +id+ " Gagal Dihapus !!");
        }
    }
    
    
    
    public void clearFormSave(ViewSave viewsave){
        viewsave.getTxtKategori().setText("Input Kategori");
        viewsave.getTxtSBarang().setText("Input Stok");
        viewsave.getTxtBBaik().setText("Input Jumlah Barang Baik");
    }
}
