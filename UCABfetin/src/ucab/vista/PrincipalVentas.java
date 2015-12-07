package ucab.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import Controlador.controlVistaVentas;

/**
 * @author Juan
 */
public class PrincipalVentas extends javax.swing.JFrame {

    controlVistaVentas control;
    int cont=0;
    
    public PrincipalVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        ocultarPaneles();
        iniciarImagenes();
       
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProductos = new javax.swing.JPanel();
        panelPostresI = new javax.swing.JPanel();
        labelPostresD = new javax.swing.JLabel();
        panelPostresB = new javax.swing.JPanel();
        botonMerengada = new javax.swing.JButton();
        botonHelados = new javax.swing.JButton();
        botonBrownie = new javax.swing.JButton();
        botonCheesecake = new javax.swing.JButton();
        panelBebidaI = new javax.swing.JPanel();
        labelBebidasD = new javax.swing.JLabel();
        panelBebidaB = new javax.swing.JPanel();
        botonRefrescos = new javax.swing.JButton();
        botonNaturales = new javax.swing.JButton();
        botonCafe = new javax.swing.JButton();
        botonAgua = new javax.swing.JButton();
        botonYogurt = new javax.swing.JButton();
        botonJugos = new javax.swing.JButton();
        panelDesayunoI = new javax.swing.JPanel();
        labelDesayunoD = new javax.swing.JLabel();
        panelDesayunoB = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        panelAlmuerzoI = new javax.swing.JPanel();
        labelAlmuerzoD = new javax.swing.JLabel();
        panelAlmuerzoB = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        panelCombosI = new javax.swing.JPanel();
        labelCombosD = new javax.swing.JLabel();
        panelCombosB = new javax.swing.JPanel();
        panelChucheriaI = new javax.swing.JPanel();
        labelChucheriasD = new javax.swing.JLabel();
        panelChucheriaB = new javax.swing.JPanel();
        panelFactura = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelProductosMouseEntered(evt);
            }
        });
        panelProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPostresI.setBackground(new java.awt.Color(51, 51, 255));
        panelPostresI.setToolTipText("");
        panelPostresI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPostresIMouseEntered(evt);
            }
        });
        panelPostresI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPostresD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/postres4.jpg"))); // NOI18N
        labelPostresD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPostresDMouseEntered(evt);
            }
        });
        panelPostresI.add(labelPostresD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 170));

        panelProductos.add(panelPostresI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 170));

        panelPostresB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonMerengada.setBackground(new java.awt.Color(204, 255, 204));
        botonMerengada.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonMerengada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/merengada.png"))); // NOI18N
        botonMerengada.setText("Merengada");
        botonMerengada.setContentAreaFilled(false);
        botonMerengada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMerengada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMerengada.setIconTextGap(-4);
        botonMerengada.setMargin(new java.awt.Insets(2, 0, 2, 0));
        botonMerengada.setOpaque(true);
        botonMerengada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonMerengada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMerengadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMerengadaMouseExited(evt);
            }
        });
        panelPostresB.add(botonMerengada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 85, 90, 85));

        botonHelados.setBackground(new java.awt.Color(204, 255, 204));
        botonHelados.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonHelados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/helado2.png"))); // NOI18N
        botonHelados.setText("Helados");
        botonHelados.setContentAreaFilled(false);
        botonHelados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonHelados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHelados.setIconTextGap(-5);
        botonHelados.setOpaque(true);
        botonHelados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonHelados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonHeladosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonHeladosMouseExited(evt);
            }
        });
        panelPostresB.add(botonHelados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 85));

        botonBrownie.setBackground(new java.awt.Color(204, 255, 204));
        botonBrownie.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonBrownie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/brownie2.png"))); // NOI18N
        botonBrownie.setText("Brownie");
        botonBrownie.setContentAreaFilled(false);
        botonBrownie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBrownie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBrownie.setIconTextGap(0);
        botonBrownie.setOpaque(true);
        botonBrownie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonBrownie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBrownieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBrownieMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBrownieMousePressed(evt);
            }
        });
        panelPostresB.add(botonBrownie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 90, 85));

        botonCheesecake.setBackground(new java.awt.Color(204, 255, 204));
        botonCheesecake.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCheesecake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/cheesecake2.png"))); // NOI18N
        botonCheesecake.setText("Cheesecake");
        botonCheesecake.setContentAreaFilled(false);
        botonCheesecake.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCheesecake.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCheesecake.setIconTextGap(0);
        botonCheesecake.setMargin(new java.awt.Insets(0, 0, 2, 0));
        botonCheesecake.setOpaque(true);
        botonCheesecake.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCheesecake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCheesecakeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCheesecakeMouseExited(evt);
            }
        });
        panelPostresB.add(botonCheesecake, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 85));

        panelProductos.add(panelPostresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 170));

        panelBebidaI.setBackground(new java.awt.Color(255, 255, 51));
        panelBebidaI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBebidaIMouseEntered(evt);
            }
        });
        panelBebidaI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBebidasD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/prueba4.jpg"))); // NOI18N
        labelBebidasD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBebidasDMouseEntered(evt);
            }
        });
        panelBebidaI.add(labelBebidasD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 170));

        panelProductos.add(panelBebidaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 310, 170));

        panelBebidaB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRefrescos.setBackground(new java.awt.Color(153, 153, 255));
        botonRefrescos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonRefrescos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/refrescos2.png"))); // NOI18N
        botonRefrescos.setText("Refrescos");
        botonRefrescos.setContentAreaFilled(false);
        botonRefrescos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRefrescos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRefrescos.setIconTextGap(-8);
        botonRefrescos.setOpaque(true);
        botonRefrescos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRefrescos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRefrescosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRefrescosMouseExited(evt);
            }
        });
        botonRefrescos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRefrescosActionPerformed(evt);
            }
        });
        panelBebidaB.add(botonRefrescos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 104, 85));

        botonNaturales.setBackground(new java.awt.Color(153, 153, 255));
        botonNaturales.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonNaturales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/Naturales2.png"))); // NOI18N
        botonNaturales.setText("Naturales");
        botonNaturales.setContentAreaFilled(false);
        botonNaturales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNaturales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNaturales.setIconTextGap(-8);
        botonNaturales.setOpaque(true);
        botonNaturales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonNaturales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonNaturalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonNaturalesMouseExited(evt);
            }
        });
        panelBebidaB.add(botonNaturales, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 0, 103, 85));

        botonCafe.setBackground(new java.awt.Color(153, 153, 255));
        botonCafe.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/Cafe2.png"))); // NOI18N
        botonCafe.setText("Café");
        botonCafe.setContentAreaFilled(false);
        botonCafe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCafe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCafe.setIconTextGap(0);
        botonCafe.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonCafe.setOpaque(true);
        botonCafe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCafeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCafeMouseExited(evt);
            }
        });
        panelBebidaB.add(botonCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 104, 85));

        botonAgua.setBackground(new java.awt.Color(153, 153, 255));
        botonAgua.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/agua2.png"))); // NOI18N
        botonAgua.setText("Agua");
        botonAgua.setContentAreaFilled(false);
        botonAgua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgua.setIconTextGap(-4);
        botonAgua.setOpaque(true);
        botonAgua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAgua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAguaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAguaMouseExited(evt);
            }
        });
        panelBebidaB.add(botonAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 85, 103, 85));

        botonYogurt.setBackground(new java.awt.Color(153, 153, 255));
        botonYogurt.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonYogurt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/yogurt2.png"))); // NOI18N
        botonYogurt.setText("Yogurt");
        botonYogurt.setContentAreaFilled(false);
        botonYogurt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonYogurt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonYogurt.setIconTextGap(-10);
        botonYogurt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonYogurt.setOpaque(true);
        botonYogurt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonYogurt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonYogurtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonYogurtMouseExited(evt);
            }
        });
        panelBebidaB.add(botonYogurt, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 85, 104, 85));

        botonJugos.setBackground(new java.awt.Color(153, 153, 255));
        botonJugos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonJugos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/jugos2.png"))); // NOI18N
        botonJugos.setText("Jugos");
        botonJugos.setContentAreaFilled(false);
        botonJugos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonJugos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonJugos.setIconTextGap(-8);
        botonJugos.setOpaque(true);
        botonJugos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonJugos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonJugosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonJugosMouseExited(evt);
            }
        });
        panelBebidaB.add(botonJugos, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 0, 104, 85));

        panelProductos.add(panelBebidaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 310, 170));

        panelDesayunoI.setBackground(new java.awt.Color(255, 153, 153));
        panelDesayunoI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDesayunoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/desayuno4.jpg"))); // NOI18N
        labelDesayunoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDesayunoDMouseEntered(evt);
            }
        });
        panelDesayunoI.add(labelDesayunoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 170));

        panelProductos.add(panelDesayunoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 245, 170));

        panelDesayunoB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("jButton2");
        panelDesayunoB.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 85, 123, 85));

        jButton7.setText("jButton2");
        panelDesayunoB.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 122, 85));

        jButton10.setText("jButton2");
        panelDesayunoB.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 122, 85));

        jButton11.setText("jButton2");
        panelDesayunoB.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 123, 85));

        panelProductos.add(panelDesayunoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 245, 170));

        panelAlmuerzoI.setBackground(new java.awt.Color(0, 153, 51));
        panelAlmuerzoI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAlmuerzoIMouseEntered(evt);
            }
        });
        panelAlmuerzoI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAlmuerzoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucab/imagenes/almuerzo4.jpg"))); // NOI18N
        labelAlmuerzoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAlmuerzoDMouseEntered(evt);
            }
        });
        panelAlmuerzoI.add(labelAlmuerzoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 170));

        panelProductos.add(panelAlmuerzoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 210, 245, 170));

        panelAlmuerzoB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("jButton9");
        panelAlmuerzoB.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 122, 85));

        jButton2.setText("jButton2");
        panelAlmuerzoB.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 122, 85));

        jButton8.setText("jButton2");
        panelAlmuerzoB.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 85, 123, 85));

        jButton12.setText("jButton2");
        panelAlmuerzoB.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 123, 85));

        panelProductos.add(panelAlmuerzoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 210, 245, 170));

        panelCombosI.setBackground(new java.awt.Color(0, 204, 204));
        panelCombosI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCombosD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCombosDMouseEntered(evt);
            }
        });
        panelCombosI.add(labelCombosD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 170));

        panelProductos.add(panelCombosI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 330, 170));
        panelProductos.add(panelCombosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 330, 170));

        panelChucheriaI.setBackground(new java.awt.Color(51, 0, 204));
        panelChucheriaI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelChucheriasD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelChucheriasDMouseEntered(evt);
            }
        });
        panelChucheriaI.add(labelChucheriasD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 170));

        panelProductos.add(panelChucheriaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 160, 170));
        panelProductos.add(panelChucheriaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 160, 170));

        getContentPane().add(panelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        panelFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelFacturaMouseEntered(evt);
            }
        });
        panelFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setTableHeader(null);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelFactura.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, 268));

        jButton5.setText("jButton5");
        panelFactura.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        getContentPane().add(panelFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBebidaIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBebidaIMouseEntered
        panelBebidaB.setVisible(true); panelBebidaI.setVisible(false); 
        panelPostresB.setVisible(false); panelPostresI.setVisible(true);
    }//GEN-LAST:event_panelBebidaIMouseEntered

    private void panelPostresIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPostresIMouseEntered
        
    }//GEN-LAST:event_panelPostresIMouseEntered

    private void panelAlmuerzoIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAlmuerzoIMouseEntered
        panelBebidaI.setVisible(true); panelBebidaB.setVisible(false); 
    }//GEN-LAST:event_panelAlmuerzoIMouseEntered

    private void panelProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelProductosMouseEntered
       ocultarPaneles();
    }//GEN-LAST:event_panelProductosMouseEntered

    private void panelFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFacturaMouseEntered
        ocultarPaneles();
    }//GEN-LAST:event_panelFacturaMouseEntered

    private void botonRefrescosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRefrescosMouseEntered
       ImageIcon icon = new ImageIcon("src/ucab/imagenes/refrescos.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonRefrescos.setIcon(icono);
    }//GEN-LAST:event_botonRefrescosMouseEntered

    private void botonRefrescosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRefrescosMouseExited
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/refrescos2.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonRefrescos.setIcon(icono);
    }//GEN-LAST:event_botonRefrescosMouseExited

    private void botonJugosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJugosMouseEntered
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/jugos.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonJugos.setIcon(icono);
    }//GEN-LAST:event_botonJugosMouseEntered

    private void botonJugosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJugosMouseExited
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/jugos2.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonJugos.setIcon(icono);
    }//GEN-LAST:event_botonJugosMouseExited

    private void botonNaturalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNaturalesMouseEntered
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/Naturales.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonNaturales.setIcon(icono);
    }//GEN-LAST:event_botonNaturalesMouseEntered

    private void botonNaturalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNaturalesMouseExited
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/Naturales2.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonNaturales.setIcon(icono);
    }//GEN-LAST:event_botonNaturalesMouseExited

    private void botonCafeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCafeMouseEntered
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/Cafe.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonCafe.setIcon(icono);
    }//GEN-LAST:event_botonCafeMouseEntered

    private void botonCafeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCafeMouseExited
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/Cafe2.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonCafe.setIcon(icono);
    }//GEN-LAST:event_botonCafeMouseExited

    private void botonYogurtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonYogurtMouseEntered
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/Yogurt.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonYogurt.setIcon(icono);
    }//GEN-LAST:event_botonYogurtMouseEntered

    private void botonYogurtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonYogurtMouseExited
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/Yogurt2.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonYogurt.setIcon(icono);
    }//GEN-LAST:event_botonYogurtMouseExited

    private void botonAguaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAguaMouseEntered
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/agua.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonAgua.setIcon(icono);
    }//GEN-LAST:event_botonAguaMouseEntered

    private void botonAguaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAguaMouseExited
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/agua2.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonAgua.setIcon(icono);
    }//GEN-LAST:event_botonAguaMouseExited

    private void botonRefrescosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRefrescosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRefrescosActionPerformed

    private void botonHeladosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHeladosMouseEntered
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/helado.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonHelados.setIcon(icono);
    }//GEN-LAST:event_botonHeladosMouseEntered

    private void botonHeladosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHeladosMouseExited
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/helado2.png");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    botonHelados.setIcon(icono);
    }//GEN-LAST:event_botonHeladosMouseExited

    private void labelPostresDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPostresDMouseEntered
        panelPostresB.setVisible(true);    panelPostresI.setVisible(false);
        panelBebidaI.setVisible(true);     panelBebidaB.setVisible(false); 
        panelDesayunoI.setVisible(true);   panelDesayunoB.setVisible(false);
    }//GEN-LAST:event_labelPostresDMouseEntered

    private void labelBebidasDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBebidasDMouseEntered
        panelDesayunoI.setVisible(true);   panelDesayunoB.setVisible(false);
        panelPostresI.setVisible(true);    panelPostresB.setVisible(false);
        panelAlmuerzoI.setVisible(true);   panelAlmuerzoB.setVisible(false);
        panelBebidaB.setVisible(true);     panelBebidaI.setVisible(false);
    }//GEN-LAST:event_labelBebidasDMouseEntered

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        ocultarPaneles();
    }//GEN-LAST:event_jTable1MouseEntered

    private void labelDesayunoDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDesayunoDMouseEntered
         panelPostresI.setVisible(true);    panelPostresB.setVisible(false);
         panelBebidaI.setVisible(true);     panelBebidaB.setVisible(false);
         panelAlmuerzoI.setVisible(true);   panelAlmuerzoB.setVisible(false);
         panelCombosI.setVisible(true);     panelCombosB.setVisible(false);
         panelDesayunoB.setVisible(true);   panelDesayunoI.setVisible(false);
    }//GEN-LAST:event_labelDesayunoDMouseEntered

    private void labelAlmuerzoDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAlmuerzoDMouseEntered
        panelBebidaI.setVisible(true);     panelBebidaB.setVisible(false);
        panelDesayunoI.setVisible(true);   panelDesayunoB.setVisible(false);
        panelCombosI.setVisible(true);     panelCombosB.setVisible(false);
        panelChucheriaI.setVisible(true);  panelChucheriaB.setVisible(false);
        panelAlmuerzoB.setVisible(true);   panelAlmuerzoI.setVisible(false);
    }//GEN-LAST:event_labelAlmuerzoDMouseEntered

    private void labelCombosDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCombosDMouseEntered
        panelDesayunoI.setVisible(true);   panelDesayunoB.setVisible(false);
        panelAlmuerzoI.setVisible(true);   panelAlmuerzoB.setVisible(false);
        panelChucheriaI.setVisible(true);  panelChucheriaB.setVisible(false);
        panelCombosB.setVisible(true);     panelChucheriaI.setVisible(false);
    }//GEN-LAST:event_labelCombosDMouseEntered

    private void labelChucheriasDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChucheriasDMouseEntered
        panelAlmuerzoI.setVisible(true);   panelAlmuerzoB.setVisible(false);
        panelCombosI.setVisible(true);     panelCombosB.setVisible(false);
        panelChucheriaB.setVisible(true);  panelChucheriaI.setVisible(false);
    }//GEN-LAST:event_labelChucheriasDMouseEntered

    private void botonCheesecakeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheesecakeMouseEntered
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/cheesecake.png");
        Icon icono = new ImageIcon(icon.getImage());
        botonCheesecake.setIcon(icono);
    }//GEN-LAST:event_botonCheesecakeMouseEntered

    private void botonCheesecakeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheesecakeMouseExited
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/cheesecake2.png");
        Icon icono = new ImageIcon(icon.getImage());
        botonCheesecake.setIcon(icono);
    }//GEN-LAST:event_botonCheesecakeMouseExited

    private void botonBrownieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBrownieMouseEntered
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/brownie.png");
        Icon icono = new ImageIcon(icon.getImage());
        botonBrownie.setIcon(icono);
    }//GEN-LAST:event_botonBrownieMouseEntered

    private void botonBrownieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBrownieMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBrownieMousePressed

    private void botonBrownieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBrownieMouseExited
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/brownie2.png");
        Icon icono = new ImageIcon(icon.getImage());
        botonBrownie.setIcon(icono);
    }//GEN-LAST:event_botonBrownieMouseExited

    private void botonMerengadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMerengadaMouseEntered
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/merengada.png");
        Icon icono = new ImageIcon(icon.getImage());
        botonMerengada.setIcon(icono);
    }//GEN-LAST:event_botonMerengadaMouseEntered

    private void botonMerengadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMerengadaMouseExited
        ImageIcon icon = new ImageIcon("src/ucab/imagenes/merengada2.png");
        Icon icono = new ImageIcon(icon.getImage());
        botonMerengada.setIcon(icono);
    }//GEN-LAST:event_botonMerengadaMouseExited

    private void ocultarPaneles(){
         panelBebidaI.setVisible(true);    panelBebidaB.setVisible(false); 
        panelPostresI.setVisible(true);   panelPostresB.setVisible(false);
        panelAlmuerzoI.setVisible(true);  panelAlmuerzoB.setVisible(false);
        panelChucheriaI.setVisible(true); panelChucheriaB.setVisible(false);
        panelCombosI.setVisible(true);    panelCombosB.setVisible(false);
        panelDesayunoI.setVisible(true);  panelDesayunoB.setVisible(false);
    }
    
    private void iniciarImagenes(){
        timerImagenes.start();
    }
    
     Timer timerImagenes = new Timer (1500, new ActionListener () 
    { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (cont==0){
                    ImageIcon icon = new ImageIcon("src/ucab/imagenes/prueba1.jpg");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    labelBebidasD.setIcon(icono); cont++;
                    ImageIcon icon1 = new ImageIcon("src/ucab/imagenes/desayuno1.jpg");
                    Icon icono1 = new ImageIcon(icon1.getImage()); 
                    labelDesayunoD.setIcon(icono1);
                    ImageIcon icon2 = new ImageIcon("src/ucab/imagenes/almuerzo1.jpg");
                    Icon icono2 = new ImageIcon(icon2.getImage()); 
                    labelAlmuerzoD.setIcon(icono2);
                    ImageIcon icon3 = new ImageIcon("src/ucab/imagenes/postres1.jpg");
                    Icon icono3 = new ImageIcon(icon3.getImage()); 
                    labelPostresD.setIcon(icono3); 
            }
            else{
                if (cont==1){
                    ImageIcon icon = new ImageIcon("src/ucab/imagenes/prueba2.jpg");
                    Icon icono = new ImageIcon(icon.getImage());
                    labelBebidasD.setIcon(icono); cont++;
                    ImageIcon icon1 = new ImageIcon("src/ucab/imagenes/desayuno2.jpg");
                    Icon icono1 = new ImageIcon(icon1.getImage()); 
                    labelDesayunoD.setIcon(icono1);
                    ImageIcon icon2 = new ImageIcon("src/ucab/imagenes/almuerzo2.jpg");
                    Icon icono2 = new ImageIcon(icon2.getImage()); 
                    labelAlmuerzoD.setIcon(icono2);
                    ImageIcon icon3 = new ImageIcon("src/ucab/imagenes/postres2.jpg");
                    Icon icono3 = new ImageIcon(icon3.getImage());
                    labelPostresD.setIcon(icono3);}
                else{
                    if (cont==2){
                        ImageIcon icon = new ImageIcon("src/ucab/imagenes/prueba3.jpg");
                        Icon icono = new ImageIcon(icon.getImage());
                        labelBebidasD.setIcon(icono); cont++;
                        ImageIcon icon1 = new ImageIcon("src/ucab/imagenes/desayuno3.jpg");
                        Icon icono1 = new ImageIcon(icon1.getImage()); 
                        labelDesayunoD.setIcon(icono1);
                        ImageIcon icon2 = new ImageIcon("src/ucab/imagenes/almuerzo3.jpg");
                        Icon icono2 = new ImageIcon(icon2.getImage()); 
                        labelAlmuerzoD.setIcon(icono2);
                        ImageIcon icon3 = new ImageIcon("src/ucab/imagenes/postres3.jpg");
                        Icon icono3 = new ImageIcon(icon3.getImage());
                        labelPostresD.setIcon(icono3);}
                    else{
                        if (cont==3){
                            ImageIcon icon = new ImageIcon("src/ucab/imagenes/prueba4.jpg");
                            Icon icono = new ImageIcon(icon.getImage());
                            labelBebidasD.setIcon(icono); cont=0;
                            ImageIcon icon1 = new ImageIcon("src/ucab/imagenes/desayuno4.jpg");
                            Icon icono1 = new ImageIcon(icon1.getImage()); 
                            labelDesayunoD.setIcon(icono1);
                            ImageIcon icon2 = new ImageIcon("src/ucab/imagenes/almuerzo4.jpg");
                            Icon icono2 = new ImageIcon(icon2.getImage()); 
                            labelAlmuerzoD.setIcon(icono2);
                            ImageIcon icon3 = new ImageIcon("src/ucab/imagenes/postres4.jpg");
                            Icon icono3 = new ImageIcon(icon3.getImage());
                            labelPostresD.setIcon(icono3);}
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
            java.util.logging.Logger.getLogger(PrincipalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgua;
    private javax.swing.JButton botonBrownie;
    private javax.swing.JButton botonCafe;
    private javax.swing.JButton botonCheesecake;
    private javax.swing.JButton botonHelados;
    private javax.swing.JButton botonJugos;
    private javax.swing.JButton botonMerengada;
    private javax.swing.JButton botonNaturales;
    private javax.swing.JButton botonRefrescos;
    private javax.swing.JButton botonYogurt;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAlmuerzoD;
    private javax.swing.JLabel labelBebidasD;
    private javax.swing.JLabel labelChucheriasD;
    private javax.swing.JLabel labelCombosD;
    private javax.swing.JLabel labelDesayunoD;
    private javax.swing.JLabel labelPostresD;
    private javax.swing.JPanel panelAlmuerzoB;
    private javax.swing.JPanel panelAlmuerzoI;
    private javax.swing.JPanel panelBebidaB;
    private javax.swing.JPanel panelBebidaI;
    private javax.swing.JPanel panelChucheriaB;
    private javax.swing.JPanel panelChucheriaI;
    private javax.swing.JPanel panelCombosB;
    private javax.swing.JPanel panelCombosI;
    private javax.swing.JPanel panelDesayunoB;
    private javax.swing.JPanel panelDesayunoI;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JPanel panelPostresB;
    private javax.swing.JPanel panelPostresI;
    private javax.swing.JPanel panelProductos;
    // End of variables declaration//GEN-END:variables
}
