/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek.Controller;

import Praktek.DAO.DAOBarang;
import Praktek.DAOInterface.IBarang;
import Praktek.Model.Barang;
import Praktek.Model.TabelModelBarang;
import Praktek.View.FormBarang;

import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author abdil
 */
public class ControllerBarang {
    FormBarang frame;
    IBarang implBarang;
    List<Barang> lb;
    
    public ControllerBarang(FormBarang frame){
        this.frame = frame;
        implBarang = new DAOBarang();
        lb = implBarang.getAll();
    }
    
    public void reset(){
        frame.getTxtID().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJumlah().setText("");
    }
    
    public void isiTabel(){
        lb = implBarang.getAll();
        TabelModelBarang tmb = new TabelModelBarang(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row){
        frame.getTxtID().setText(lb.get(row).getId().toString());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJumlah().setText(lb.get(row).getJumlah().toString());    
    }
    
    public void insert(){
        if(!frame.getTxtID().getText().trim().isEmpty() & !frame.getTxtNama().getText().trim().isEmpty()){
            Barang b = new Barang();
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            b.setNama(frame.getTxtNama().getText());
            b.setJumlah(Integer.parseInt(frame.getTxtJumlah().getText()));
            implBarang.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else{
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
    
    public void update(){
        if(!frame.getTxtID().getText().trim().isEmpty()){
            Barang b = new Barang();
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            b.setNama(frame.getTxtNama().getText());
            b.setJumlah(Integer.parseInt(frame.getTxtJumlah().getText()));
            implBarang.update(b);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else{
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan diubah");
        }
    }
    
    public void delete(){
        if(!frame.getTxtID().getText().trim().isEmpty()){
            int id = Integer.parseInt(frame.getTxtID().getText());
            implBarang.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else{
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan dihapus");
        }
    }
    
    public void isiTableCariNama(){
        lb = implBarang.getCariNama(frame.getTxtCariNama().getText());
        TabelModelBarang tmb = new TabelModelBarang(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void cariNama(){
        if(!frame.getTxtCariNama().getText().trim().isEmpty()){
            implBarang.getCariNama(frame.getTxtCariNama().getText());
            isiTableCariNama();
        } else{
            JOptionPane.showMessageDialog(frame, "Silahkan Masukkan Nama");
        }
    }
    
}
