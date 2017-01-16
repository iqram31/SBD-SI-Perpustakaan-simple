/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.daoimpl;

import id.ac.unikom.sbd8.perpustakaan.dao.PengembalianDAO;
import id.ac.unikom.sbd8.perpustakaan.entity.Peminjaman;
import id.ac.unikom.sbd8.perpustakaan.entity.Pengembalian;
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
public class PengembalianDAOImpl implements PengembalianDAO {

    private final Connection conn;

    public PengembalianDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public ArrayList<Pengembalian> getPengembalian() {
        return getPengembalian(null);
    }

    @Override
    public ArrayList<Pengembalian> getPengembalian(String kodeKembali) {
        ArrayList<Pengembalian> arrayPengembalian = null;
        PreparedStatement state = null;
        boolean isSearching = kodeKembali != null && !kodeKembali.isEmpty();

        String SELECT;
        if (isSearching) {
            SELECT = "SELECT * FROM tb_trans_konsumen WHERE id_trans = ?";
        } else {
            SELECT = "SELECT * FROM tb_trans_konsumen";
        }
        try {
            state = conn.prepareStatement(SELECT);

            if (isSearching) {
                state.setString(1, "%" + kodeKembali + "%");
            }
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayPengembalian = new ArrayList<>();
                while (result.next()) {
                    Pengembalian p = new Pengembalian();
                    //tk.setIdTrans(result.getInt(1));

                    arrayPengembalian.add(p);
                }
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PengembalianDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return arrayPengembalian;
    }

    @Override
    public boolean tambahPinjam(Pengembalian kembali) {
        String INSERT = "INSERT INTO tb_trans_konsumen (id_trans,tgl_trans,"
                + "jumlah,harga,harga_total,kode_pakaian,nip) "
                + "VALUES (?,?,?,?,?,?,?)";

        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(INSERT);

            java.util.Date utilDate = new java.util.Date();
            utilDate = kembali.getTglKembali();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            //Calendar date = transaksiReseller.getTglTrans();
            //java.sql.Date sqlDate = new java.sql.Date(date.getTime().getTime());

      
            state.setDate(2, sqlDate);

            int qty = state.executeUpdate();
            return qty > 0;

        } catch (SQLException ex) {
            Logger.getLogger(PengembalianDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

}
