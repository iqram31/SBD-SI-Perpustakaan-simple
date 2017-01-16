/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.entity;

import java.util.Date;

/**
 *
 * @author Iqram
 */
public class Peminjaman {
    private String kodePinjam;
    private int kodeAnggota;
    private int idPegawai;
    private Date tglPinjam;

    public String getKodePinjam() {
        return kodePinjam;
    }

    public void setKodePinjam(String kodePinjam) {
        this.kodePinjam = kodePinjam;
    }

    public int getKodeAnggota() {
        return kodeAnggota;
    }

    public void setKodeAnggota(int kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public Date getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }
    
    
}
