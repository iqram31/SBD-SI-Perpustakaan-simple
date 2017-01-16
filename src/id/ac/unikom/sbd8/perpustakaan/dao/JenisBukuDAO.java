/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.dao;

import id.ac.unikom.sbd8.perpustakaan.entity.JenisBuku;
import java.util.ArrayList;

/**
 *
 * @author Iqram
 */
public interface JenisBukuDAO {
    
    
    ArrayList<JenisBuku> getJenisBuku();
    
    ArrayList<JenisBuku> getJenisBuku(String namaJenis);
    
    boolean tambahJenis (JenisBuku jenisBuku);
    
    boolean ubahJenis (JenisBuku jenisBuku);
    
    boolean hapusJenis (int kodeJenis);
    
    
}
