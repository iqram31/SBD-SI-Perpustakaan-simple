/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.daoimpl;

import id.ac.unikom.sbd8.perpustakaan.dao.BukuDAO;
import id.ac.unikom.sbd8.perpustakaan.entity.Buku;
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
public class BukuDAOImpl implements BukuDAO {

    private final Connection conn;

    public BukuDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public ArrayList<Buku> getBuku() {
        return getBuku(null);
    }

    @Override
    public ArrayList<Buku> getBuku(String judul) {
        ArrayList<Buku> arrayBuku = null;
        PreparedStatement state = null;

        boolean isSearching = judul != null && !judul.isEmpty();
        String SELECT;
        if (isSearching) {
            SELECT = "SELECT * FROM buku WHERE judul LIKE ?";
        } else {
            SELECT = "SELECT * FROM buku";
        }

        try {
            state = conn.prepareStatement(SELECT);
            if (isSearching) {
                state.setString(1, "%" + judul + "%");
            }
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayBuku = new ArrayList<>();

                while (result.next()) {
                    Buku buku = new Buku();
                    //buku.setNim(result.getString(1));
                    //buku.setNama(result.getString(2));
                    //buku.setJenisKelamin(result.getString(3));
                    //buku.setJurusan(result.getString(4));
                    //buku.setNoHp(result.getString(5));

                    arrayBuku.add(buku);
                }
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        return arrayBuku;
    }

    @Override
    public boolean tambahBuku(Buku buku) {
        String INSERT = "INSERT INTO buku ( ) VALUES (?, ?, ?, ?, ?)";
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
            Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    @Override
    public boolean ubahBuku(Buku buku) {
        String UPDATE = "UPDATE buku "
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
            Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public boolean hapusBuku(String kodeBuku) {
        String DELETE = "DELETE FROM buku "
                + "WHERE judul = ?";
        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(DELETE);
            state.setString(1, kodeBuku);

            int qty = state.executeUpdate();
            return qty > 0;
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

}
