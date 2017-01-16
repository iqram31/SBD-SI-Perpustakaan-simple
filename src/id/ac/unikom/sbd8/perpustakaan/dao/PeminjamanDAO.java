/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.dao;

import id.ac.unikom.sbd8.perpustakaan.entity.Peminjaman;
import java.util.ArrayList;

/**
 *
 * @author Iqram
 */
public interface PeminjamanDAO {
    
    ArrayList<Peminjaman> getPeminjaman();
    
    ArrayList<Peminjaman> getPeminjaman (String kodePinjam);
    
    boolean tambahPinjam (Peminjaman pinjam);
    
}
