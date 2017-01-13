/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.entity;

/**
 *
 * @author Iqram
 */
public class DetailPeminjaman {
    
    private String kodeBuku;
    private String kodePinjam;

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getKodePinjam() {
        return kodePinjam;
    }

    public void setKodePinjam(String kodePinjam) {
        this.kodePinjam = kodePinjam;
    }
}
