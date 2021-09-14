/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author saleh
 */
public class Index extends javax.swing.JFrame {

    AnimationClass ac = new AnimationClass();
    Queries qr = new Queries();
    HomePage hp = new HomePage();
    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
        sliderShow();
    }
    public void sliderShow(){
        new Thread(new Runnable(){
            @Override
            public void run() {
                int nb = 0;
                try{
                    while(true){
                        switch(nb){
                            case 0:
                                Thread.sleep(4000);
                                ac.jLabelXLeft(0, -920, 12, 10, img1);
                                ac.jLabelXLeft(920, 0, 12, 10, img2);
                                ac.jLabelXLeft(1840, 920, 12, 10, img3);
                                ac.jLabelXLeft(2760, 1840, 12, 10, img4);
                                ac.jLabelXLeft(3680, 2760, 12, 10, img5);
                                ac.jLabelXLeft(4600, 3680, 12, 10, img6);
                                nb++;
                                
                            case 1:
                                Thread.sleep(4000);
                                ac.jLabelXLeft(-920, -1840, 12, 10, img1);
                                ac.jLabelXLeft(0, -920, 12, 10, img2);
                                ac.jLabelXLeft(920, 0, 12, 10, img3);
                                ac.jLabelXLeft(1840, 920, 12, 10, img4);
                                ac.jLabelXLeft(2760, 1840, 12, 10, img5);
                                ac.jLabelXLeft(3680, 2760, 12, 10, img6);
                                nb++;
                                
                            case 2:
                                Thread.sleep(4000);
                                ac.jLabelXLeft(-1840, -2760, 12, 10, img1);
                                ac.jLabelXLeft(-920, -1840, 12, 10, img2);
                                ac.jLabelXLeft(0, -920, 12, 10, img3);
                                ac.jLabelXLeft(920, 0, 12, 10, img4);
                                ac.jLabelXLeft(1840, 920, 12, 10, img5);
                                ac.jLabelXLeft(2760, 1840, 12, 10, img6);
                                nb++;
                                
                            case 3:
                                Thread.sleep(4000);
                                ac.jLabelXLeft(-2760, -3680, 12, 10, img1);
                                ac.jLabelXLeft(-1840, -2760, 12, 10, img2);
                                ac.jLabelXLeft(-920, -1840, 12, 10, img3);
                                ac.jLabelXLeft(0, -920, 12, 10, img4);
                                ac.jLabelXLeft(920, 0, 12, 10, img5);
                                ac.jLabelXLeft(1840, 920, 12, 10, img6);
                                nb++;
                                
                             case 4:
                                Thread.sleep(4000);
                                ac.jLabelXLeft(-3680, -4600, 12, 10, img1);
                                ac.jLabelXLeft(-2760, -3680, 12, 10, img2);
                                ac.jLabelXLeft(-1840, -2760, 12, 10, img3);
                                ac.jLabelXLeft(-920, -1840, 12, 10, img4);
                                ac.jLabelXLeft(0, -920, 12, 10, img5);
                                ac.jLabelXLeft(920, 0, 12, 10, img6);
                                nb++;
                                
                            case 5:
                                Thread.sleep(4000);
                                ac.jLabelXRight(-4600, -3680, 5, 100, img1);
                                ac.jLabelXRight(-3680, -2760, 5, 100, img2);
                                ac.jLabelXRight(-2760, -1840, 5, 100, img3);
                                ac.jLabelXRight(-1840, -920, 5, 100, img4);
                                ac.jLabelXRight(-920, 0, 5, 100, img5);
                                ac.jLabelXRight(0, 920, 5, 100, img6);
                                nb++;
                                
                            case 6:
                                Thread.sleep(100);
                                ac.jLabelXRight(-3680, -2760, 5, 100, img1);
                                ac.jLabelXRight(-2760, -1840, 5, 100, img2);
                                ac.jLabelXRight(-1840, -920, 5, 100, img3);
                                ac.jLabelXRight(-920, 0, 5, 100, img4);
                                ac.jLabelXRight(0, 920, 5, 100, img5);
                                ac.jLabelXRight(920, 1840, 5, 100, img6);
                                nb++;
                             
                            case 7:
                                Thread.sleep(100);
                                ac.jLabelXRight(-2760, -1840, 5, 100, img1);
                                ac.jLabelXRight(-1840, -920, 5, 100, img2);
                                ac.jLabelXRight(-920, 0, 5, 100, img3);
                                ac.jLabelXRight(0, 920, 5, 100, img4);
                                ac.jLabelXRight(920, 1840, 5, 100, img5);
                                ac.jLabelXRight(1840, 2760, 5, 100, img6);
                                nb++;
                            
                            case 8:
                                Thread.sleep(100);
                                ac.jLabelXRight(-1840, -920, 5, 100, img1);
                                ac.jLabelXRight(-920, 0, 5, 100, img2);
                                ac.jLabelXRight(0, 920, 5, 100, img3);
                                ac.jLabelXRight(920, 1840, 5, 100, img4);
                                ac.jLabelXRight(1840, 2760, 5, 100, img5);
                                ac.jLabelXRight(2760, 3680, 5, 100, img6);
                                nb++;
                            
                            case 9:
                                Thread.sleep(100);
                                ac.jLabelXRight(-920, 0, 5, 100, img1);
                                ac.jLabelXRight(0, 920, 5, 100, img2);
                                ac.jLabelXRight(920, 1840, 5, 100, img3);
                                ac.jLabelXRight(1840, 2760, 5, 100, img4);
                                ac.jLabelXRight(2760, 3680, 5, 100, img5);
                                ac.jLabelXRight(3680, 4600, 5, 100, img6);
                                nb=0;
                            
                        }
                     
                    }
                    
                }catch(Exception e){
                    System.out.println("ERROR");
                    
                }
            }
            
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        shopName = new javax.swing.JLabel();
        siginText = new javax.swing.JLabel();
        userIDtext = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();
        passText = new javax.swing.JLabel();
        advanceIcon = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        ShowPass = new javax.swing.JCheckBox();
        passWord = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shopName.setForeground(new java.awt.Color(0, 0, 0));
        shopName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopName.jpg"))); // NOI18N
        jPanel1.add(shopName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        siginText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        siginText.setForeground(new java.awt.Color(0, 0, 0));
        siginText.setText("Sign in");
        jPanel1.add(siginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 200, -1, -1));

        userIDtext.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        userIDtext.setForeground(new java.awt.Color(0, 0, 0));
        userIDtext.setText("User ID");
        jPanel1.add(userIDtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 280, -1, -1));

        userID.setBackground(new java.awt.Color(255, 255, 255));
        userID.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        userID.setForeground(new java.awt.Color(102, 102, 102));
        userID.setText("Enter User ID");
        userID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userIDFocusLost(evt);
            }
        });
        jPanel1.add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 310, 300, 40));

        passText.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        passText.setForeground(new java.awt.Color(0, 0, 0));
        passText.setText("Password");
        jPanel1.add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 380, -1, -1));

        advanceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/advance.png"))); // NOI18N
        advanceIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                advanceIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                advanceIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                advanceIconMouseExited(evt);
            }
        });
        jPanel1.add(advanceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 530, -1, -1));

        copyright.setForeground(new java.awt.Color(0, 0, 0));
        copyright.setText("Copyright © 2021, TechnoBot BD");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, -1, -1));

        ShowPass.setBackground(new java.awt.Color(255, 255, 255));
        ShowPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ShowPass.setForeground(new java.awt.Color(0, 153, 204));
        ShowPass.setText("Show Password");
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        jPanel1.add(ShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 460, -1, -1));

        passWord.setBackground(new java.awt.Color(255, 255, 255));
        passWord.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        passWord.setForeground(new java.awt.Color(102, 102, 102));
        passWord.setText("Enter Password");
        passWord.setEchoChar('\u0000');
        passWord.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passWordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passWordFocusLost(evt);
            }
        });
        jPanel1.add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 410, 300, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(25, 28, 44));
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 720));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img1.jpg"))); // NOI18N
        jPanel2.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img2.jpg"))); // NOI18N
        jPanel2.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img3.jpg"))); // NOI18N
        jPanel2.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 0, -1, -1));

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img4.jpg"))); // NOI18N
        jPanel2.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2760, 0, -1, -1));

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img5.jpg"))); // NOI18N
        jPanel2.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(3680, 0, -1, -1));

        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img6.jpg"))); // NOI18N
        jPanel2.add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(4600, 0, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        getContentPane().add(jPanel3, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userIDFocusGained
        // TODO add your handling code here:
        if(userID.getText().equals("Enter User ID")){
            userID.setText("");
            userID.requestFocus();
            userID.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_userIDFocusGained

    private void userIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userIDFocusLost
        // TODO add your handling code here:
        if(userID.getText().length()== 0){
            userID.setText("Enter User ID");
            userID.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_userIDFocusLost

    private void advanceIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advanceIconMouseEntered
        // TODO add your handling code here:
        advanceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/advanceHlt.png")));
    }//GEN-LAST:event_advanceIconMouseEntered

    private void advanceIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advanceIconMouseExited
        // TODO add your handling code here:
        advanceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/advance.png")));
    }//GEN-LAST:event_advanceIconMouseExited

    private void advanceIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advanceIconMouseClicked
        try {
            // TODO add your handling code here:
            qr.login();
            if(userID.getText().equals(qr.UserID) && passWord.getText().equals(qr.UserPassword)){
                hp.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Caution", JOptionPane.OK_OPTION);
            }
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_advanceIconMouseClicked

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        // TODO add your handling code here:
        if(ShowPass.isSelected())
        {
            passWord.setEchoChar((char)0);
        }
        else {
            if(passWord.getText().equals("Enter Password")){
                passWord.setEchoChar((char)0);
            }
            else{
                passWord.setEchoChar('.');
            }
        }
    }//GEN-LAST:event_ShowPassActionPerformed

    private void passWordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passWordFocusGained
        // TODO add your handling code here:
        if(passWord.getText().equals("Enter Password")){
            passWord.setText("");
            passWord.requestFocus();
            passWord.setForeground(new Color(0,0,0));
            if(ShowPass.isSelected())
            {
                passWord.setEchoChar((char)0);
            }
            else{
                passWord.setEchoChar('.');
            } 
        }
    }//GEN-LAST:event_passWordFocusGained

    private void passWordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passWordFocusLost
        // TODO add your handling code here:
        if(passWord.getText().length()==0){
            passWord.setText("Enter Password");
            passWord.setForeground(new Color(102,102,102));
            passWord.setEchoChar((char)0);
        }
    }//GEN-LAST:event_passWordFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JLabel advanceIcon;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel passText;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JLabel shopName;
    private javax.swing.JLabel siginText;
    private javax.swing.JTextField userID;
    private javax.swing.JLabel userIDtext;
    // End of variables declaration//GEN-END:variables
}
