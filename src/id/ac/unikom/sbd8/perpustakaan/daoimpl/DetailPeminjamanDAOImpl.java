/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.daoimpl;

import id.ac.unikom.sbd8.perpustakaan.dao.DetailPinjamDAO;
import id.ac.unikom.sbd8.perpustakaan.entity.DetailPinjam;
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
public class DetailPeminjamanDAOImpl implements DetailPinjamDAO {

    private final Connection conn;

    public DetailPeminjamanDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public ArrayList<DetailPinjam> getDetailPinjam() {
            return getDetailPinjam(null);
    }

    @Override
    public ArrayList<DetailPinjam> getDetailPinjam(String kodePinjam) {
        ArrayList<DetailPinjam> arrayDetailPinjam = null;
        PreparedStatement state = null;

        boolean isSearching = kodePinjam != null && !kodePinjam.isEmpty();
        String SELECT;
        if (isSearching) {
            SELECT = "SELECT tb_detail_pembelian.kode_beli,tb_detail_pembelian.kd_barang,tb_barang.nama,tb_jenis.jenis_barang,tb_detail_pembelian.jumlah, "
                    + "tb_barang.size "
                    + "FROM tb_detail_pembelian, tb_barang, tb_jenis "
                    + "WHERE tb_detail_pembelian.kd_barang = tb_barang.kd_barang "
                    + "AND tb_barang.no_jenis = tb_jenis.no_jenis "
                    + "AND kode_beli LIKE ?";
        } else {
            SELECT = "SELECT tb_detail_pembelian.kode_beli,tb_detail_pembelian.kd_barang,tb_barang.nama,tb_jenis.jenis_barang,tb_detail_pembelian.jumlah, "
                    + "tb_barang.size  "
                    + "FROM tb_detail_pembelian, tb_barang, tb_jenis "
                    + "WHERE tb_detail_pembelian.kd_barang = tb_barang.kd_barang "
                    + "AND tb_barang.no_jenis = tb_jenis.no_jenis ";
        }

        try {
            state = conn.prepareStatement(SELECT);

            if (isSearching) {
                state.setString(1, "%" + kodePinjam + "%");
            }
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayDetailPinjam = new ArrayList<>();
                while (result.next()) {
                    /*DetailPinjam detailPembelian = new DetailPinjam();
                     detailPembelian.setKodePembelian(result.getString(1));
                     detailPembelian.setKodeBarang(result.getString(2));
                     detailPembelian.setNama(result.getString(3));
                     detailPembelian.setJenis(result.getString(4));
                     detailPembelian.setJumlah(result.getInt(5));
                     detailPembelian.setUkuran(result.getString(6));
                     arrayDetailPinjam.add(detailPembelian);*/
                }
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(DetailPeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DetailPeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return arrayDetailPinjam;
    }

    @Override
    public boolean tambahDetailPinjam(DetailPinjam detailpinjam) {
        String INSERT = "INSERT INTO tb_detail_pembelian (kode_beli,kd_barang,"
                + "nama,jenis,jumlah) "
                + "VALUES (?,?,?,?,?)";

        PreparedStatement state = null;

        try {
            state = conn.prepareStatement(INSERT);

            //state.setString(1, detailPembelian.getKodePembelian());
            int qty = state.executeUpdate();
            return qty > 0;

        } catch (SQLException ex) {
            Logger.getLogger(DetailPeminjamanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

}
