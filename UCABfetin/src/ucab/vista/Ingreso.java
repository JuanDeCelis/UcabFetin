package ucab.vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Controlador.VistaUsuario;
/**
 * @author Juan
 */
public class Ingreso extends javax.swing.JFrame {
    
    VistaUsuario control;
    String contra;

    public Ingreso() {
        initComponents();
        this.setLocationRelativeTo(null); 
        panelRecuContra.setVisible(false);
        panelContraseña.setVisible(false);
        textUsuario.setCaretColor(Color.black);
        textContraseña.setCaretColor(Color.black);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        panelRecuContra = new javax.swing.JPanel();
        labelRecupera = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        textUsuarioRecu = new javax.swing.JTextField();
        labelPregunta = new javax.swing.JLabel();
        textPregunta = new javax.swing.JTextField();
        labelRespuesta = new javax.swing.JLabel();
        textRespuesta = new javax.swing.JTextField();
        labelMuñeco = new javax.swing.JLabel();
        botonSig = new javax.swing.JButton();
        botonReg = new javax.swing.JButton();
        labelMensErrRec = new javax.swing.JLabel();
        labelFondoRecu = new javax.swing.JLabel();
        panelIngresar = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        labelBienvenido = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        labelOlvidoCon = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        textContraseña = new javax.swing.JTextField();
        labelMensError = new javax.swing.JLabel();
        labelFondoIngr = new javax.swing.JLabel();
        panelContraseña = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelNuevCon = new javax.swing.JLabel();
        labelConfCon = new javax.swing.JLabel();
        textNuevCon = new javax.swing.JTextField();
        textConfCon = new javax.swing.JTextField();
        botonAcep = new javax.swing.JButton();
        labelFondoContra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRecuContra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRecupera.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelRecupera.setForeground(new java.awt.Color(255, 255, 255));
        labelRecupera.setText("Recuperación de contraseña");
        panelRecuContra.add(labelRecupera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 50));

