package GUI;

/**
 *
 * @author juanesgs2002@gmail.com
 */
public class Principal extends javax.swing.JFrame {

    int cont1 = 0, cont2 = 0;
    
    public Principal() {
        initComponents();
        setResizable(false);
        setSize(1280, 720);
        this.setLocationRelativeTo(null);
        score1.setText("0");
        score2.setText("0");
        
        rockLBL.setVisible(false);
        paperLBL1.setVisible(false);
        scissorsLBL1.setVisible(false);
        
        rockLBL2.setVisible(false);
        paperLBL2.setVisible(false);
        scissorsLBL2.setVisible(false);
        
        label1.setVisible(false);
        label2.setVisible(false);
    }
    
    public void IA(){
        rock4.setEnabled(true);
        paper4.setEnabled(true);
        scissors4.setEnabled(true);
        
        int computer = (int) (Math.random()*3);
        String cadena = String.valueOf(computer);
        label2.setText(cadena);
        
        if(computer == 0){
            
            rock4.setEnabled(false);
        }else if(computer == 1){
            
            paper4.setEnabled(false);
        }else if(computer == 2){
            
            scissors4.setEnabled(false);
        }
    }
    
    public void Game(){
        
        int computer = Integer.parseInt(label1.getText());
        
        if(label1.getText() == "0" && computer == 0){
            
            rockLBL.setVisible(true);
            paperLBL1.setVisible(false);
            scissorsLBL1.setVisible(false);
        
            rockLBL2.setVisible(true);
            paperLBL2.setVisible(false);
            scissorsLBL2.setVisible(false);
            
            NOTE.setText("DRAW!!");
        }else if(label1.getText() == "0" && computer == 1){
            
            rockLBL.setVisible(true);
            paperLBL1.setVisible(false);
            scissorsLBL1.setVisible(false);
        
            rockLBL2.setVisible(false);
            paperLBL2.setVisible(true);
            scissorsLBL2.setVisible(false);
            
            NOTE.setText("COMPUTER WINS!!");
            cont2 = cont2 + 1;
        }else if(label1.getText() == "0" && computer == 2){
            
            rockLBL.setVisible(true);
            paperLBL1.setVisible(false);
            scissorsLBL1.setVisible(false);
        
            rockLBL2.setVisible(false);
            paperLBL2.setVisible(false);
            scissorsLBL2.setVisible(true);
            
            NOTE.setText("PLAYER WINS!!");
            cont1 = cont1 + 1;
        }
        ////////////////////////////////////////////////////////
        else if(label1.getText() == "1" && computer == 0){
            
            rockLBL.setVisible(false);
            paperLBL1.setVisible(true);
            scissorsLBL1.setVisible(false);
        
            rockLBL2.setVisible(true);
            paperLBL2.setVisible(false);
            scissorsLBL2.setVisible(false);
            
            NOTE.setText("PLAYER WINS!!");
            cont1 = cont1 + 1;
        }else if(label1.getText() == "1" && computer == 1){
            
            rockLBL.setVisible(false);
            paperLBL1.setVisible(true);
            scissorsLBL1.setVisible(false);
        
            rockLBL2.setVisible(false);
            paperLBL2.setVisible(true);
            scissorsLBL2.setVisible(false);
            
            NOTE.setText("DRAW!!");
        }else if(label1.getText() == "1" && computer == 2){
            
            rockLBL.setVisible(false);
            paperLBL1.setVisible(true);
            scissorsLBL1.setVisible(false);
        
            rockLBL2.setVisible(false);
            paperLBL2.setVisible(false);
            scissorsLBL2.setVisible(true);
            
            NOTE.setText("COMPUTER WINS!!");
            cont2 = cont2 + 1;
        }
        //////////////////////////////////////////////////////
        else if(label1.getText() == "2" && computer == 0){
            
            rockLBL.setVisible(false);
            paperLBL1.setVisible(false);
            scissorsLBL1.setVisible(true);
        
            rockLBL2.setVisible(true);
            paperLBL2.setVisible(false);
            scissorsLBL2.setVisible(false);
            
            NOTE.setText("COMPUTER WINS!!");
            cont2 = cont2 + 1;
        }else if(label1.getText() == "2" && computer == 1){
            
            rockLBL.setVisible(false);
            paperLBL1.setVisible(false);
            scissorsLBL1.setVisible(true);
        
            rockLBL2.setVisible(false);
            paperLBL2.setVisible(true);
            scissorsLBL2.setVisible(false);
            
            NOTE.setText("PLAYER WIN!!");
            cont1 = cont1 + 1;
        }else if(label1.getText() == "2" && computer == 2){
            
            rockLBL.setVisible(false);
            paperLBL1.setVisible(false);
            scissorsLBL1.setVisible(true);
        
            rockLBL2.setVisible(false);
            paperLBL2.setVisible(false);
            scissorsLBL2.setVisible(true);
            
            NOTE.setText("DRAW!!");
        }
        
        score1.setText(cont1+"");
        score2.setText(cont2+"");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        score1 = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NOTE = new javax.swing.JLabel();
        rock3 = new javax.swing.JButton();
        paper3 = new javax.swing.JButton();
        scissors3 = new javax.swing.JButton();
        rock4 = new javax.swing.JButton();
        paper4 = new javax.swing.JButton();
        scissors4 = new javax.swing.JButton();
        rockLBL = new javax.swing.JLabel();
        paperLBL1 = new javax.swing.JLabel();
        scissorsLBL1 = new javax.swing.JLabel();
        rockLBL2 = new javax.swing.JLabel();
        paperLBL2 = new javax.swing.JLabel();
        scissorsLBL2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/VS.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 480, 250));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 30, 410));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 630, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 630, 10));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 50, 410));

        label1.setText("label1");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        label2.setText("label2");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 90, -1, -1));

        score1.setText("score");
        jPanel1.add(score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        score2.setText("score");
        jPanel1.add(score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        jLabel2.setText("PLAYER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setText("COMPUTER");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, -1, -1));

        NOTE.setText("jLabel4");
        jPanel1.add(NOTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));

        rock3.setBackground(new java.awt.Color(153, 0, 0));
        rock3.setForeground(new java.awt.Color(153, 0, 0));
        rock3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Rock.png"))); // NOI18N
        rock3.setContentAreaFilled(false);
        rock3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rock3ActionPerformed(evt);
            }
        });
        jPanel1.add(rock3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        paper3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Paper.png"))); // NOI18N
        paper3.setContentAreaFilled(false);
        paper3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paper3ActionPerformed(evt);
            }
        });
        jPanel1.add(paper3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        scissors3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Scissors.png"))); // NOI18N
        scissors3.setContentAreaFilled(false);
        jPanel1.add(scissors3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        rock4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Rock.png"))); // NOI18N
        rock4.setContentAreaFilled(false);
        rock4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rock4ActionPerformed(evt);
            }
        });
        jPanel1.add(rock4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, -1));

        paper4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Paper.png"))); // NOI18N
        paper4.setContentAreaFilled(false);
        paper4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paper4ActionPerformed(evt);
            }
        });
        jPanel1.add(paper4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, -1, -1));

        scissors4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Scissors.png"))); // NOI18N
        scissors4.setContentAreaFilled(false);
        jPanel1.add(scissors4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 360, -1, -1));

        rockLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Rock.png"))); // NOI18N
        jPanel1.add(rockLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        paperLBL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Paper.png"))); // NOI18N
        jPanel1.add(paperLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        scissorsLBL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Scissors.png"))); // NOI18N
        jPanel1.add(scissorsLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        rockLBL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Rock.png"))); // NOI18N
        jPanel1.add(rockLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, -1, -1));

        paperLBL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Paper.png"))); // NOI18N
        jPanel1.add(paperLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, -1, -1));

        scissorsLBL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Scissors.png"))); // NOI18N
        jPanel1.add(scissorsLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, -1, -1));

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

    private void rock3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rock3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rock3ActionPerformed

    private void paper3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paper3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paper3ActionPerformed

    private void rock4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rock4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rock4ActionPerformed

    private void paper4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paper4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paper4ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOTE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JButton paper3;
    private javax.swing.JButton paper4;
    private javax.swing.JLabel paperLBL1;
    private javax.swing.JLabel paperLBL2;
    private javax.swing.JButton rock3;
    private javax.swing.JButton rock4;
    private javax.swing.JLabel rockLBL;
    private javax.swing.JLabel rockLBL2;
    private javax.swing.JButton scissors3;
    private javax.swing.JButton scissors4;
    private javax.swing.JLabel scissorsLBL1;
    private javax.swing.JLabel scissorsLBL2;
    private javax.swing.JLabel score1;
    private javax.swing.JLabel score2;
    // End of variables declaration//GEN-END:variables
}