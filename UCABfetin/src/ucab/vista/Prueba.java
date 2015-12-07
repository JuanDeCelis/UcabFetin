package ucab.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;


/**
 * @author Juan
 */
public class Prueba extends javax.swing.JFrame {
    
    int cont=0;
    
    public Prueba() {
        initComponents();
        panel2.setVisible(false);
        timer.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bebidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JUGOS");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);
        panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 100, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AGUA");
        jLabel3.setToolTipText("");
        jLabel3.setOpaque(true);
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VINO");
        jLabel4.setToolTipText("");
        jLabel4.setOpaque(true);
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REFRESCO");
        jLabel5.setOpaque(true);
        panel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/bebida1.jpg"))); // NOI18N
        jButton1.setEnabled(false);
        panel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 75));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/bebida2.jpg"))); // NOI18N
        panel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 75));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/bebida3.jpg"))); // NOI18N
        panel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, 75));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/bebida4.jpg"))); // NOI18N
        panel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 100, 75));

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 150));

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Trajan Pro", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BEBIDAS");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 30));

        bebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bebidasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bebidasMouseExited(evt);
            }
        });
        bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidasActionPerformed(evt);
            }
        });
        panel1.add(bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 150));

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidasActionPerformed
        
    }//GEN-LAST:event_bebidasActionPerformed

    private void bebidasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bebidasMouseEntered
        timer.stop(); 
        panel1.setVisible(false);
        panel2.setVisible(true);
        timer.stop();
    }//GEN-LAST:event_bebidasMouseEntered

    private void bebidasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bebidasMouseExited
         
    }//GEN-LAST:event_bebidasMouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        panel1.setVisible(true);
        panel2.setVisible(false);
        timer.start();
    }//GEN-LAST:event_jPanel1MouseEntered

    Timer timer = new Timer (1000, new ActionListener () 
    { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (cont==0){
                    ImageIcon icon = new ImageIcon("src/ucab/imagenes/prueba1.jpg");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    bebidas.setIcon(icono); cont++;}
            else{
                if (cont==1){
                    ImageIcon icon = new ImageIcon("src/ucab/imagenes/prueba2.jpg");
                    Icon icono = new ImageIcon(icon.getImage());
                    bebidas.setIcon(icono); cont++;}
                else{
                    if (cont==2){
                        ImageIcon icon = new ImageIcon("src/ucab/imagenes/prueba3.jpg");
                        Icon icono = new ImageIcon(icon.getImage());
                        bebidas.setIcon(icono); cont++;}
                    else{
                        if (cont==3){
                            ImageIcon icon = new ImageIcon("src/ucab/imagenes/prueba4.jpg");
                            Icon icono = new ImageIcon(icon.getImage());
                            bebidas.setIcon(icono); cont=0;}
                    }
                }
            }
    } 
    });
    
    
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
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bebidas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
