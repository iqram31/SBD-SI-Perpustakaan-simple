/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.dao;

import id.ac.unikom.sbd8.perpustakaan.entity.Buku;
import java.util.ArrayList;

/**
 *
 * @author Iqram
 */
public interface BukuDAO {
    
    ArrayList<Buku> getBuku();
    
    ArrayList<Buku> getBuku(String judul);
    
    boolean tambahBuku (Buku buku);
    
    boolean ubahBuku (Buku buku);
    
    boolean hapusBuku (String kodeBuku);
    
}
