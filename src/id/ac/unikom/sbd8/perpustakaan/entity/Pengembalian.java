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
public class Pengembalian {

    private String kodeKembali;
    private String kodePinjam;
    private int idPegawai;
    private Date tglKembali;
    private int denda;

    public String getKodeKembali() {
        return kodeKembali;
    }

    public void setKodeKembali(String kodeKembali) {
        this.kodeKembali = kodeKembali;
    }

    public String getKodePinjam() {
        return kodePinjam;
    }

    public void setKodePinjam(String kodePinjam) {
        this.kodePinjam = kodePinjam;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

}