        labelUsuario.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Introduzca su nombre de usuario:");
        panelRecuContra.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 340, 30));

        textUsuarioRecu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textUsuarioRecuKeyTyped(evt);
            }
        });
        panelRecuContra.add(textUsuarioRecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 30));

        labelPregunta.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelPregunta.setForeground(new java.awt.Color(255, 255, 255));
        labelPregunta.setText("Introduzca su pregunta secreta:");
        panelRecuContra.add(labelPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 340, 30));
        panelRecuContra.add(textPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 30));

        labelRespuesta.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        labelRespuesta.setText("Introduzca su respuesta secreta:");
        panelRecuContra.add(labelRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 340, 30));
        panelRecuContra.add(textRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 260, 30));

        labelMuñeco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/munecoInterrogacion.png"))); // NOI18N
        panelRecuContra.add(labelMuñeco, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 60, 100));

        botonSig.setFont(new java.awt.Font("Gabriola", 3, 20)); // NOI18N
        botonSig.setForeground(new java.awt.Color(255, 255, 255));
        botonSig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/botonOk.png"))); // NOI18N
        botonSig.setText("Siguiente");
        botonSig.setBorder(null);
        botonSig.setContentAreaFilled(false);
        botonSig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSigMouseExited(evt);
            }
        });
        botonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSigActionPerformed(evt);
            }
        });
        panelRecuContra.add(botonSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 140, 40));

        botonReg.setFont(new java.awt.Font("Gabriola", 3, 20)); // NOI18N
        botonReg.setForeground(new java.awt.Color(255, 255, 255));
        botonReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/botonRegresar.png"))); // NOI18N
        botonReg.setText("Regresar");
        botonReg.setBorder(null);
        botonReg.setContentAreaFilled(false);
        botonReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegMouseExited(evt);
            }
        });
        botonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegActionPerformed(evt);
            }
        });
        panelRecuContra.add(botonReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 40));

        labelMensErrRec.setFont(new java.awt.Font("Century", 3, 14)); // NOI18N
        labelMensErrRec.setForeground(new java.awt.Color(255, 0, 0));
        labelMensErrRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMensErrRec.setText("Los datos no coinciden");
        panelRecuContra.add(labelMensErrRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 260, 20));

        labelFondoRecu.setBackground(new java.awt.Color(102, 51, 0));
        labelFondoRecu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/FondoIngresar.jpg"))); // NOI18N
        labelFondoRecu.setOpaque(true);
        panelRecuContra.add(labelFondoRecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        getContentPane().add(panelRecuContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        panelIngresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/LogoFinal3.png"))); // NOI18N
        panelIngresar.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 130));

        labelBienvenido.setFont(new java.awt.Font("Vivaldi", 3, 60)); // NOI18N
        labelBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        labelBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBienvenido.setText("Bienvenido");
        panelIngresar.add(labelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 90));

        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        panelIngresar.add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 100, 30));

        botonSalir.setText("Salir");
        botonSalir.setInheritsPopupMenu(true);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelIngresar.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 100, 30));

        labelOlvidoCon.setBackground(new java.awt.Color(255, 255, 255));
        labelOlvidoCon.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        labelOlvidoCon.setForeground(new java.awt.Color(255, 255, 255));
        labelOlvidoCon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOlvidoCon.setText("Olvidó la contraseña");
        labelOlvidoCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelOlvidoCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOlvidoConMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOlvidoConMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOlvidoConMouseExited(evt);
            }
        });
        panelIngresar.add(labelOlvidoCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 200, 20));

        textUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textUsuario.setForeground(new java.awt.Color(204, 204, 204));
        textUsuario.setText("Usuario");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textUsuario, org.jdesktop.beansbinding.ELProperty.create("0"), textUsuario, org.jdesktop.beansbinding.BeanProperty.create("caretPosition"));
        bindingGroup.addBinding(binding);

        textUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                textUsuarioMouseDragged(evt);
            }
        });
        textUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textUsuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textUsuarioMousePressed(evt);
            }
        });
        textUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textUsuarioKeyTyped(evt);
            }
        });
        panelIngresar.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 200, 30));

        textContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textContraseña.setForeground(new java.awt.Color(204, 204, 204));
        textContraseña.setText("Contraseña");
        textContraseña.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                textContraseñaMouseDragged(evt);
            }
        });
        textContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textContraseñaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textContraseñaMousePressed(evt);
            }
        });
        textContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textContraseñaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textContraseñaKeyTyped(evt);
            }
        });
        panelIngresar.add(textContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 200, 30));

        labelMensError.setFont(new java.awt.Font("Century", 3, 14)); // NOI18N
        labelMensError.setForeground(new java.awt.Color(255, 0, 0));
        labelMensError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelIngresar.add(labelMensError, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 184, 260, 20));

        labelFondoIngr.setBackground(new java.awt.Color(102, 51, 0));
        labelFondoIngr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/FondoIngresar.jpg"))); // NOI18N
        labelFondoIngr.setOpaque(true);
        panelIngresar.add(labelFondoIngr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        getContentPane().add(panelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelContraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Recuperación de contraseña");
        panelContraseña.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 50));

        labelNuevCon.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelNuevCon.setForeground(new java.awt.Color(255, 255, 255));
        labelNuevCon.setText("Ingrese su nueva contraseña:");
        panelContraseña.add(labelNuevCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 260, 70));

        labelConfCon.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelConfCon.setForeground(new java.awt.Color(255, 255, 255));
        labelConfCon.setText("Confirme su nueva contraseña:");
        panelContraseña.add(labelConfCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 260, 70));
        panelContraseña.add(textNuevCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 330, 30));
        panelContraseña.add(textConfCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 330, 30));

        botonAcep.setFont(new java.awt.Font("Gabriola", 3, 20)); // NOI18N
        botonAcep.setForeground(new java.awt.Color(255, 255, 255));
        botonAcep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/botonOk.png"))); // NOI18N
        botonAcep.setText("Aceptar");
        botonAcep.setContentAreaFilled(false);
        botonAcep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAcepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAcepMouseExited(evt);
            }
        });
        botonAcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcepActionPerformed(evt);
            }
        });
        panelContraseña.add(botonAcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 140, 40));

        labelFondoContra.setBackground(new java.awt.Color(102, 51, 0));
        labelFondoContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/FondoIngresar.jpg"))); // NOI18N
        labelFondoContra.setOpaque(true);
        panelContraseña.add(labelFondoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        getContentPane().add(panelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        PrincipalVentas obj = new PrincipalVentas();
        obj.setVisible(true);
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAcepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcepMouseEntered
        botonAcep.setContentAreaFilled(true);botonAcep.setForeground(Color.black);
    }//GEN-LAST:event_botonAcepMouseEntered

    private void botonAcepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcepMouseExited
         botonAcep.setContentAreaFilled(false); botonAcep.setForeground(Color.white);
    }//GEN-LAST:event_botonAcepMouseExited

    private void botonSigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSigMouseEntered
         botonSig.setContentAreaFilled(true); botonSig.setForeground(Color.black);
    }//GEN-LAST:event_botonSigMouseEntered

    private void botonSigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSigMouseExited
        botonSig.setContentAreaFilled(false);  botonSig.setForeground(Color.white);
    }//GEN-LAST:event_botonSigMouseExited

    private void botonRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegMouseEntered
        botonReg.setContentAreaFilled(true);  botonReg.setForeground(Color.black);
    }//GEN-LAST:event_botonRegMouseEntered

    private void botonRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegMouseExited
        botonReg.setContentAreaFilled(false); botonReg.setForeground(Color.white);
    }//GEN-LAST:event_botonRegMouseExited

    private void labelOlvidoConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidoConMouseClicked
        panelIngresar.setVisible(false); panelRecuContra.setVisible(true); labelMensError.setText("");
    }//GEN-LAST:event_labelOlvidoConMouseClicked

    private void botonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSigActionPerformed
        panelContraseña.setVisible(true); panelRecuContra.setVisible(false);
    }//GEN-LAST:event_botonSigActionPerformed

    private void botonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegActionPerformed
        panelIngresar.setVisible(true);  panelRecuContra.setVisible(false);
    }//GEN-LAST:event_botonRegActionPerformed

    private void botonAcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcepActionPerformed
        panelIngresar.setVisible(true);  panelContraseña.setVisible(false);
    }//GEN-LAST:event_botonAcepActionPerformed

    private void labelOlvidoConMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidoConMouseEntered
        labelOlvidoCon.setForeground(Color.blue);
    }//GEN-LAST:event_labelOlvidoConMouseEntered

    private void labelOlvidoConMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOlvidoConMouseExited
        labelOlvidoCon.setForeground(Color.white);
    }//GEN-LAST:event_labelOlvidoConMouseExited

    private void textUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textUsuarioMouseClicked
         if (textUsuario.getText().equals("Usuario")){ textUsuario.setCaretPosition(0);}
    }//GEN-LAST:event_textUsuarioMouseClicked

    private void textUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textUsuarioMousePressed
        if (textUsuario.getText().equals("Usuario")){textUsuario.setCaretPosition(0);}
    }//GEN-LAST:event_textUsuarioMousePressed

    private void textUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsuarioKeyPressed
         if (validarCaracteres(evt.getKeyChar())){ evt.consume();
        }else{
            validarBorrado(textUsuario, "Usuario", evt.getKeyChar(), 2);
            if (validarTextoFondo(textUsuario,"Usuario",evt.getKeyChar(),false)){ evt.consume();}
            if (evt.getKeyChar()==10){ textUsuario.requestFocus();  evt.consume();}
        }
    }//GEN-LAST:event_textUsuarioKeyPressed

    private void textUsuarioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textUsuarioMouseDragged
        //MouseDragged es pa cuando deslizas el mouse haciendo click... 
        //Coloco el caret en la posición cero para que no pueda selecionar el texto, cuando esta escrito usuario de fondo...
        if (textUsuario.getText().equals("Usuario")){ textUsuario.setCaretPosition(0);}
    }//GEN-LAST:event_textUsuarioMouseDragged

    private void textUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsuarioKeyTyped
         if (validarCaracteres(evt.getKeyChar())){ evt.consume();}
    }//GEN-LAST:event_textUsuarioKeyTyped

    private void textContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContraseñaKeyPressed
         if (validarTextoFondo(textContraseña, "Contraseña", evt.getKeyChar(),false)){ evt.consume();}
        if (evt.getKeyChar() == 10 ){  evt.consume();}//ingresa al sistema si es un enter
    }//GEN-LAST:event_textContraseñaKeyPressed

    private void textContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContraseñaKeyReleased
        validarBorrado(textContraseña, "Contraseña", evt.getKeyChar(), 1);
    }//GEN-LAST:event_textContraseñaKeyReleased

    private void textContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContraseñaKeyTyped
        char letra=evt.getKeyChar();

        if (validarTextoFondo(textContraseña, "Contraseña", evt.getKeyChar(),true)){
            evt.consume();
        }else{
            if(letra!=8 && letra!=127 && letra<260 && letra!=10){
                textContraseña.setText(textContraseña.getText()+"*");
                contra=contra+String.valueOf(letra);
                evt.consume();
            }else{
                if(letra==8 || letra==127){
                    if ((letra==127) && (textContraseña.getCaretPosition()==contra.length())){
                        evt.consume();}else{
                        contra=contra.substring(0,(textContraseña.getCaretPosition()))+contra.substring(textContraseña.getCaretPosition()+1,(contra.length()));   }
                }
            }
        }
        validarBorrado(textContraseña, "Contraseña", evt.getKeyChar(), 1);
    }//GEN-LAST:event_textContraseñaKeyTyped

    private void textContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textContraseñaMouseClicked
        if (textContraseña.getText().equals("Contraseña")){textContraseña.setCaretPosition(0);}
    }//GEN-LAST:event_textContraseñaMouseClicked

    private void textContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textContraseñaMousePressed
        if (textContraseña.getText().equals("Contraseña")){textContraseña.setCaretPosition(0);}
    }//GEN-LAST:event_textContraseñaMousePressed

    private void textContraseñaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textContraseñaMouseDragged
        if (textContraseña.getText().equals("Contraseña")){textContraseña.setCaretPosition(0);}
    }//GEN-LAST:event_textContraseñaMouseDragged

    private void textUsuarioRecuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsuarioRecuKeyTyped
        if (validarCaracteres(evt.getKeyChar())){evt.consume();}
    }//GEN-LAST:event_textUsuarioRecuKeyTyped

    
    //metodo que valida que no se introduzcan caracteres especiales
    public boolean validarCaracteres(char letra){
        if((letra>00 && letra<8)||(letra>8 && letra<10)||(letra>10 && letra<48) || (letra>57 && letra<65) || (letra > 90 && letra < 97)||(letra>122 && letra<127)||(letra>127 && letra<255)){
            return true;
        }else{return false;}
    }
    //metodo que valida que hay que volver a poner el texto de fondo(usuario o contraseña) del jtextfield
    public void validarBorrado(JTextField campo,String palabra,char letra,int num){
        if ((letra == 8)|| (letra==127)){
            if(campo.getText().length()<num){
                campo.setText(palabra);
                campo.setCaretPosition(0);
                campo.setForeground(Color.LIGHT_GRAY);
            }
        }
    }
    //metodo que validasi hay que quitar el texto del fondo(Usuario o Contraseña) del jtextfield
    public boolean validarTextoFondo(JTextField campo,String palabra,char letra,boolean hacer){            
        if (campo.getText().equals(palabra)){            
            if ((letra>260)||letra==8 || letra==127||letra==10){
                return true;
            }else{
                campo.setText("");
                campo.setForeground(Color.black);
                if(hacer){ contra=String.valueOf(letra);  return true;}
            }        }return false;
    }  
    
    
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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcep;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonReg;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSig;
    private javax.swing.JLabel labelBienvenido;
    private javax.swing.JLabel labelConfCon;
    private javax.swing.JLabel labelFondoContra;
    private javax.swing.JLabel labelFondoIngr;
    private javax.swing.JLabel labelFondoRecu;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMensErrRec;
    private javax.swing.JLabel labelMensError;
    private javax.swing.JLabel labelMuñeco;
    private javax.swing.JLabel labelNuevCon;
    private javax.swing.JLabel labelOlvidoCon;
    private javax.swing.JLabel labelPregunta;
    private javax.swing.JLabel labelRecupera;
    private javax.swing.JLabel labelRespuesta;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelContraseña;
    private javax.swing.JPanel panelIngresar;
    private javax.swing.JPanel panelRecuContra;
    private javax.swing.JTextField textConfCon;
    private javax.swing.JTextField textContraseña;
    private javax.swing.JTextField textNuevCon;
    private javax.swing.JTextField textPregunta;
    private javax.swing.JTextField textRespuesta;
    private javax.swing.JTextField textUsuario;
    private javax.swing.JTextField textUsuarioRecu;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
