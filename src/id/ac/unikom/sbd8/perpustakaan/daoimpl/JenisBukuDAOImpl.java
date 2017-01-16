/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.daoimpl;

import id.ac.unikom.sbd8.perpustakaan.dao.JenisBukuDAO;
import id.ac.unikom.sbd8.perpustakaan.entity.JenisBuku;
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
public class JenisBukuDAOImpl implements JenisBukuDAO {

    private final Connection conn;

    public JenisBukuDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public ArrayList<JenisBuku> getJenisBuku() {
        return getJenisBuku(null);
    }

    @Override
    public ArrayList<JenisBuku> getJenisBuku(String namaJenis) {
        ArrayList<JenisBuku> arrayJenisBuku = null;
        PreparedStatement state = null;

        boolean isSearching = namaJenis != null && !namaJenis.isEmpty();
        String SELECT;
        if (isSearching) {
            SELECT = "SELECT * FROM jenis_buku WHERE nama LIKE ?";
        } else {
            SELECT = "SELECT * FROM jenis_buku";
        }

        try {
            state = conn.prepareStatement(SELECT);
            if (isSearching) {
                state.setString(1, "%" + namaJenis + "%");
            }
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayJenisBuku = new ArrayList<>();

                while (result.next()) {
                    JenisBuku jenisBuku = new JenisBuku();
                    //a.setNim(result.getString(1));
                    //a.setNama(result.getString(2));
                    //a.setJenisKelamin(result.getString(3));
                    //a.setJurusan(result.getString(4));
                    //a.setNoHp(result.getString(5));

                    arrayJenisBuku.add(jenisBuku);
                }
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(JenisBukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JenisBukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            return arrayJenisBuku;
        }
    }

    @Override
    public boolean tambahJenis(JenisBuku jenisBuku) {
        String INSERT = "INSERT INTO jenis_buku (nim, nama, jenis_kelamin, jurusan, "
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
            Logger.getLogger(JenisBukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    
    }

    @Override
    public boolean ubahJenis(JenisBuku jenisBuku) {
        String UPDATE = "UPDATE jenis_buku "
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
            //state.setString(5, anggota.getNim());

            int qty = state.executeUpdate();
            return qty > 0;
        } catch (SQLException ex) {
            Logger.getLogger(JenisBukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    
    }

    @Override
    public boolean hapusJenis(int kodeJenis) {
         String DELETE = "DELETE FROM jenis_buku "
                + "WHERE nim = ?";
        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(DELETE);
            state.setInt(1, kodeJenis);

            int qty = state.executeUpdate();
            return qty > 0;
        } catch (SQLException ex) {
            Logger.getLogger(JenisBukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    
    }

}
