/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.tabelmodel;

import id.ac.unikom.sbd8.perpustakaan.entity.Buku;
import id.ac.unikom.sbd8.perpustakaan.entity.DetailPinjam;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iqram
 */
public class DetailPeminjamanTM extends AbstractTableModel {

    private ArrayList<DetailPinjam> arrayDetailPeminjaman;

    public void setArrayBarang(ArrayList<DetailPinjam> arrayDetailPeminjaman) {
        this.arrayDetailPeminjaman = arrayDetailPeminjaman;
    }

    @Override
    public int getRowCount() {
        return this.arrayDetailPeminjaman.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
            //return arrayAnggota.get(rowIndex).getKodeBarang();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Buku";
            case 1:
                return "Nama Buku";

        }
        return null;
    }

}
