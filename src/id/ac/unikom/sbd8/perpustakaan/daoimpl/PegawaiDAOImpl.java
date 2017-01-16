/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.daoimpl;

import id.ac.unikom.sbd8.perpustakaan.dao.PegawaiDAO;
import id.ac.unikom.sbd8.perpustakaan.entity.Pegawai;
import id.ac.unikom.sbd8.perpustakaan.utility.DatabaseConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rahadian Nugraha
 */
public class PegawaiDAOImpl implements PegawaiDAO{
    private final Connection conn;

    public PegawaiDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public Pegawai login(String username, String password) {
        Pegawai pegawai = null;
        PreparedStatement state = null;
        String SELECT = "SELECT * FROM pegawai WHERE "
                + "username = ? AND password = MD5(?)";

        try {
            state = conn.prepareStatement(SELECT);
            state.setString(1, username);
            state.setString(2, password);

            ResultSet result = state.executeQuery();
            if (result != null && result.next()) {
                pegawai = new Pegawai();
                pegawai.setIdPegawai(result.getInt(1));
                pegawai.setNamaPegawai(result.getString(2));
                pegawai.setUsername(result.getString(3));
                pegawai.setPassword(result.getString(4));
                pegawai.setHakAkses(result.getString(5));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PegawaiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pegawai;
    }
}
