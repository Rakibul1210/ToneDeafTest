/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

public class testOnes extends javax.swing.JFrame {

    /**
     * Creates new form testOnes
     */
    private int l,r,miss=0,hit=0,iteration=0;
    
    public testOnes() {
        initComponents();
        bar1.setMaximum(12);
        bar1.setValue(0);
    }

    private void randomGenerator()
    {
        System.out.println(" hello");
        double x=Math.random();
        x*=1000000;
       // System.out.print(x);
        l=(int)(x%5);
        x=Math.random();
        x*=1000000;
       // System.out.print(" "+x+"   l="+l+" r="+r);
        r=(int)(x%5);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnPlay1 = new javax.swing.JButton();
        btnPlay2 = new javax.swing.JButton();
        btnSame = new javax.swing.JButton();
        btnDffrnt = new javax.swing.JButton();
        it = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Times New Roman", 0, 72)); // NOI18N
        title.setForeground(new java.awt.Color(26, 188, 154));
        title.setText("Tone Deef Test");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/img/logo.jpg"))); // NOI18N

        bar1.setBackground(new java.awt.Color(255, 255, 255));
        bar1.setForeground(new java.awt.Color(26, 188, 154));

        jLabel1.setFont(new java.awt.Font("Lato", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 73, 94));
        jLabel1.setText("Stage A:");

        jLabel3.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 73, 94));
        jLabel3.setText("Are these two notes the");

        jLabel4.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 73, 94));
        jLabel4.setText(" same");

        jLabel5.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 73, 94));
        jLabel5.setText(" or");

        jLabel6.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 73, 94));
        jLabel6.setText("different?");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(189, 195, 199));
        jLabel7.setText("Click");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(189, 195, 199));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/img/playFade.PNG"))); // NOI18N
        jLabel8.setText("to play the clips.");

        btnPlay1.setForeground(new java.awt.Color(0, 153, 153));
        btnPlay1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/img/PlayLogo.PNG"))); // NOI18N
        btnPlay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlay1ActionPerformed(evt);
            }
        });

        btnPlay2.setForeground(new java.awt.Color(0, 153, 153));
        btnPlay2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/img/PlayLogo.PNG"))); // NOI18N
        btnPlay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlay2ActionPerformed(evt);
            }
        });

        btnSame.setBackground(new java.awt.Color(255, 255, 0));
        btnSame.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btnSame.setForeground(new java.awt.Color(255, 255, 255));
        btnSame.setText("same");
        btnSame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSameActionPerformed(evt);
            }
        });

        btnDffrnt.setBackground(new java.awt.Color(255, 255, 0));
        btnDffrnt.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btnDffrnt.setForeground(new java.awt.Color(255, 255, 255));
        btnDffrnt.setText("different");
        btnDffrnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDffrntActionPerformed(evt);
            }
        });

        it.setFont(new java.awt.Font("Lato", 1, 48)); // NOI18N
        it.setForeground(new java.awt.Color(52, 73, 94));
        it.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(it)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPlay1)
                                .addGap(38, 38, 38)
                                .addComponent(btnPlay2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addComponent(btnSame, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnDffrnt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(it))
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlay2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSame, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDffrnt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlay1ActionPerformed
        // TODO add your handling code here:
        String s="\\Stage A\\piano-note-6"+l;
        System.out.println(s);
        Audio.playSound(s);
    }//GEN-LAST:event_btnPlay1ActionPerformed

    private void btnPlay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlay2ActionPerformed
        // TODO add your handling code here:
         String s="\\Stage A\\piano-note-6"+r;
        System.out.println(s);
        Audio.playSound(s);
    }//GEN-LAST:event_btnPlay2ActionPerformed

    private void btnSameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSameActionPerformed
        // TODO add your handling code here:
        if(l==r){
            hit++;
        }
        else{
            miss++;
        }
        randomGenerator();
        System.out.print("l="+l+" r="+r+" i="+iteration);
        iteration++;
        bar1.setValue(iteration);
        it.setText(String.valueOf(iteration+1));
        if(iteration==13)
        {
            JOptionPane.showMessageDialog(null, "miss="+miss+" hit="+hit);
            testTwoM ob = new testTwoM(miss,hit);
            ob.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_btnSameActionPerformed

    private void btnDffrntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDffrntActionPerformed
        // TODO add your handling code here:
        if(l==r){
            miss++;
        }
        else{
            hit++;
        }
        randomGenerator();
        System.out.print("l="+l+" r="+r+" i="+iteration);
        iteration++;
        bar1.setValue(iteration);
        it.setText(String.valueOf(iteration+1));
        if(iteration==12)
        {
            JOptionPane.showMessageDialog(null, "miss="+miss+" hit="+hit);
            testTwoM ob = new testTwoM(miss,hit);
            ob.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnDffrntActionPerformed

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
            java.util.logging.Logger.getLogger(testOnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testOnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testOnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testOnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testOnes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar1;
    private javax.swing.JButton btnDffrnt;
    private javax.swing.JButton btnPlay1;
    private javax.swing.JButton btnPlay2;
    private javax.swing.JButton btnSame;
    private javax.swing.JLabel it;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
