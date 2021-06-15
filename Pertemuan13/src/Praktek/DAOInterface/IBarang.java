/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek.DAOInterface;

import java.util.List;
import Praktek.Model.Barang;
/**
 *
 * @author abdil
 */
public interface IBarang {
    public void insert(Barang b);
    public void update(Barang b);
    public void delete(int id);
    public List<Barang> getAll();
    public List<Barang> getCariNama(String nama);
}
