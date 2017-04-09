/*
 * Progaramming Priciples 01 (Course Work - 2 )
 * Student Name - Dilum Maduranga De Silva
 * UoW ID       - 16266371 (W1626637)
 * IIT ID       - 2016142  
 */
package HangManGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Dilum De Silva
 */
public class startframe extends javax.swing.JFrame {

    /**
     * Creates new form startframe
     */
    private Timer t = null;
    private int count = 0;
    
    public startframe() {
        initComponents();
        
         waitmsglbl.setVisible(false); 
         startpic.setVisible(false);
         mkey3.setVisible(false);
         mkey2.setVisible(false);
         mkey1.setVisible(false);
         baloo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mkey1 = new javax.swing.JLabel();
        mkey3 = new javax.swing.JLabel();
        mkey2 = new javax.swing.JLabel();
        topiclbl = new javax.swing.JLabel();
        startbtn = new javax.swing.JButton();
        playbtn = new javax.swing.JButton();
        helpbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        iitlogolbl = new javax.swing.JLabel();
        uowlogolbl = new javax.swing.JLabel();
        waitmsglbl = new javax.swing.JLabel();
        startpic = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        baloo = new javax.swing.JLabel();
        startback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1204, 698));
        setMinimumSize(new java.awt.Dimension(1204, 698));
        setPreferredSize(new java.awt.Dimension(1204, 698));
        setResizable(false);
        setSize(new java.awt.Dimension(1204, 698));
        getContentPane().setLayout(null);

        mkey1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mkey1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HangManGame/rsz_hcut.png"))); // NOI18N
        getContentPane().add(mkey1);
        mkey1.setBounds(50, 160, 70, 80);

        mkey3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mkey3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HangManGame/mkey2.png"))); // NOI18N
        getContentPane().add(mkey3);
        mkey3.setBounds(690, 260, 160, 160);

        mkey2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mkey2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HangManGame/mkey2.png"))); // NOI18N
        getContentPane().add(mkey2);
        mkey2.setBounds(280, 160, 130, 210);

        topiclbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HangManGame/l100%.png"))); // NOI18N
        getContentPane().add(topiclbl);
        topiclbl.setBounds(380, 20, 520, 300);

        startbtn.setBackground(new java.awt.Color(204, 204, 204));
        startbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        startbtn.setText("Start");
        startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtnActionPerformed(evt);
            }
        });
        getContentPane().add(startbtn);
        startbtn.setBounds(550, 360, 140, 40);

        playbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playbtn.setText("Play");
        playbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playbtnActionPerformed(evt);
            }
        });
        getContentPane().add(playbtn);
        playbtn.setBounds(550, 360, 140, 40);

        helpbtn.setBackground(new java.awt.Color(204, 204, 204));
        helpbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        helpbtn.setText("Help");
        helpbtn.setMaximumSize(new java.awt.Dimension(67, 25));
        helpbtn.setMinimumSize(new java.awt.Dimension(67, 25));
        helpbtn.setPreferredSize(new java.awt.Dimension(67, 25));
        helpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpbtnActionPerformed(evt);
            }
        });
        getContentPane().add(helpbtn);
        helpbtn.setBounds(550, 420, 140, 40);

        exitbtn.setBackground(new java.awt.Color(204, 204, 204));
        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.setMaximumSize(new java.awt.Dimension(67, 25));
        exitbtn.setMinimumSize(new java.awt.Dimension(67, 25));
        exitbtn.setPreferredSize(new java.awt.Dimension(67, 25));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn);
        exitbtn.setBounds(550, 500, 140, 40);

        iitlogolbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iitlogolbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HangManGame/iit.png"))); // NOI18N
        getContentPane().add(iitlogolbl);
        iitlogolbl.setBounds(1110, 10, 100, 120);

        uowlogolbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uowlogolbl.setIcon(new javax.swing.ImageIcon("F:\\HangMan(My)\\Hangman pics\\uow2.png")); // NOI18N
        getContentPane().add(uowlogolbl);
        uowlogolbl.setBounds(1010, 10, 90, 160);

        waitmsglbl.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(waitmsglbl);
        waitmsglbl.setBounds(570, 600, 300, 30);

        startpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HangManGame/mdhappy4.png"))); // NOI18N
        getContentPane().add(startpic);
        startpic.setBounds(170, 380, 350, 310);

        jProgressBar1.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(300, 630, 650, 20);

        baloo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HangManGame/baloohappy.png"))); // NOI18N
        baloo.setText("jLabel1");
        getContentPane().add(baloo);
        baloo.setBounds(830, 400, 280, 250);

        startback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HangManGame/back25%.jpg"))); // NOI18N
        getContentPane().add(startback);
        startback.setBounds(0, -150, 1740, 970);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // Set window close to the exit button of the starframe
           dispose(); 
    }//GEN-LAST:event_exitbtnActionPerformed

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed
        // Start button of the start frame 
        
           //set progress bar to the start button        
            t = new Timer(100, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            count++;
            jProgressBar1.setValue(count);
            
            if (jProgressBar1.getValue() < 100){
            jProgressBar1.setValue(jProgressBar1.getValue() + 1);
            }
            
            if (jProgressBar1.getValue() == 2){
                 waitmsglbl.setVisible(true);
                 mkey1.setVisible(true);
                 waitmsglbl.setText("Please wait..."); 
            }
            
            if (jProgressBar1.getValue() == 19){               
                 mkey1.setVisible(false);   
                 mkey2.setVisible(true);
            }
            
            if (jProgressBar1.getValue() == 28){
                 mkey2.setVisible(false);
            }
            
            if (jProgressBar1.getValue() == 37){
                mkey3.setVisible(true);
            }
            
             if (jProgressBar1.getValue() == 45){
                baloo.setVisible(true);
             }
             
            if (jProgressBar1.getValue() == 55){
                 baloo.setVisible(false);
                 startpic.setVisible(true);  // when progress bar reach 45% startpic will display
                 waitmsglbl.setText("Loding workspace...");
            }
           
            if (jProgressBar1.getValue() == 65){
                // startpic.setVisible(true);  // when progress bar reach 25% startpic will display
                 waitmsglbl.setText("We are done..."); 
            }
            if (jProgressBar1.getValue() == 85){
                 //startpic.setVisible(true);  // when progress bar reach 25% startpic will display
                 waitmsglbl.setText("Here we go..."); 
            }
            if (jProgressBar1.getValue() == 95){
                 //startpic.setVisible(true);  // when progress bar reach 25% startpic will display
                 waitmsglbl.setText("Let's start.."); 
            }
            if (jProgressBar1.getValue() == 99){
                
                startbtn.setVisible(false);
            }
         //   if (jProgressBar1.getValue() == 100){
              

              
               
               
            
            }
       
       
       
       }); 
        
       t.start();
        
           
            
        
        
    }//GEN-LAST:event_startbtnActionPerformed

    private void helpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpbtnActionPerformed
        // help button of the start frame
    }//GEN-LAST:event_helpbtnActionPerformed

    private void playbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playbtnActionPerformed
         //this will close the start frame and continue to game
             dispose(); 
             HangManGame game = new  HangManGame();
             game.setVisible(true); 
    }//GEN-LAST:event_playbtnActionPerformed

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
            java.util.logging.Logger.getLogger(startframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baloo;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton helpbtn;
    private javax.swing.JLabel iitlogolbl;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel mkey1;
    private javax.swing.JLabel mkey2;
    private javax.swing.JLabel mkey3;
    private javax.swing.JButton playbtn;
    private javax.swing.JLabel startback;
    private javax.swing.JButton startbtn;
    private javax.swing.JLabel startpic;
    private javax.swing.JLabel topiclbl;
    private javax.swing.JLabel uowlogolbl;
    private javax.swing.JLabel waitmsglbl;
    // End of variables declaration//GEN-END:variables
}
