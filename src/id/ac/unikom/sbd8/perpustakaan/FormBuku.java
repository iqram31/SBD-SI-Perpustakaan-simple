/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan;

import javax.swing.ImageIcon;

/**
 *
 * @author Rahadian Nugraha
 */
public class FormBuku extends javax.swing.JFrame {

    private String namaUser;
    private String hakAksesUser;
    
    public FormBuku() {
        initComponents();
    }
    public FormBuku(String nama, String hakAkses) {
        initComponents();
        namaUser = nama;
        hakAksesUser = hakAkses;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelJudul1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAnggota = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();
        fieldCari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnJenisBuku = new javax.swing.JLabel();
        btnBuku = new javax.swing.JLabel();
        btnPeminjaman = new javax.swing.JLabel();
        btnPengembalian = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JLabel();
        btnTambah = new javax.swing.JLabel();
        btnCari = new javax.swing.JLabel();
        btnUbah = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        btnLaporan = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnHistory = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel3.setBackground(new java.awt.Color(189, 195, 199));

        labelJudul1.setBackground(new java.awt.Color(255, 255, 255));
        labelJudul1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelJudul1.setForeground(new java.awt.Color(255, 255, 255));
        labelJudul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudul1.setText("CV Pusat Dakwah Visual (PUSDAV)");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jl. Dipatiukur 112 Call.022-2504119 Fax. 022-2533754");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJudul1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(labelJudul1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        btnAnggota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnAnggota.png"))); // NOI18N
        btnAnggota.setAlignmentY(0.0F);
        btnAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnggotaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnggotaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnggotaMouseExited(evt);
            }
        });

        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableBuku);

        fieldCari.setMargin(new java.awt.Insets(0, 10, 0, 10));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Pengolahan Data Buku");

        btnJenisBuku.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnJenisBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnJenisBuku.png"))); // NOI18N
        btnJenisBuku.setAlignmentY(0.0F);
        btnJenisBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJenisBukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJenisBukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJenisBukuMouseExited(evt);
            }
        });

        btnBuku.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnBukuClick.png"))); // NOI18N
        btnBuku.setAlignmentY(0.0F);
        btnBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBukuMouseExited(evt);
            }
        });

        btnPeminjaman.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnPeminjaman.png"))); // NOI18N
        btnPeminjaman.setAlignmentY(0.0F);
        btnPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPeminjamanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPeminjamanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPeminjamanMouseExited(evt);
            }
        });

        btnPengembalian.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPengembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnPengembalian.png"))); // NOI18N
        btnPengembalian.setAlignmentY(0.0F);
        btnPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPengembalianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPengembalianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPengembalianMouseExited(evt);
            }
        });

        btnKeluar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnKeluar.png"))); // NOI18N
        btnKeluar.setAlignmentY(0.0F);
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKeluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKeluarMouseExited(evt);
            }
        });

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnTambah.png"))); // NOI18N
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahMouseExited(evt);
            }
        });

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnCari.png"))); // NOI18N
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCariMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCariMouseExited(evt);
            }
        });

        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnUbah.png"))); // NOI18N
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUbahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUbahMouseExited(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHapus.png"))); // NOI18N
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMouseExited(evt);
            }
        });

        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnLaporan.png"))); // NOI18N
        btnLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLaporanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLaporanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLaporanMouseExited(evt);
            }
        });

        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHome.png"))); // NOI18N
        btnHome.setAlignmentY(0.0F);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });

        btnHistory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHistory.png"))); // NOI18N
        btnHistory.setAlignmentY(0.0F);
        btnHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHistoryMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnggota, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnJenisBuku, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuku, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPeminjaman, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPengembalian, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHistory, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnTambah)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnUbah)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHapus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCari))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLaporan))
                    .addComponent(jLabel6))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnggota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJenisBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPeminjaman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPengembalian)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHistory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKeluar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTambah))
                            .addComponent(btnCari)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLaporan)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnggotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnggotaMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnAnggotaHover.png"));
        btnAnggota.setIcon(icon);
    }//GEN-LAST:event_btnAnggotaMouseEntered

    private void btnAnggotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnggotaMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnAnggota.png"));
        btnAnggota.setIcon(icon);
    }//GEN-LAST:event_btnAnggotaMouseExited

    private void btnAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnggotaMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnAnggotaClick.png"));
        btnAnggota.setIcon(icon);
        dispose();
        FormBuku fa = new FormBuku(namaUser, hakAksesUser);
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
    }//GEN-LAST:event_btnAnggotaMouseClicked

    private void btnJenisBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJenisBukuMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnJenisBukuClick.png"));
        btnJenisBuku.setIcon(icon);
        dispose();
        FormJenisBuku fjb = new FormJenisBuku(namaUser, hakAksesUser);
        fjb.setLocationRelativeTo(null);
        fjb.setVisible(true);
        
    }//GEN-LAST:event_btnJenisBukuMouseClicked

    private void btnJenisBukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJenisBukuMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnJenisBukuHover.png"));
        btnJenisBuku.setIcon(icon);
    }//GEN-LAST:event_btnJenisBukuMouseEntered

    private void btnJenisBukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJenisBukuMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnJenisBuku.png"));
        btnJenisBuku.setIcon(icon);
    }//GEN-LAST:event_btnJenisBukuMouseExited

    private void btnBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBukuMouseClicked

    }//GEN-LAST:event_btnBukuMouseClicked

    private void btnBukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBukuMouseEntered

    }//GEN-LAST:event_btnBukuMouseEntered

    private void btnBukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBukuMouseExited
 
    }//GEN-LAST:event_btnBukuMouseExited

    private void btnPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeminjamanMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnPeminjamanClick.png"));
        btnPeminjaman.setIcon(icon);
        dispose();
        FormPeminjaman fp = new FormPeminjaman(namaUser, hakAksesUser);
        fp.setLocationRelativeTo(null);
        fp.setVisible(true);
    }//GEN-LAST:event_btnPeminjamanMouseClicked

    private void btnPeminjamanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeminjamanMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnPeminjamanHover.png"));
        btnPeminjaman.setIcon(icon);
    }//GEN-LAST:event_btnPeminjamanMouseEntered

    private void btnPeminjamanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeminjamanMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnPeminjaman.png"));
        btnPeminjaman.setIcon(icon);
    }//GEN-LAST:event_btnPeminjamanMouseExited

    private void btnPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengembalianMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnPengembalianClick.png"));
        btnPengembalian.setIcon(icon);
        dispose();
        FormPengembalian fp = new FormPengembalian(namaUser, hakAksesUser);
        fp.setLocationRelativeTo(null);
        fp.setVisible(true);
    }//GEN-LAST:event_btnPengembalianMouseClicked

    private void btnPengembalianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengembalianMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnPengembalianHover.png"));
        btnPengembalian.setIcon(icon);
    }//GEN-LAST:event_btnPengembalianMouseEntered

    private void btnPengembalianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengembalianMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnPengembalian.png"));
        btnPengembalian.setIcon(icon);
    }//GEN-LAST:event_btnPengembalianMouseExited

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnKeluarClick.png"));
        btnKeluar.setIcon(icon);
        dispose();
        FormLogin fl = new FormLogin(this, true);
        fl.setLocationRelativeTo(null);
        fl.setVisible(true);
    }//GEN-LAST:event_btnKeluarMouseClicked

    private void btnKeluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnKeluarHover.png"));
        btnKeluar.setIcon(icon);
    }//GEN-LAST:event_btnKeluarMouseEntered

    private void btnKeluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnKeluar.png"));
        btnKeluar.setIcon(icon);
    }//GEN-LAST:event_btnKeluarMouseExited

    private void btnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnTambahHover.png"));
        btnTambah.setIcon(icon);
    }//GEN-LAST:event_btnTambahMouseEntered

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnTambah.png"));
        btnTambah.setIcon(icon);
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnTambahClick.png"));
        btnTambah.setIcon(icon);
        FormTambahBuku ftb = new FormTambahBuku(this, true);
        ftb.setLocationRelativeTo(null);
        ftb.setVisible(true);
    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnCariClick.png"));
        btnCari.setIcon(icon);
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnCariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnCariHover.png"));
        btnCari.setIcon(icon);
    }//GEN-LAST:event_btnCariMouseEntered

    private void btnCariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnCari.png"));
        btnCari.setIcon(icon);
    }//GEN-LAST:event_btnCariMouseExited

    private void btnUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnUbahClick.png"));
        btnUbah.setIcon(icon);
        FormUbahBuku fub = new FormUbahBuku(this, true);
        fub.setLocationRelativeTo(null);
        fub.setVisible(true);
    }//GEN-LAST:event_btnUbahMouseClicked

    private void btnUbahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnUbahHover.png"));
        btnUbah.setIcon(icon);
    }//GEN-LAST:event_btnUbahMouseEntered

    private void btnUbahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnUbah.png"));
        btnUbah.setIcon(icon);
    }//GEN-LAST:event_btnUbahMouseExited

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHapusClick.png"));
        btnHapus.setIcon(icon);
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHapusHover.png"));
        btnHapus.setIcon(icon);
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHapus.png"));
        btnHapus.setIcon(icon);
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporanMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnLaporanClick.png"));
        btnLaporan.setIcon(icon);
    }//GEN-LAST:event_btnLaporanMouseClicked

    private void btnLaporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporanMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnLaporanHover.png"));
        btnLaporan.setIcon(icon);
    }//GEN-LAST:event_btnLaporanMouseEntered

    private void btnLaporanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporanMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnLaporan.png"));
        btnLaporan.setIcon(icon);
    }//GEN-LAST:event_btnLaporanMouseExited

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHomeClick.png"));
        btnHome.setIcon(icon);
        dispose();
        FormHome fh = new FormHome(namaUser, hakAksesUser);
        fh.setLocationRelativeTo(null);
        fh.setVisible(true);
        
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHomeHover.png"));
        btnHome.setIcon(icon);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHome.png"));
        btnHome.setIcon(icon);
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoryMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHistoryClick.png"));
        btnHistory.setIcon(icon);
        dispose();
        FormHistory fh = new FormHistory(namaUser, hakAksesUser);
        fh.setLocationRelativeTo(null);
        fh.setVisible(true);
    }//GEN-LAST:event_btnHistoryMouseClicked

    private void btnHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoryMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHistoryHover.png"));
        btnHistory.setIcon(icon);
    }//GEN-LAST:event_btnHistoryMouseEntered

    private void btnHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoryMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnHistory.png"));
        btnHistory.setIcon(icon);
    }//GEN-LAST:event_btnHistoryMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
                new FormBuku().setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAnggota;
    private javax.swing.JLabel btnBuku;
    private javax.swing.JLabel btnCari;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JLabel btnHistory;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnJenisBuku;
    private javax.swing.JLabel btnKeluar;
    private javax.swing.JLabel btnLaporan;
    private javax.swing.JLabel btnPeminjaman;
    private javax.swing.JLabel btnPengembalian;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JLabel btnUbah;
    private javax.swing.JTextField fieldCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelJudul1;
    private javax.swing.JTable tableBuku;
    // End of variables declaration//GEN-END:variables
}
