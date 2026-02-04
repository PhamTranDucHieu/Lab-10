/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab11;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Bai5 extends javax.swing.JFrame {
    private JTextField txtHoTen;
    private JPasswordField txtMatKhau;

    private JRadioButton rdoNam, rdoNu, rdoKhac;
    private ButtonGroup groupGioiTinh;

    private JCheckBox chkChoiDan, chkNgheNhac, chkXemPhim, chkDuLich;

    private JButton btnDangKy;
    private JTextArea txtThongTin;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Bai5.class.getName());

    /**
     * Creates new form Bai5
     */
    public Bai5() {
        initComponents();
         setTitle("Đăng ký thông tin cá nhân");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel pnlNhap = new JPanel(new GridLayout(4, 2, 5, 5));

        pnlNhap.add(new JLabel("Họ tên:"));
        txtHoTen = new JTextField();
        pnlNhap.add(txtHoTen);

        pnlNhap.add(new JLabel("Mật khẩu:"));
        txtMatKhau = new JPasswordField();
        pnlNhap.add(txtMatKhau);

        pnlNhap.add(new JLabel("Giới tính:"));
        JPanel pnlGioiTinh = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rdoNam = new JRadioButton("Nam");
        rdoNu = new JRadioButton("Nữ");
        rdoKhac = new JRadioButton("Khác");

        groupGioiTinh = new ButtonGroup();
        groupGioiTinh.add(rdoNam);
        groupGioiTinh.add(rdoNu);
        groupGioiTinh.add(rdoKhac);

        pnlGioiTinh.add(rdoNam);
        pnlGioiTinh.add(rdoNu);
        pnlGioiTinh.add(rdoKhac);
        pnlNhap.add(pnlGioiTinh);

        pnlNhap.add(new JLabel("Sở thích:"));
        JPanel pnlSoThich = new JPanel(new FlowLayout(FlowLayout.LEFT));
        chkChoiDan = new JCheckBox("Chơi Đàn");
        chkNgheNhac = new JCheckBox("Nghe nhạc");
        chkXemPhim = new JCheckBox("Xem phim");
        chkDuLich = new JCheckBox("Du lịch");

        pnlSoThich.add(chkChoiDan);
        pnlSoThich.add(chkNgheNhac);
        pnlSoThich.add(chkXemPhim);
        pnlSoThich.add(chkDuLich);
        pnlNhap.add(pnlSoThich);

        btnDangKy = new JButton("Đăng ký");

        txtThongTin = new JTextArea(8, 30);
        txtThongTin.setEditable(false);

        setLayout(new BorderLayout());
        add(pnlNhap, BorderLayout.NORTH);
        add(btnDangKy, BorderLayout.CENTER);
        add(new JScrollPane(txtThongTin), BorderLayout.SOUTH);

        
        btnDangKy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hoTen = txtHoTen.getText().trim();
                char[] matKhau = txtMatKhau.getPassword();

               
                if (hoTen.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Họ tên không được để trống!",
                            "Lỗi",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

            
                if (matKhau.length < 6) {
                    JOptionPane.showMessageDialog(null,
                            "Mật khẩu phải có ít nhất 6 ký tự!",
                            "Lỗi",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

               
                String gioiTinh = "";
                if (rdoNam.isSelected()) gioiTinh = "Nam";
                else if (rdoNu.isSelected()) gioiTinh = "Nữ";
                else if (rdoKhac.isSelected()) gioiTinh = "Khác";

                if (gioiTinh.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Vui lòng chọn giới tính!",
                            "Lỗi",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

              
                String soThich = "";
                if (chkChoiDan.isSelected()) soThich += "Chơi Đàn, ";
                if (chkNgheNhac.isSelected()) soThich += "Nghe nhạc, ";
                if (chkXemPhim.isSelected()) soThich += "Xem phim, ";
                if (chkDuLich.isSelected()) soThich += "Du lịch, ";

                if (!soThich.isEmpty()) {
                    soThich = soThich.substring(0, soThich.length() - 2);
                } else {
                    soThich = "Không có";
                }

               
                txtThongTin.setText(
                        "THÔNG TIN ĐĂNG KÝ\n" +
                        "-------------------------\n" +
                        "Họ tên: " + hoTen + "\n" +
                        "Giới tính: " + gioiTinh + "\n" +
                        "Sở thích: " + soThich
                );
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Bai5().setVisible(true);

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Bai5().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
