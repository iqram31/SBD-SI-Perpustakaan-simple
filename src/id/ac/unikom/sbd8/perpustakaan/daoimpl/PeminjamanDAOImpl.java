/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.daoimpl;

import id.ac.unikom.sbd8.perpustakaan.dao.PeminjamanDAO;
import id.ac.unikom.sbd8.perpustakaan.entity.Peminjaman;
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
public class PeminjamanDAOImpl implements PeminjamanDAO {

    private final Connection conn;

    public PeminjamanDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public ArrayList<Peminjaman> getPeminjaman() {
        return getPeminjaman(null);
    }

    @Override
    public ArrayList<Peminjaman> getPeminjaman(String kodePinjam) {
        ArrayList<Peminjaman> arrayPeminjaman = null;
        PreparedStatement state = null;
        boolean isSearching = kodePinjam != null && !kodePinjam.isEmpty();

        String SELECT;
        if (isSearching) {
            SELECT = "SELECT * FROM tb_trans_konsumen WHERE id_trans = ?";
        } else {
            SELECT = "SELECT * FROM tb_trans_konsumen";
        }
        try {
            state = conn.prepareStatement(SELECT);

            if (isSearching) {
                state.setString(1, "%" + kodePinjam + "%");
            }
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayPeminjaman = new ArrayList<>();
                while (result.next()) {
                    Peminjaman p = new Peminjaman();
                    //tk.setIdTrans(result.getInt(1));

                    arrayPeminjaman.add(p);
                }
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return arrayPeminjaman;
    }

    @Override
    public boolean tambahPinjam(Peminjaman pinjam) {
        String INSERT = "INSERT INTO tb_trans_konsumen (id_trans,tgl_trans,"
                + "jumlah,harga,harga_total,kode_pakaian,nip) "
                + "VALUES (?,?,?,?,?,?,?)";

        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(INSERT);

            java.util.Date utilDate = new java.util.Date();
            utilDate = pinjam.getTglPinjam();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            //Calendar date = transaksiReseller.getTglTrans();
            //java.sql.Date sqlDate = new java.sql.Date(date.getTime().getTime());

      
            state.setDate(2, sqlDate);

            int qty = state.executeUpdate();
            return qty > 0;

        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

}
