/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.JOptionPane;

/**
 *
 * @author saleh
 */
public class HomePage extends javax.swing.JFrame {
    /**
     * Creates new form HomePage
     */
    
    AllProducts alp = new AllProducts();
    SellHistory sh = new SellHistory();
    ModifyProducts mp = new ModifyProducts();
    SellProducts sp = new SellProducts();
    
    public HomePage() {
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
        WelcomeTxt = new javax.swing.JLabel();
        AllProductsBtn = new javax.swing.JButton();
        SellHistoryBtn = new javax.swing.JButton();
        AddProductsBtn = new javax.swing.JButton();
        SellProductsBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        copyright = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/WelcomeText.png"))); // NOI18N
        jPanel1.add(WelcomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        AllProductsBtn.setBackground(new java.awt.Color(29, 31, 47));
        AllProductsBtn.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        AllProductsBtn.setForeground(new java.awt.Color(255, 255, 255));
        AllProductsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AllProducts.png"))); // NOI18N
        AllProductsBtn.setText("All Products");
        AllProductsBtn.setPreferredSize(new java.awt.Dimension(300, 125));
        AllProductsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllProductsBtnMouseClicked(evt);
            }
        });
        jPanel1.add(AllProductsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 225, -1, -1));

        SellHistoryBtn.setBackground(new java.awt.Color(29, 31, 47));
        SellHistoryBtn.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        SellHistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        SellHistoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SellHistory.png"))); // NOI18N
        SellHistoryBtn.setText("Sell History");
        SellHistoryBtn.setPreferredSize(new java.awt.Dimension(300, 125));
        SellHistoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellHistoryBtnMouseClicked(evt);
            }
        });
        jPanel1.add(SellHistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 435, -1, -1));

        AddProductsBtn.setBackground(new java.awt.Color(29, 31, 47));
        AddProductsBtn.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        AddProductsBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddProductsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        AddProductsBtn.setText("Modify Products");
        AddProductsBtn.setPreferredSize(new java.awt.Dimension(300, 125));
        AddProductsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddProductsBtnMouseClicked(evt);
            }
        });
        jPanel1.add(AddProductsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 225, -1, -1));

        SellProductsBtn.setBackground(new java.awt.Color(29, 31, 47));
        SellProductsBtn.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        SellProductsBtn.setForeground(new java.awt.Color(255, 255, 255));
        SellProductsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SellProducts.png"))); // NOI18N
        SellProductsBtn.setText("Sell Products");
        SellProductsBtn.setPreferredSize(new java.awt.Dimension(300, 125));
        SellProductsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellProductsBtnMouseClicked(evt);
            }
        });
        jPanel1.add(SellProductsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 435, -1, -1));

        LogoutBtn.setBackground(new java.awt.Color(29, 31, 47));
        LogoutBtn.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logout.png"))); // NOI18N
        LogoutBtn.setText("Signout");
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseExited(evt);
            }
        });
        jPanel1.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1107, 625, -1, -1));

        copyright.setForeground(new java.awt.Color(0, 0, 0));
        copyright.setText("Copyright © 2021, TechnoBot BD");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 700, -1, -1));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HomeBG.png"))); // NOI18N
        jPanel1.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseEntered
        // TODO add your handling code here:
        LogoutBtn.setBackground(new java.awt.Color(209, 54, 57));
    }//GEN-LAST:event_LogoutBtnMouseEntered

    private void LogoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseExited
        // TODO add your handling code here:
        LogoutBtn.setBackground(new java.awt.Color(29, 31, 47));
    }//GEN-LAST:event_LogoutBtnMouseExited

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        // TODO add your handling code here:
        confirmLogout();
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void AllProductsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllProductsBtnMouseClicked
        // TODO add your handling code here:
        alp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AllProductsBtnMouseClicked

    private void SellHistoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellHistoryBtnMouseClicked
        // TODO add your handling code here:
        sh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SellHistoryBtnMouseClicked

    private void AddProductsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddProductsBtnMouseClicked
        // TODO add your handling code here:
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddProductsBtnMouseClicked

    private void SellProductsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellProductsBtnMouseClicked
        // TODO add your handling code here:
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SellProductsBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public void confirmLogout(){
        int confirm = JOptionPane.showConfirmDialog(null,"Sure? You want to Signout?", "Caution",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(confirm == JOptionPane.YES_OPTION){
            try{
                Index in = new Index();
                in.setVisible(true);
                this.dispose();    
            }catch(Exception e){
                System.out.println("ERROR");
            }   
        }
    }
    
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductsBtn;
    private javax.swing.JButton AllProductsBtn;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton SellHistoryBtn;
    private javax.swing.JButton SellProductsBtn;
    private javax.swing.JLabel WelcomeTxt;
    private javax.swing.JLabel copyright;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
