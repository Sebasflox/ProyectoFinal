/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class CompraBoletosCT extends javax.swing.JFrame {

    
    /**
     * Creates new form CompraBoletos
     */
    public CompraBoletosCT() {
        initComponents();
        setLocationRelativeTo(null);
        
        BotonGrupo1.add(Radio2);
        BotonGrupo1.add(Radio1);
        BotonGrupo1.add(Radio3);
        
        BotonGrupo2.add(RadioSala1);
        BotonGrupo2.add(RadioSala2);
        
        BotonGrupo3.add(RadioHora1);
        BotonGrupo3.add(RadioHora2);
        BotonGrupo3.add(RadioHora3);
        
        BotonGrupo4.add(RadioSemanas1);
        BotonGrupo4.add(RadioSemanas2);
        BotonGrupo4.add(RadioSemanas3);
        BotonGrupo4.add(RadioSemanas4);
        
        BotonGrupo5.add(RadioDia1);
        BotonGrupo5.add(RadioDia2);
        BotonGrupo5.add(RadioDia3);
        BotonGrupo5.add(RadioDia4);
        BotonGrupo5.add(RadioDia5);
        BotonGrupo5.add(RadioDia6);
        BotonGrupo5.add(RadioDia7);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonGrupo1 = new javax.swing.ButtonGroup();
        BotonGrupo2 = new javax.swing.ButtonGroup();
        BotonGrupo3 = new javax.swing.ButtonGroup();
        BotonGrupo4 = new javax.swing.ButtonGroup();
        BotonGrupo5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Radio1 = new javax.swing.JRadioButton();
        Radio2 = new javax.swing.JRadioButton();
        Radio3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        RadioSala1 = new javax.swing.JRadioButton();
        RadioSala2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        RadioHora1 = new javax.swing.JRadioButton();
        RadioHora2 = new javax.swing.JRadioButton();
        RadioHora3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        RadioDia1 = new javax.swing.JRadioButton();
        RadioDia2 = new javax.swing.JRadioButton();
        RadioDia3 = new javax.swing.JRadioButton();
        RadioDia5 = new javax.swing.JRadioButton();
        RadioDia4 = new javax.swing.JRadioButton();
        RadioDia6 = new javax.swing.JRadioButton();
        RadioDia7 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        RadioSemanas1 = new javax.swing.JRadioButton();
        RadioSemanas2 = new javax.swing.JRadioButton();
        RadioSemanas3 = new javax.swing.JRadioButton();
        RadioSemanas4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        BotonFinalizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TextCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextBoletosPreferenciales = new javax.swing.JTextField();
        TextVIP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido a la boletería");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Radio1.setText("Toy Story");

        Radio2.setText("Rapidos & Furiosos");

        Radio3.setText("Resident Evil");

        jLabel2.setText("Peliculas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Radio3)
                            .addComponent(Radio1)
                            .addComponent(Radio2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(Radio1)
                .addGap(18, 18, 18)
                .addComponent(Radio2)
                .addGap(18, 18, 18)
                .addComponent(Radio3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RadioSala1.setText("Sala 1");

        RadioSala2.setText("Sala 2");

        jLabel3.setText("Salas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioSala2)
                            .addComponent(RadioSala1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(RadioSala1)
                .addGap(30, 30, 30)
                .addComponent(RadioSala2)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Horas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(RadioHora3)
                    .addComponent(RadioHora2)
                    .addComponent(RadioHora1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(RadioHora1)
                .addGap(18, 18, 18)
                .addComponent(RadioHora2)
                .addGap(18, 18, 18)
                .addComponent(RadioHora3)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RadioDia1.setText("Lunes");

        RadioDia2.setText("Martes");

        RadioDia3.setText("Miercoles");

        RadioDia5.setText("Jueves");

        RadioDia4.setText("Viernes");

        RadioDia6.setText("Sabado");

        RadioDia7.setText("Domingo");

        jLabel5.setText("Dias de la semana");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioDia2)
                    .addComponent(RadioDia1)
                    .addComponent(RadioDia3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioDia5)
                            .addComponent(RadioDia6))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(RadioDia4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RadioDia7)
                        .addGap(56, 56, 56))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioDia1)
                    .addComponent(RadioDia4)
                    .addComponent(RadioDia7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioDia2)
                    .addComponent(RadioDia5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioDia3)
                    .addComponent(RadioDia6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RadioSemanas1.setText("Semana 1");
        RadioSemanas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioSemanas1ActionPerformed(evt);
            }
        });

        RadioSemanas2.setText("Semana 2");

        RadioSemanas3.setText("Semana 3");
        RadioSemanas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioSemanas3ActionPerformed(evt);
            }
        });

        RadioSemanas4.setText("Semana 4");

        jLabel4.setText("Semanas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioSemanas4)
                    .addComponent(RadioSemanas3)
                    .addComponent(RadioSemanas2)
                    .addComponent(RadioSemanas1)
                    .addComponent(jLabel4))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(RadioSemanas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioSemanas2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioSemanas3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioSemanas4)
                .addGap(15, 15, 15))
        );

        BotonFinalizar.setText("Finalizar la compra");
        BotonFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonFinalizarMouseClicked(evt);
            }
        });
        BotonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizarActionPerformed(evt);
            }
        });

        jLabel7.setText("Boletos normales:");

        jLabel8.setText("Boletos preferenciales:");

        jLabel9.setText("Boletos VIP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TextVIP, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(TextBoletosPreferenciales))
                                .addGap(80, 80, 80)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonFinalizar)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextBoletosPreferenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(BotonFinalizar)
                    .addComponent(TextVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Cartelera ventana2 = new Cartelera();
        ventana2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
        String horas1 = "8:00a.m.";
        String horas2 = "10:00a.m.";
        String horas3 = "12:00a.m.";        
        
        
        if(Radio1.isSelected()){
            
            if(RadioSala1.isSelected()){
                
                RadioHora1.setText(horas1);
                RadioHora2.setText(horas2);
                RadioHora3.setText(horas3);
                
            }
        }
        
        String horas4 = "9:00a.m.";
        String horas5 = "10:00a.m.";
        String horas6 = "12:00a.m.";        
                
        
        if(Radio1.isSelected()){
        
            if(RadioSala2.isSelected()){
                
                RadioHora1.setText(horas4);
                RadioHora2.setText(horas5);
                RadioHora3.setText(horas6);
                
            }
        }
        
        String horas7 = "4:00p.m.";
        String horas8 = "6:00p.m.";
        String horas9 = "8:30p.m."; 
        
        if(Radio2.isSelected()){
        
            if(RadioSala1.isSelected()){
            
                RadioHora1.setText(horas7);
                RadioHora2.setText(horas8);
                RadioHora3.setText(horas9);
            
            }
        
        }
        String horas10 = "3:00p.m.";
        String horas11 = "6:00p.m.";
        String horas12 = "10:30p.m."; 
        
        if(Radio2.isSelected()){
        
            if(RadioSala2.isSelected()){
            
                RadioHora1.setText(horas10);
                RadioHora2.setText(horas11);
                RadioHora3.setText(horas12);
            
            }
        
        }
        
        String horas13 = "2:10p.m.";
        String horas14 = "7:30p.m.";
        String horas15 = "9:30p.m."; 
        
        if(Radio3.isSelected()){
        
            if(RadioSala1.isSelected()){
            
                RadioHora1.setText(horas7);
                RadioHora2.setText(horas8);
                RadioHora3.setText(horas9);
            
            }
        
        } 

        String horas16 = "4:00p.m.";
        String horas17 = "5:30p.m.";
        String horas18 = "10:30p.m."; 
        
        if(Radio3.isSelected()){
        
            if(RadioSala2.isSelected()){
            
                RadioHora1.setText(horas16);
                RadioHora2.setText(horas17);
                RadioHora3.setText(horas18);
            
            }
        
        }         
        

        
        /*String horas7 = "2:00p.m.";
        String horas8 = "5:00p.m.";
        String horas9 = "7:00p.m."; 
        
        if(Radio1.isSelected()){
            
            if(RadioSala1.isSelected()){
                
            RadioHora1.setText(horas7);
            RadioHora2.setText(horas8);
            RadioHora3.setText(horas9);
                
            }   
        }
        
        String horas10 = "2:00p.m.";
        String horas11 = "7:00p.m.";
        String horas12 = "8:30p.m."; 
        
        if(Radio1.isSelected()){
            
            if(RadioSala2.isSelected()){
                
            RadioHora1.setText(horas10);
            RadioHora2.setText(horas11);
            RadioHora3.setText(horas12);
                
            }   
        }*/
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RadioSemanas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioSemanas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioSemanas1ActionPerformed

    private void RadioSemanas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioSemanas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioSemanas3ActionPerformed

    private void BotonFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFinalizarMouseClicked
        
        String mensaje = "";
        
        
        if(Radio1.isSelected()){
        
        mensaje = "Pelicula: Toy Story";
        }
        else if (Radio2.isSelected()){
        
        mensaje = "Pelicula: Rapidos & Furiosos";
        }
        else if (Radio3.isSelected()){
        
        mensaje = "Pelicula: Resident Evil";
        }
        
        String mensaje2 = "";
        
        if(RadioSemanas1.isSelected()){
        
        mensaje2="Semana 1";    
        }
        else if(RadioSemanas2.isSelected()){
        
        mensaje2="Semana 2";    
        }
        else if(RadioSemanas3.isSelected()){
        
        mensaje2="Semana 3";    
        }
        else if(RadioSemanas4.isSelected()){
        
        mensaje2="Semana 4";    
        }
        
        String mensaje3 = "";
        
        if(RadioDia1.isSelected()){
        
        mensaje3="Dia 1";   
        }
        else if(RadioDia2.isSelected()){
        
        mensaje3="Dia 2";   
        }
        else if(RadioDia3.isSelected()){
        
        mensaje3="Dia 3";   
        }
        else if(RadioDia4.isSelected()){
        
        mensaje3="Dia 4";   
        }
        else if(RadioDia5.isSelected()){
        
        mensaje3="Dia 5";   
        }
        else if(RadioDia6.isSelected()){
        
        mensaje3="Dia 6";   
        }
        else if(RadioDia7.isSelected()){
        
        mensaje3="Dia 7";   
        }
        
        String mensaje4 = "";
        
        if(RadioSala1.isSelected()){
        
        mensaje4 = "Sala 1";    
        }
        else if(RadioSala2.isSelected()){
        
        mensaje4 = "Sala 2";    
        }
        
        String mensaje5 = "";
        
        if(RadioHora1.isSelected()){
        
        mensaje5 = RadioHora1.getText();
        }
        else if (RadioHora2.isSelected()){
        
        mensaje5 = RadioHora2.getText();
        }
        else if (RadioHora3.isSelected()){
        
        mensaje5 = RadioHora3.getText();
        }
        
        JOptionPane.showMessageDialog(this, mensaje + "\n" +  mensaje2 + "\n" + mensaje3 + "\n" + mensaje4 + "\n" + "Hora: " + mensaje5 + "\n" + "Campos normales: " + TextCantidad.getText() + "\n" + "Campos preferenciales: " + TextBoletosPreferenciales.getText() + "\n" + "Campos VIP: " + TextVIP.getText());
    }//GEN-LAST:event_BotonFinalizarMouseClicked

    private void BotonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(CompraBoletosCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraBoletosCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraBoletosCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraBoletosCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraBoletosCT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFinalizar;
    private javax.swing.ButtonGroup BotonGrupo1;
    private javax.swing.ButtonGroup BotonGrupo2;
    private javax.swing.ButtonGroup BotonGrupo3;
    private javax.swing.ButtonGroup BotonGrupo4;
    private javax.swing.ButtonGroup BotonGrupo5;
    private javax.swing.JRadioButton Radio1;
    private javax.swing.JRadioButton Radio2;
    private javax.swing.JRadioButton Radio3;
    private javax.swing.JRadioButton RadioDia1;
    private javax.swing.JRadioButton RadioDia2;
    private javax.swing.JRadioButton RadioDia3;
    private javax.swing.JRadioButton RadioDia4;
    private javax.swing.JRadioButton RadioDia5;
    private javax.swing.JRadioButton RadioDia6;
    private javax.swing.JRadioButton RadioDia7;
    private javax.swing.JRadioButton RadioHora1;
    private javax.swing.JRadioButton RadioHora2;
    private javax.swing.JRadioButton RadioHora3;
    private javax.swing.JRadioButton RadioSala1;
    private javax.swing.JRadioButton RadioSala2;
    private javax.swing.JRadioButton RadioSemanas1;
    private javax.swing.JRadioButton RadioSemanas2;
    private javax.swing.JRadioButton RadioSemanas3;
    private javax.swing.JRadioButton RadioSemanas4;
    private javax.swing.JTextField TextBoletosPreferenciales;
    private javax.swing.JTextField TextCantidad;
    private javax.swing.JTextField TextVIP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
