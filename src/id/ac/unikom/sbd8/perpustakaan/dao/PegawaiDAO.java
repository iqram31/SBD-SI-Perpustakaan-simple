/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.dao;

import id.ac.unikom.sbd8.perpustakaan.entity.Pegawai;

/**
 *
 * @author Rahadian Nugraha
 */
public interface PegawaiDAO {
    Pegawai login (String username, String password);
}
