/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucab.vista;

import java.awt.Color;

/**
 *
 * @author Ismael
 */
public class Inventario extends javax.swing.JFrame {

    public Inventario() {
        initComponents();
        DesactivarProd.setVisible(false);
        RegistrarProd.setVisible(true);
        ModificarProd.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModificarProd = new javax.swing.JPanel();
        btnAceptarMod = new javax.swing.JButton();
        btnRegresarMod = new javax.swing.JButton();
        jComboBoxProductos = new javax.swing.JComboBox<String>();
        labelModificarProd = new javax.swing.JLabel();
        labelNombreProd = new javax.swing.JLabel();
        textNombreProd = new javax.swing.JTextField();
        labelTipoProd = new javax.swing.JLabel();
        textTipoProd = new javax.swing.JTextField();
        labelCodigoBar = new javax.swing.JLabel();
        textCodigoBar = new javax.swing.JTextField();
        textCantidad = new javax.swing.JTextField();
        labelCantidad = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        labelValor = new javax.swing.JLabel();
        textFecha = new javax.swing.JTextField();
        labelFecha = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        RegistrarProd = new javax.swing.JPanel();
        btnAceptarReg = new javax.swing.JButton();
        btnRegresarReg = new javax.swing.JButton();
        labelRegistroProd = new javax.swing.JLabel();
        labelNombreProd1 = new javax.swing.JLabel();
        textNombreProd1 = new javax.swing.JTextField();
        labelTipoProd1 = new javax.swing.JLabel();
        textTipoProd1 = new javax.swing.JTextField();
        labelCodigoBar1 = new javax.swing.JLabel();
        textCodigoBar1 = new javax.swing.JTextField();
        textCantidad1 = new javax.swing.JTextField();
        labelCantidad1 = new javax.swing.JLabel();
        textValor1 = new javax.swing.JTextField();
        labelValor1 = new javax.swing.JLabel();
        textFecha1 = new javax.swing.JTextField();
        labelFecha1 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        DesactivarProd = new javax.swing.JPanel();
        btnRegresarDes = new javax.swing.JButton();
        btnAceptarDes = new javax.swing.JButton();
        labelBuscar1 = new javax.swing.JLabel();
        textNombreProd4 = new javax.swing.JTextField();
        labelBuscar = new javax.swing.JLabel();
        textNombreProd3 = new javax.swing.JTextField();
        labelDesactivarProd = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ModificarProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarMod.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnAceptarMod.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/botonOk2.png"))); // NOI18N
        btnAceptarMod.setText("Aceptar");
        btnAceptarMod.setBorderPainted(false);
        btnAceptarMod.setContentAreaFilled(false);
        ModificarProd.add(btnAceptarMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, -1));

