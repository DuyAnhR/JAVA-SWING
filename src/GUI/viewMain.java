/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import GUI.QUAN_LY.QUAN_LYTAI_KHOAN;
import GUI.QUAN_LY.QUAN_LY_CA_TRUC;
import GUI.QUAN_LY.QUAN_LY_NHANN_VIEN;
import GUI.THONG_KE.THONG_KE;

import GUI.XE.CHI_TIET_RA_VAO;
import GUI.XE.DS_HINH_THUC_GUI_XE;
import GUI.XE.GUI_XE;
import GUI.XE.QUAN_LY_GIA_XE;
import GUI.XE.QUAN_LY_THE;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author HUU77
 */
public final class viewMain extends javax.swing.JFrame {

    /**
     * Creates new form viewMain
     */
    public viewMain() {
        initComponents();
        setLocationRelativeTo(null);
        addRootJPN();
        setTime();
    }
//setTime

    public void setTime() {
                   Date d=new Date();
         
     SimpleDateFormat  Day;
        Day = new SimpleDateFormat("dd");
           String day=Day.format(d);
           
      SimpleDateFormat  Month;
        Month = new SimpleDateFormat("MM");
       String month=Month.format(d);
      
       
             
      SimpleDateFormat  Year;
        Year = new SimpleDateFormat("YYYY");
       String year=Year.format(d);
      
       String ngayThangNam="ngày  "+day+" tháng  "+month+" năm  " +year;
      jlbDMY.setText(ngayThangNam);
      
        new Thread() {

            @Override
            public void run() {
                while (true) {
                    Calendar ca = new GregorianCalendar();
                    int h = ca.get(Calendar.HOUR);
                    int p = ca.get(Calendar.MINUTE);
                    int s = ca.get(Calendar.SECOND);
                    String time = h + ":" + p + ":" + s;
                    jlbTime.setText(time);
                }
            }
        }.start();

    }

