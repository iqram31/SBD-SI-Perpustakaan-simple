/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.sbd8.perpustakaan;

import id.ac.unikom.sbd8.perpustakaan.dao.PegawaiDAO;
import id.ac.unikom.sbd8.perpustakaan.daoimpl.PegawaiDAOImpl;
import id.ac.unikom.sbd8.perpustakaan.entity.Pegawai;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Saeful Rahman
 */
public class FormLogin extends javax.swing.JDialog {

    public PegawaiDAO dao = new PegawaiDAOImpl();
    public Pegawai pegawai = new Pegawai();
    private Dimension dmn = Toolkit.getDefaultToolkit().getScreenSize();

    public FormLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

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
        fieldPassword = new javax.swing.JPasswordField();
        fieldUsername = new javax.swing.JTextField();
        designLogin = new javax.swing.JLabel();
        btnMasuk = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(486, 327));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fieldPassword.setMargin(new java.awt.Insets(0, 10, 0, 35));
        fieldPassword.setOpaque(false);
        fieldPassword.setPreferredSize(new java.awt.Dimension(14, 37));
        jPanel1.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 260, 40));

        fieldUsername.setMargin(new java.awt.Insets(0, 10, 0, 35));
        fieldUsername.setOpaque(false);
        fieldUsername.setPreferredSize(new java.awt.Dimension(14, 37));
        jPanel1.add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 260, 40));

        designLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/DesignLogin.png"))); // NOI18N
        jPanel1.add(designLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        btnMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnMasuk.png"))); // NOI18N
        btnMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasukMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMasukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMasukMouseExited(evt);
            }
        });
        jPanel1.add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Perpustakaan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 260, -1));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 260, -1));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnMasukClick.png"));
        btnMasuk.setIcon(icon);
        String username = fieldUsername.getText();
        String password = String.valueOf(fieldPassword.getPassword());
        String nama;
        String hakAkses;
        if ((username != null && !username.isEmpty())
                && (password != null && !password.isEmpty())) {
            pegawai = dao.login(username, password);
            if (pegawai != null) {
                //Mengambil nama berdasarkan username,password dan hak akses
                nama = pegawai.getNamaPegawai();
                hakAkses = pegawai.getHakAkses();
                //Menentukan form yang akan dituju berdasarkan hak akses
                dispose();
                FormHome fh = new FormHome(nama, hakAkses);
                fh.setLocationRelativeTo(null);
                fh.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Username atau password salah !", "Pesan Login", JOptionPane.INFORMATION_MESSAGE );
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan isi data login dengan benar !", "Pesan Login", JOptionPane.INFORMATION_MESSAGE );
        }
    }//GEN-LAST:event_btnMasukMouseClicked

    private void btnMasukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnMasukHover.png"));
        btnMasuk.setIcon(icon);
    }//GEN-LAST:event_btnMasukMouseEntered

    private void btnMasukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("/id/ac/unikom/sbd8/perpustakaan/image/btnMasuk.png"));
        btnMasuk.setIcon(icon);
    }//GEN-LAST:event_btnMasukMouseExited

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormLogin dialog = new FormLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setResizable(false);
                dialog.setTitle("Login");
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnMasuk;
    private javax.swing.JLabel designLogin;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