        btnRegresarMod.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnRegresarMod.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/botonRegresar2.png"))); // NOI18N
        btnRegresarMod.setText("Regresar");
        btnRegresarMod.setBorderPainted(false);
        btnRegresarMod.setContentAreaFilled(false);
        btnRegresarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarModActionPerformed(evt);
            }
        });
        ModificarProd.add(btnRegresarMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jComboBoxProductos.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        jComboBoxProductos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductosActionPerformed(evt);
            }
        });
        ModificarProd.add(jComboBoxProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 30));

        labelModificarProd.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelModificarProd.setForeground(new java.awt.Color(255, 255, 255));
        labelModificarProd.setText("Modificar productos");
        ModificarProd.add(labelModificarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 50));

        labelNombreProd.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelNombreProd.setForeground(new java.awt.Color(255, 255, 255));
        labelNombreProd.setText("Nombre del producto:");
        ModificarProd.add(labelNombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, 30));

        textNombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreProdActionPerformed(evt);
            }
        });
        textNombreProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNombreProdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreProdKeyTyped(evt);
            }
        });
        ModificarProd.add(textNombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 260, 30));

        labelTipoProd.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelTipoProd.setForeground(new java.awt.Color(255, 255, 255));
        labelTipoProd.setText("Tipo del producto:");
        ModificarProd.add(labelTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 270, 30));

        textTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipoProdActionPerformed(evt);
            }
        });
        textTipoProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textTipoProdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTipoProdKeyTyped(evt);
            }
        });
        ModificarProd.add(textTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 30));

        labelCodigoBar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelCodigoBar.setForeground(new java.awt.Color(255, 255, 255));
        labelCodigoBar.setText("Código de barras:");
        ModificarProd.add(labelCodigoBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 270, 30));
        ModificarProd.add(textCodigoBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 260, 30));

        textCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCantidadActionPerformed(evt);
            }
        });
        textCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadKeyTyped(evt);
            }
        });
        ModificarProd.add(textCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 170, 30));

        labelCantidad.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidad.setText("Cantidad:");
        ModificarProd.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 270, 30));

        textValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textValorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textValorKeyTyped(evt);
            }
        });
        ModificarProd.add(textValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 170, 30));

        labelValor.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelValor.setForeground(new java.awt.Color(255, 255, 255));
        labelValor.setText("Valor del producto:");
        ModificarProd.add(labelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 270, 30));

        textFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFechaActionPerformed(evt);
            }
        });
        textFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFechaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFechaKeyTyped(evt);
            }
        });
        ModificarProd.add(textFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 170, 30));

        labelFecha.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("Fecha de caducidad:");
        ModificarProd.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 270, 30));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/FondoIngresar.jpg"))); // NOI18N
        Fondo.setText("xx");
        ModificarProd.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        getContentPane().add(ModificarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        RegistrarProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarReg.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnAceptarReg.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/botonOk2.png"))); // NOI18N
        btnAceptarReg.setText("Aceptar");
        btnAceptarReg.setBorderPainted(false);
        btnAceptarReg.setContentAreaFilled(false);
        RegistrarProd.add(btnAceptarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, -1));

        btnRegresarReg.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnRegresarReg.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/botonRegresar2.png"))); // NOI18N
        btnRegresarReg.setText("Regresar");
        btnRegresarReg.setBorderPainted(false);
        btnRegresarReg.setContentAreaFilled(false);
        btnRegresarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarRegActionPerformed(evt);
            }
        });
        RegistrarProd.add(btnRegresarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        labelRegistroProd.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelRegistroProd.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistroProd.setText("Registro de productos");
        RegistrarProd.add(labelRegistroProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 50));

        labelNombreProd1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelNombreProd1.setForeground(new java.awt.Color(255, 255, 255));
        labelNombreProd1.setText("Nombre del producto:");
        RegistrarProd.add(labelNombreProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 270, 30));

        textNombreProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreProd1ActionPerformed(evt);
            }
        });
        textNombreProd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreProd1KeyTyped(evt);
            }
        });
        RegistrarProd.add(textNombreProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 30));

        labelTipoProd1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelTipoProd1.setForeground(new java.awt.Color(255, 255, 255));
        labelTipoProd1.setText("Tipo del producto:");
        RegistrarProd.add(labelTipoProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 270, 30));

        textTipoProd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTipoProd1KeyTyped(evt);
            }
        });
        RegistrarProd.add(textTipoProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 30));

        labelCodigoBar1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelCodigoBar1.setForeground(new java.awt.Color(255, 255, 255));
        labelCodigoBar1.setText("Código de barras:");
        RegistrarProd.add(labelCodigoBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 270, 30));
        RegistrarProd.add(textCodigoBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 260, 30));

        textCantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidad1KeyTyped(evt);
            }
        });
        RegistrarProd.add(textCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 170, 30));

        labelCantidad1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidad1.setText("Cantidad:");
        RegistrarProd.add(labelCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 270, 30));

        textValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textValor1KeyTyped(evt);
            }
        });
        RegistrarProd.add(textValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 170, 30));

        labelValor1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelValor1.setForeground(new java.awt.Color(255, 255, 255));
        labelValor1.setText("Valor del producto:");
        RegistrarProd.add(labelValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 270, 30));

        textFecha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFecha1KeyTyped(evt);
            }
        });
        RegistrarProd.add(textFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 170, 30));

        labelFecha1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelFecha1.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha1.setText("Fecha de caducidad:");
        RegistrarProd.add(labelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 270, 30));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/FondoIngresar.jpg"))); // NOI18N
        RegistrarProd.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        getContentPane().add(RegistrarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        DesactivarProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresarDes.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnRegresarDes.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/botonRegresar2.png"))); // NOI18N
        btnRegresarDes.setText("Regresar");
        btnRegresarDes.setBorderPainted(false);
        btnRegresarDes.setContentAreaFilled(false);
        btnRegresarDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarDesActionPerformed(evt);
            }
        });
        DesactivarProd.add(btnRegresarDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        btnAceptarDes.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnAceptarDes.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/botonOk2.png"))); // NOI18N
        btnAceptarDes.setText("Aceptar");
        btnAceptarDes.setBorderPainted(false);
        btnAceptarDes.setContentAreaFilled(false);
        DesactivarProd.add(btnAceptarDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, -1));

        labelBuscar1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscar1.setText("Razón de la desactivación:");
        DesactivarProd.add(labelBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 30));

        textNombreProd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreProd4ActionPerformed(evt);
            }
        });
        DesactivarProd.add(textNombreProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 260, 140));

        labelBuscar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelBuscar.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscar.setText("Buscar:");
        DesactivarProd.add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, 30));

        textNombreProd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreProd3ActionPerformed(evt);
            }
        });
        DesactivarProd.add(textNombreProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 260, 30));

        labelDesactivarProd.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelDesactivarProd.setForeground(new java.awt.Color(255, 255, 255));
        labelDesactivarProd.setText("Desactivación de productos");
        DesactivarProd.add(labelDesactivarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 50));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/FondoIngresar.jpg"))); // NOI18N
        DesactivarProd.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        getContentPane().add(DesactivarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreProdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textNombreProdActionPerformed

    private void textNombreProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreProd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreProd1ActionPerformed

    private void textNombreProd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreProd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreProd3ActionPerformed

    private void textNombreProd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreProd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreProd4ActionPerformed

    private void jComboBoxProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProductosActionPerformed

    private void textNombreProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreProdKeyTyped
        // TODO add your handling code here:if (evt.getKeyChar()>='0' || evt.getKeyChar()<='9')
        if ((evt.getKeyChar()>='0') && (evt.getKeyChar()<='9'))
            evt.consume();
    }//GEN-LAST:event_textNombreProdKeyTyped

    private void textNombreProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreProdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreProdKeyPressed

    private void textTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipoProdActionPerformed

    private void textTipoProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTipoProdKeyPressed
        // TODO add your handling code here:
         if ((evt.getKeyChar()>='0') && (evt.getKeyChar()<='9'))
            evt.consume();
    }//GEN-LAST:event_textTipoProdKeyPressed

    private void textFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFechaActionPerformed

    private void textFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFechaKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textFechaKeyPressed

    private void textFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFechaKeyTyped
        // TODO add your handling code here:
        if((evt.getKeyChar()>='a' && evt.getKeyChar()<='z') || (evt.getKeyChar()>='A' && evt.getKeyChar()<='Z'))
            evt.consume();
    }//GEN-LAST:event_textFechaKeyTyped

    private void textValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textValorKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyChar()>='a' && evt.getKeyChar()<='z') || (evt.getKeyChar()>='A' && evt.getKeyChar()<='Z'))
            evt.consume();
    }//GEN-LAST:event_textValorKeyPressed

    private void textCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCantidadActionPerformed

    private void textCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyChar()>='a' && evt.getKeyChar()<='z') || (evt.getKeyChar()>='A' && evt.getKeyChar()<='Z'))
            evt.consume();
    }//GEN-LAST:event_textCantidadKeyPressed

    private void textTipoProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTipoProdKeyTyped
        // TODO add your handling code here:
        if ((evt.getKeyChar()>='0') && (evt.getKeyChar()<='9'))
            evt.consume();
    }//GEN-LAST:event_textTipoProdKeyTyped

    private void textValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textValorKeyTyped
        // TODO add your handling code here:
        if((evt.getKeyChar()>='a' && evt.getKeyChar()<='z') || (evt.getKeyChar()>='A' && evt.getKeyChar()<='Z'))
            evt.consume();
    }//GEN-LAST:event_textValorKeyTyped

    private void textCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadKeyTyped
        // TODO add your handling code here:
        if((evt.getKeyChar()>='a' && evt.getKeyChar()<='z') || (evt.getKeyChar()>='A' && evt.getKeyChar()<='Z'))
            evt.consume();
    }//GEN-LAST:event_textCantidadKeyTyped

    private void textNombreProd1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreProd1KeyTyped
        // TODO add your handling code here:
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
            evt.consume();
    }//GEN-LAST:event_textNombreProd1KeyTyped

    private void textTipoProd1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTipoProd1KeyTyped
        // TODO add your handling code here:
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
            evt.consume();
    }//GEN-LAST:event_textTipoProd1KeyTyped

    private void textFecha1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFecha1KeyTyped
        // TODO add your handling code here:
        if((evt.getKeyChar()>='a' && evt.getKeyChar()<='z') || (evt.getKeyChar()>'A' && evt.getKeyChar()<='Z'))
            evt.consume();
    }//GEN-LAST:event_textFecha1KeyTyped

    private void textValor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textValor1KeyTyped
        // TODO add your handling code here:
        if((evt.getKeyChar()>='a' && evt.getKeyChar()<='z') || (evt.getKeyChar()>'A' && evt.getKeyChar()<='Z'))
            evt.consume();
    }//GEN-LAST:event_textValor1KeyTyped

    private void textCantidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidad1KeyTyped
        // TODO add your handling code here:
        if((evt.getKeyChar()>='a' && evt.getKeyChar()<='z') || (evt.getKeyChar()>'A' && evt.getKeyChar()<='Z'))
            evt.consume();
    }//GEN-LAST:event_textCantidad1KeyTyped

    private void btnRegresarDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarDesActionPerformed

    private void btnRegresarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarRegActionPerformed

    private void btnRegresarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarModActionPerformed

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DesactivarProd;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JPanel ModificarProd;
    private javax.swing.JPanel RegistrarProd;
    private javax.swing.JButton btnAceptarDes;
    private javax.swing.JButton btnAceptarMod;
    private javax.swing.JButton btnAceptarReg;
    private javax.swing.JButton btnRegresarDes;
    private javax.swing.JButton btnRegresarMod;
    private javax.swing.JButton btnRegresarReg;
    private javax.swing.JComboBox<String> jComboBoxProductos;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelBuscar1;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCantidad1;
    private javax.swing.JLabel labelCodigoBar;
    private javax.swing.JLabel labelCodigoBar1;
    private javax.swing.JLabel labelDesactivarProd;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFecha1;
    private javax.swing.JLabel labelModificarProd;
    private javax.swing.JLabel labelNombreProd;
    private javax.swing.JLabel labelNombreProd1;
    private javax.swing.JLabel labelRegistroProd;
    private javax.swing.JLabel labelTipoProd;
    private javax.swing.JLabel labelTipoProd1;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel labelValor1;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textCantidad1;
    private javax.swing.JTextField textCodigoBar;
    private javax.swing.JTextField textCodigoBar1;
    private javax.swing.JTextField textFecha;
    private javax.swing.JTextField textFecha1;
    private javax.swing.JTextField textNombreProd;
    private javax.swing.JTextField textNombreProd1;
    private javax.swing.JTextField textNombreProd3;
    private javax.swing.JTextField textNombreProd4;
    private javax.swing.JTextField textTipoProd;
    private javax.swing.JTextField textTipoProd1;
    private javax.swing.JTextField textValor;
    private javax.swing.JTextField textValor1;
    // End of variables declaration//GEN-END:variables
}
