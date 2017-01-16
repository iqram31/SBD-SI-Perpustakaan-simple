/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.dao;

import id.ac.unikom.sbd8.perpustakaan.entity.Anggota;
import java.util.ArrayList;

/**
 *
 * @author Iqram
 */
public interface AnggotaDAO {
    
    ArrayList <Anggota> getAnggota();
    
    ArrayList <Anggota> getAnggota(String nama);
    
    boolean tambahAnggota(Anggota anggota);

    boolean hapusAnggota(int idAnggota);

    boolean ubahAnggota(Anggota anggota);
}
