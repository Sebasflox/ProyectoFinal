/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Clases.Usuario;
import java.io.*;

/**
 *
 * @author Sebas
 */
public class Registrarse extends javax.swing.JFrame {

    /**
     * Creates new form Registrarse
     */
    public Registrarse() {
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

        Botonregistrarse = new javax.swing.JButton();
        Labelname = new javax.swing.JLabel();
        LabelApellido1 = new javax.swing.JLabel();
        Labelapellido2 = new javax.swing.JLabel();
        LabelID = new javax.swing.JLabel();
        Labeluser = new javax.swing.JLabel();
        Labelpass = new javax.swing.JLabel();
        Textapellido1 = new javax.swing.JTextField();
        Textapellido2 = new javax.swing.JTextField();
        TextID = new javax.swing.JTextField();
        Textdia = new javax.swing.JTextField();
        Textmes = new javax.swing.JTextField();
        Textaño = new javax.swing.JTextField();
        Botoncancelar = new javax.swing.JButton();
        Textname = new javax.swing.JTextField();
        Textuser = new javax.swing.JTextField();
        Textpass = new javax.swing.JTextField();
        Labeldia = new javax.swing.JLabel();
        Labelmes = new javax.swing.JLabel();
        Labelaño = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botonregistrarse.setText("Registrarse");
        Botonregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonregistrarseActionPerformed(evt);
            }
        });

        Labelname.setText("Nombre:");

        LabelApellido1.setText("Primer apellido:");

        Labelapellido2.setText("Segundo apellido:");

        LabelID.setText("Cedula:");

        Labeluser.setText("Usuario:");

        Labelpass.setText("Contraseña:");

        Botoncancelar.setText("Cancelar");
        Botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoncancelarActionPerformed(evt);
            }
        });

        Labeldia.setText("Día:");

        Labelmes.setText("Mes:");

        Labelaño.setText("Año:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Botoncancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(Botonregistrarse)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelID)
                    .addComponent(Labelapellido2)
                    .addComponent(LabelApellido1)
                    .addComponent(Labelname)
                    .addComponent(Labelpass)
                    .addComponent(Labeluser)
                    .addComponent(Labeldia)
                    .addComponent(Labelmes)
                    .addComponent(Labelaño))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Textpass)
                    .addComponent(Textapellido1)
                    .addComponent(Textapellido2)
                    .addComponent(TextID)
                    .addComponent(Textdia)
                    .addComponent(Textmes)
                    .addComponent(Textaño)
                    .addComponent(Textname, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(Textuser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Textname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Labelname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelApellido1)
                            .addComponent(Textapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Textapellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Labelapellido2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelID))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Textdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labeldia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Textmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelmes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Textaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelaño, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Textuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labeluser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botonregistrarse)
                    .addComponent(Botoncancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonregistrarseActionPerformed
        // TODO add your handling code here:
        
        
        //String nombre;
        
        
        
        try{
        
            Usuario dato = new Usuario();
            
            String nombrearchivo = "Registro_usuarios.txt";
            
            
            dato.setnombre(Textname.getText());
            dato.setapellido1(Textapellido1.getText());
            dato.setapellido2(Textapellido2.getText());
            dato.setcedula(TextID.getText());
            dato.setdia(Textdia.getText());
            dato.setmes(Textmes.getText());
            dato.setaño(Textaño.getText());
            dato.setuser(Textuser.getText());
            dato.setcontraseña(Textpass.getText());
            
            
            
            String contenido = dato.getnombre() + " " + dato.getapellido1() + " " + dato.getapellido2() + " " + dato.getcedula() + " " + dato.getdia() + " " + dato.getmes() + " " + dato.getaño() + " " + dato.getuser() + " " + dato.getcontraseña() + "\n"; 
            
            
            //Textname.getText() + " " + Textapellido1.getText() + " " + Textapellido2.getText() + " " + TextID.getText() + " " + Textnacmiento.getText() + " " + Textuser.getText() + " " + Textpass.getText();
            
            File file = new File(nombrearchivo);
            
            if(!file.exists()){
                
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        }
        catch(Exception e){
            
        e.printStackTrace();
        
        }
        
        ProyectoFinal ventana2 = new ProyectoFinal();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonregistrarseActionPerformed

    private void BotoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoncancelarActionPerformed
        // TODO add your handling code here:
        
        ProyectoFinal ventana2 = new ProyectoFinal();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotoncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botoncancelar;
    private javax.swing.JButton Botonregistrarse;
    private javax.swing.JLabel LabelApellido1;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel Labelapellido2;
    private javax.swing.JLabel Labelaño;
    private javax.swing.JLabel Labeldia;
    private javax.swing.JLabel Labelmes;
    private javax.swing.JLabel Labelname;
    private javax.swing.JLabel Labelpass;
    private javax.swing.JLabel Labeluser;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField Textapellido1;
    private javax.swing.JTextField Textapellido2;
    private javax.swing.JTextField Textaño;
    private javax.swing.JTextField Textdia;
    private javax.swing.JTextField Textmes;
    private javax.swing.JTextField Textname;
    private javax.swing.JTextField Textpass;
    private javax.swing.JTextField Textuser;
    // End of variables declaration//GEN-END:variables
}
