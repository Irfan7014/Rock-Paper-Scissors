/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.game;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class LetsPlay extends javax.swing.JFrame {

    /**
     * Creates new form LetsPlay
     */
    public LetsPlay() {
        initComponents();
        Color backgroundcolor=new Color(0,0,0);
        this.getContentPane().setBackground(backgroundcolor);
        setVisible(true); 
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblletsplay = new javax.swing.JLabel();
        letsplaypanel = new javax.swing.JPanel();
        playbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));

        lblletsplay.setFont(new java.awt.Font("Times New Roman", 3, 42)); // NOI18N
        lblletsplay.setForeground(new java.awt.Color(187, 232, 134));
        lblletsplay.setText("ROCK-PAPER-SCISSORS");

        letsplaypanel.setBackground(new java.awt.Color(0, 128, 128));
        letsplaypanel.setBorder(new javax.swing.border.MatteBorder(null));

        playbutton.setFont(new java.awt.Font("Times New Roman", 1, 45)); // NOI18N
        playbutton.setForeground(new java.awt.Color(255, 102, 102));
        playbutton.setText("PLAY!");
        playbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playbuttonMouseClicked(evt);
            }
        });

        exitbutton.setFont(new java.awt.Font("Times New Roman", 1, 45)); // NOI18N
        exitbutton.setForeground(new java.awt.Color(255, 102, 102));
        exitbutton.setText("EXIT");
        exitbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout letsplaypanelLayout = new javax.swing.GroupLayout(letsplaypanel);
        letsplaypanel.setLayout(letsplaypanelLayout);
        letsplaypanelLayout.setHorizontalGroup(
            letsplaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(letsplaypanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(letsplaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        letsplaypanelLayout.setVerticalGroup(
            letsplaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(letsplaypanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(playbutton)
                .addGap(58, 58, 58)
                .addComponent(exitbutton)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblletsplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letsplaypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblletsplay)
                .addGap(33, 33, 33)
                .addComponent(letsplaypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playbuttonMouseClicked
        // TODO add your handling code here:
        dispose();
        Rounds r=new Rounds();
    }//GEN-LAST:event_playbuttonMouseClicked

    private void exitbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbuttonMouseClicked
        // TODO add your handling code here:
        dispose();
        Exit e=new Exit();
    }//GEN-LAST:event_exitbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(LetsPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LetsPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LetsPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LetsPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LetsPlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel lblletsplay;
    private javax.swing.JPanel letsplaypanel;
    private javax.swing.JButton playbutton;
    // End of variables declaration//GEN-END:variables
}
