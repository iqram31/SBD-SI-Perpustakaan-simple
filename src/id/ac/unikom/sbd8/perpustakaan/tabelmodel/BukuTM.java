/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.tabelmodel;

import id.ac.unikom.sbd8.perpustakaan.entity.Buku;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iqram
 */
public class BukuTM extends AbstractTableModel {

    private ArrayList<Buku> arrayBuku;

    public void setArrayBarang(ArrayList<Buku> arrayBuku) {
        this.arrayBuku = arrayBuku;
    }

    @Override
    public int getRowCount() {
        return this.arrayBuku.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
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
                return "Judul";
            case 2:
                return "Pengarang";
            case 3:
                return "Penerbit";
            case 4:
                return "Jenis";
            case 5:
                return "Stok";
        }
        return null;
    }
}
