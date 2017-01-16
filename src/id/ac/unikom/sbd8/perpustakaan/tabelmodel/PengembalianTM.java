/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan.tabelmodel;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iqram
 */
public class PengembalianTM extends AbstractTableModel {

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Pengembalian";
            case 1:
                return "Nama Anggota";
            case 2:
                return "Tgl Kembali";
            case 3:
                return "Operator";
            case 4:
                return "Denda";

        }
        return null;
    }
}