    // them các jpn con vào jjtable , chia layout để tối ưu code hơn
    public void addRootJPN() {
        //ADD GUI-XE
        jpnGUIXE.removeAll();
        jpnGUIXE.setLayout(new BorderLayout());
        jpnGUIXE.add(new GUI_XE());
        jpnGUIXE.validate();
        jpnGUIXE.repaint();
        //ADD DS_HIN_THUC_GUI_XE
        jpnDS_hinh_thuc_gui_xe.removeAll();
        jpnDS_hinh_thuc_gui_xe.setLayout(new BorderLayout());
        jpnDS_hinh_thuc_gui_xe.add(new DS_HINH_THUC_GUI_XE());
        jpnDS_hinh_thuc_gui_xe.validate();
        jpnDS_hinh_thuc_gui_xe.repaint();
        //ADD CHI TIET RA VAO
        JPNCHITIETRAVAO.removeAll();
        JPNCHITIETRAVAO.setLayout(new BorderLayout());
        JPNCHITIETRAVAO.add(new CHI_TIET_RA_VAO());
        JPNCHITIETRAVAO.validate();
        JPNCHITIETRAVAO.repaint();
        //ADD QUAN LY THE
        jpnQUAN_LY_THE.removeAll();
        jpnQUAN_LY_THE.setLayout(new BorderLayout());
        jpnQUAN_LY_THE.add(new QUAN_LY_THE());
        jpnQUAN_LY_THE.validate();
        jpnQUAN_LY_THE.repaint();

        // ADD QUAN LY GIA VE
        jpnQUAN_LY_GIA_VE.removeAll();
        jpnQUAN_LY_GIA_VE.setLayout(new BorderLayout());
        jpnQUAN_LY_GIA_VE.add(new QUAN_LY_GIA_XE());
        jpnQUAN_LY_GIA_VE.validate();
        jpnQUAN_LY_GIA_VE.repaint();

        // QUAN LY
        // ADD QUAN LY NHAN VIEN 
        jpnQL_NV.removeAll();
        jpnQL_NV.setLayout(new BorderLayout());
        jpnQL_NV.add(new QUAN_LY_NHANN_VIEN());
        jpnQL_NV.validate();
        jpnQL_NV.repaint();

        // ADD QUAN LY TAI KHHOAN
        jpnQLTK.removeAll();
        jpnQLTK.setLayout(new BorderLayout());
        jpnQLTK.add(new QUAN_LYTAI_KHOAN());
        jpnQLTK.validate();
        jpnQLTK.repaint();

        //ADD QUAN LY CA TRUC 
        jpnQL_CT.removeAll();
        jpnQL_CT.setLayout(new BorderLayout());
        jpnQL_CT.add(new QUAN_LY_CA_TRUC());
        jpnQL_CT.validate();
        jpnQL_CT.repaint();
        // ADD THHONG KE

        jpnTHONG_KE.removeAll();
        jpnTHONG_KE.setLayout(new BorderLayout());
        jpnTHONG_KE.add(new THONG_KE());
        jpnTHONG_KE.validate();
        jpnTHONG_KE.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlbDMY = new javax.swing.JLabel();
        jlbTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnGUIXE = new javax.swing.JPanel();
        jpnDS_hinh_thuc_gui_xe = new javax.swing.JPanel();
        JPNCHITIETRAVAO = new javax.swing.JPanel();
        jpnQUAN_LY_THE = new javax.swing.JPanel();
        jpnQUAN_LY_GIA_VE = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jpnQL_NV = new javax.swing.JPanel();
        jpnQL_CT = new javax.swing.JPanel();
        jpnQLTK = new javax.swing.JPanel();
        jpnTHONG_KE = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ BÃI GIỮ XE HỌC VIỆN CƠ SỞ");

        jlbDMY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbDMY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbDMY.setText("ngay  14 thang 02 năm 2023");

        jlbTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTime.setText("19:25:01");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NGUYỄN THANH HỮU");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("QUẢN LÝ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ĐĂNG XUẤT");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jpnGUIXELayout = new javax.swing.GroupLayout(jpnGUIXE);
        jpnGUIXE.setLayout(jpnGUIXELayout);
        jpnGUIXELayout.setHorizontalGroup(
            jpnGUIXELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        jpnGUIXELayout.setVerticalGroup(
            jpnGUIXELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("GỬI XE", jpnGUIXE);

        javax.swing.GroupLayout jpnDS_hinh_thuc_gui_xeLayout = new javax.swing.GroupLayout(jpnDS_hinh_thuc_gui_xe);
        jpnDS_hinh_thuc_gui_xe.setLayout(jpnDS_hinh_thuc_gui_xeLayout);
        jpnDS_hinh_thuc_gui_xeLayout.setHorizontalGroup(
            jpnDS_hinh_thuc_gui_xeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        jpnDS_hinh_thuc_gui_xeLayout.setVerticalGroup(
            jpnDS_hinh_thuc_gui_xeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("DANH SÁCH  ĐĂNG KÍ HÌNH THỨC GỬI XE", jpnDS_hinh_thuc_gui_xe);

        javax.swing.GroupLayout JPNCHITIETRAVAOLayout = new javax.swing.GroupLayout(JPNCHITIETRAVAO);
        JPNCHITIETRAVAO.setLayout(JPNCHITIETRAVAOLayout);
        JPNCHITIETRAVAOLayout.setHorizontalGroup(
            JPNCHITIETRAVAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        JPNCHITIETRAVAOLayout.setVerticalGroup(
            JPNCHITIETRAVAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CHI TIẾT RA VÀO", JPNCHITIETRAVAO);

        javax.swing.GroupLayout jpnQUAN_LY_THELayout = new javax.swing.GroupLayout(jpnQUAN_LY_THE);
        jpnQUAN_LY_THE.setLayout(jpnQUAN_LY_THELayout);
        jpnQUAN_LY_THELayout.setHorizontalGroup(
            jpnQUAN_LY_THELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        jpnQUAN_LY_THELayout.setVerticalGroup(
            jpnQUAN_LY_THELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("QUẢN LÝ THẺ", jpnQUAN_LY_THE);

        javax.swing.GroupLayout jpnQUAN_LY_GIA_VELayout = new javax.swing.GroupLayout(jpnQUAN_LY_GIA_VE);
        jpnQUAN_LY_GIA_VE.setLayout(jpnQUAN_LY_GIA_VELayout);
        jpnQUAN_LY_GIA_VELayout.setHorizontalGroup(
            jpnQUAN_LY_GIA_VELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        jpnQUAN_LY_GIA_VELayout.setVerticalGroup(
            jpnQUAN_LY_GIA_VELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("QUẢN LÝ GIÁ XE", jpnQUAN_LY_GIA_VE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("XE", jPanel1);

        javax.swing.GroupLayout jpnQL_NVLayout = new javax.swing.GroupLayout(jpnQL_NV);
        jpnQL_NV.setLayout(jpnQL_NVLayout);
        jpnQL_NVLayout.setHorizontalGroup(
            jpnQL_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        jpnQL_NVLayout.setVerticalGroup(
            jpnQL_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("QUẢN LÝ NHÂN VIÊN", jpnQL_NV);

        javax.swing.GroupLayout jpnQL_CTLayout = new javax.swing.GroupLayout(jpnQL_CT);
        jpnQL_CT.setLayout(jpnQL_CTLayout);
        jpnQL_CTLayout.setHorizontalGroup(
            jpnQL_CTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        jpnQL_CTLayout.setVerticalGroup(
            jpnQL_CTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("QUẢN LÝ CA TRỰC", jpnQL_CT);

        javax.swing.GroupLayout jpnQLTKLayout = new javax.swing.GroupLayout(jpnQLTK);
        jpnQLTK.setLayout(jpnQLTKLayout);
        jpnQLTKLayout.setHorizontalGroup(
            jpnQLTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        jpnQLTKLayout.setVerticalGroup(
            jpnQLTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("QUẢN LÝ TÀI KHOẢN", jpnQLTK);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("NHÂN VIÊN", jPanel2);

        javax.swing.GroupLayout jpnTHONG_KELayout = new javax.swing.GroupLayout(jpnTHONG_KE);
        jpnTHONG_KE.setLayout(jpnTHONG_KELayout);
        jpnTHONG_KELayout.setHorizontalGroup(
            jpnTHONG_KELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        jpnTHONG_KELayout.setVerticalGroup(
            jpnTHONG_KELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("THỐNG KÊ", jpnTHONG_KE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbDMY, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbDMY, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jlbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        LOGIN lg = new LOGIN();
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPNCHITIETRAVAO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel jlbDMY;
    private javax.swing.JLabel jlbTime;
    private javax.swing.JPanel jpnDS_hinh_thuc_gui_xe;
    private javax.swing.JPanel jpnGUIXE;
    private javax.swing.JPanel jpnQLTK;
    private javax.swing.JPanel jpnQL_CT;
    private javax.swing.JPanel jpnQL_NV;
    private javax.swing.JPanel jpnQUAN_LY_GIA_VE;
    private javax.swing.JPanel jpnQUAN_LY_THE;
    private javax.swing.JPanel jpnTHONG_KE;
    // End of variables declaration//GEN-END:variables

}
