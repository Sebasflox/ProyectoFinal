/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Sebas
 */
public class Cartelera2 extends javax.swing.JFrame {

    /**
     * Creates new form Cartelera2
     */
    public Cartelera2() {
        initComponents();
        setLocationRelativeTo(null);
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonCerrar = new javax.swing.JButton();
        BotonComprar2 = new javax.swing.JButton();
        BotonComprar3 = new javax.swing.JButton();
        BotonComprar1 = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonCerrar.setText("Cerrar sesion");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        BotonComprar2.setText("Comprar");
        BotonComprar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprar2ActionPerformed(evt);
            }
        });

        BotonComprar3.setText("Comprar");
        BotonComprar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprar3ActionPerformed(evt);
            }
        });

        BotonComprar1.setText("Comprar");
        BotonComprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprar1ActionPerformed(evt);
            }
        });

        BotonAtras.setText("Atrás");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rapidos y furiosos.jpg"))); // NOI18N
        jLabel1.setToolTipText("Rapido & Furiosos 9, Justin Lin, Accion, Vin Diesel");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Resident Evil.jpg"))); // NOI18N
        jLabel2.setToolTipText("Resident Evil: Retribution, Paul W.S. Anderson, Accion, Milla Jovovich");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ToyStory.jpg"))); // NOI18N
        jLabel3.setToolTipText("Toy Story, John Lasseter, Infantil, Tom Hanks");

        jLabel4.setText("Cartago");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3)
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(BotonComprar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonComprar2)
                        .addGap(168, 168, 168)
                        .addComponent(BotonComprar3)
                        .addGap(88, 88, 88)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonComprar1)
                    .addComponent(BotonComprar2)
                    .addComponent(BotonComprar3))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCerrar)
                    .addComponent(BotonAtras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        // TODO add your handling code here:
        
        Inicio_sesion ventana2 = new Inicio_sesion();
        ventana2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        // TODO add your handling code here:
        
        SeleccionCartelera ventana2 = new SeleccionCartelera();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void BotonComprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprar1ActionPerformed
        
        CompraBoletosCT ventana2 = new CompraBoletosCT();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonComprar1ActionPerformed

    private void BotonComprar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprar2ActionPerformed
        
        CompraBoletosCT ventana2 = new CompraBoletosCT();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonComprar2ActionPerformed

    private void BotonComprar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprar3ActionPerformed
        
        CompraBoletosCT ventana2 = new CompraBoletosCT();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonComprar3ActionPerformed

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
            java.util.logging.Logger.getLogger(Cartelera2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartelera2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartelera2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartelera2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartelera2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonComprar1;
    private javax.swing.JButton BotonComprar2;
    private javax.swing.JButton BotonComprar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
