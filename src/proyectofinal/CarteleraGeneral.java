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
public class CarteleraGeneral extends javax.swing.JFrame {

    /**
     * Creates new form CarteleraGeneral
     */
    public CarteleraGeneral() {
        initComponents();
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

        BotonCancelar = new javax.swing.JButton();
        LabelInfo = new javax.swing.JLabel();
        BotonSJ = new javax.swing.JButton();
        BotonCT = new javax.swing.JButton();
        BotonAJ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonInfoSJ = new javax.swing.JButton();
        BotonInfoCT = new javax.swing.JButton();
        BotonInfoAJ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        LabelInfo.setText("Area de mantenimiento para las peliculas de las sedes");

        BotonSJ.setText("San José");
        BotonSJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSJActionPerformed(evt);
            }
        });

        BotonCT.setText("Cartago");
        BotonCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCTActionPerformed(evt);
            }
        });

        BotonAJ.setText("Alajuela");
        BotonAJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAJActionPerformed(evt);
            }
        });

        jLabel1.setText("Elija una sede para ingresar una nueva pelicula");

        BotonInfoSJ.setText("Info");
        BotonInfoSJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInfoSJActionPerformed(evt);
            }
        });

        BotonInfoCT.setText("Info");
        BotonInfoCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInfoCTActionPerformed(evt);
            }
        });

        BotonInfoAJ.setText("Info");
        BotonInfoAJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInfoAJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonSJ)
                    .addComponent(BotonInfoSJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonCT)
                    .addComponent(BotonInfoCT))
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAJ)
                    .addComponent(BotonInfoAJ))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(LabelInfo))
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSJ)
                    .addComponent(BotonCT)
                    .addComponent(BotonAJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInfoSJ)
                    .addComponent(BotonInfoCT)
                    .addComponent(BotonInfoAJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(BotonCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:
        
        AdministradorChanges ventana2 = new AdministradorChanges();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonSJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSJActionPerformed
        // TODO add your handling code here:
        
        Pelicula1 ventana2 = new Pelicula1();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonSJActionPerformed

    private void BotonCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCTActionPerformed
        
        Pelicula2 ventana2 = new Pelicula2();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonCTActionPerformed

    private void BotonAJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAJActionPerformed
        
        Pelicula3 ventana2 = new Pelicula3();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonAJActionPerformed

    private void BotonInfoSJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInfoSJActionPerformed
        
        MostrarUsuarios ventana2 = new MostrarUsuarios();
        ventana2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonInfoSJActionPerformed

    private void BotonInfoCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInfoCTActionPerformed
        
        MostrarUsuarios ventana2 = new MostrarUsuarios();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonInfoCTActionPerformed

    private void BotonInfoAJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInfoAJActionPerformed
        
        MostrarUsuarios ventana2 = new MostrarUsuarios();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonInfoAJActionPerformed

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
            java.util.logging.Logger.getLogger(CarteleraGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarteleraGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarteleraGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarteleraGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarteleraGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAJ;
    private javax.swing.JButton BotonCT;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonInfoAJ;
    private javax.swing.JButton BotonInfoCT;
    private javax.swing.JButton BotonInfoSJ;
    private javax.swing.JButton BotonSJ;
    private javax.swing.JLabel LabelInfo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
