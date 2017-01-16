/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.daoimpl;

import id.ac.unikom.sbd8.perpustakaan.dao.AnggotaDAO;
import id.ac.unikom.sbd8.perpustakaan.entity.Anggota;
import id.ac.unikom.sbd8.perpustakaan.utility.DatabaseConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iqram
 */
public class AnggotaDAOImpl implements AnggotaDAO{

    private final Connection conn;

    public AnggotaDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }
    
    @Override
    public ArrayList<Anggota> getAnggota() {
        return getAnggota(null);
    }

    @Override
    public ArrayList<Anggota> getAnggota(String namaAnggota) {
        ArrayList<Anggota> arrayAnggota = null;
        PreparedStatement state = null;

        boolean isSearching = namaAnggota != null && !namaAnggota.isEmpty();
        String SELECT;
        if (isSearching) {
            SELECT = "SELECT * FROM anggota WHERE nama LIKE ?";
        } else {
            SELECT = "SELECT * FROM anggota";
        }

        try {
            state = conn.prepareStatement(SELECT);
            if (isSearching) {
                state.setString(1, "%" + namaAnggota + "%");
            }
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayAnggota = new ArrayList<>();

                while (result.next()) {
                    Anggota a = new Anggota();
                    a.setKodeAnggota(result.getString(1));
                    a.setNamaAnggota(result.getString(2));
                    //a.set(result.getString(3));
                    //a.setJurusan(result.getString(4));
                    //a.setNoHp(result.getString(5));

                    arrayAnggota.add(a);
                }
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        return arrayAnggota;
    }

    @Override
    public boolean tambahAnggota(Anggota anggota) {
        String INSERT = "INSERT INTO anggota (nim, nama, jenis_kelamin, jurusan, "
                + "no_hp) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(INSERT);
            //state.setString(1, anggota.getNim());
            //state.setString(2, anggota.getNama());
            //state.setString(3, anggota.getJenisKelamin());
            //state.setString(4, anggota.getJurusan());
            //state.setString(5, anggota.getNoHp());

            int qty = state.executeUpdate();
            return qty > 0;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    
    }
    
    @Override
    public boolean ubahAnggota(Anggota anggota) {
        String UPDATE = "UPDATE anggota "
                + "SET nama = ?, jenis_kelamin = ?, jurusan = ?,  "
                + "no_hp = ? WHERE "
                + "nim = ?";
        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(UPDATE);
            //state.setString(1, anggota.getNama());
            //state.setString(2, anggota.getJenisKelamin());
            //state.setString(3, anggota.getJurusan());
            //state.setString(4, anggota.getNoHp());
           // state.setString(5, anggota.getNim());

            int qty = state.executeUpdate();
            return qty > 0;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public boolean hapusAnggota(String kodeAnggota) {
    String DELETE = "DELETE FROM anggota "
                + "WHERE nim = ?";
        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(DELETE);
            //state.setString(1, nim);

            int qty = state.executeUpdate();
            return qty > 0;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;    
    }
    
}
