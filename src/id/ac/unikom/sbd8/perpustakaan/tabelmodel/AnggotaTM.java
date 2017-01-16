/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.tabelmodel;

import id.ac.unikom.sbd8.perpustakaan.entity.Anggota;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iqram
 */
public class AnggotaTM extends AbstractTableModel {

    private ArrayList<Anggota> arrayAnggota;

    public void setArrayBarang(ArrayList<Anggota> arrayAnggota) {
        this.arrayAnggota = arrayAnggota;
    }

    @Override
    public int getRowCount() {
        return this.arrayAnggota.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
//                return arrayAnggota.get(rowIndex).getKodeBarang();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID anggota";
            case 1:
                return "Nama";
            case 2:
                return "Alamat";
            case 3:
                return "Kelas";
            case 4:
                return "No Hp";

        }
        return null;
    }

}
