package com.mycompany.proyectouno;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

 



public class principalVent extends javax.swing.JFrame {

     private Empleado empleadoActual;
     public String ruta;
     public String rutaU;
     public String rutaU1;
     public String rutaU2;
     public String rutaCAR;
     Empleado emp = new Empleado();
     
     
public void ocultarPaneles(){
    panelInicioSesion.setVisible(false);
    panelMenuAdministrador.setVisible(false);
    panelRegistroEmpleados.setVisible(false);
    panelmodificarUsuariosEmpleados.setVisible(false);
    panelTablaUsuario.setVisible(false);
    PanelRegistroUsuariod.setVisible(false);
    CarroMenu.setVisible(false);
    TablaVehiculo.setVisible(false);
}

    
    public  principalVent() {
        initComponents();
        model=(DefaultTableModel)this.jTable1.getModel();
        modelo=(DefaultTableModel)this.jTable2.getModel();
        modela=(DefaultTableModel)this.jTable3.getModel();

        cargarEmpleadosEnTabla();
        cargarUsuarioEnTabla();
        cargarVehiculosEntabla();
        ocultarPaneles();
        
        panelInicioSesion.setVisible(true );
    
    
    

    }
DefaultTableModel model;
DefaultTableModel modelo;
DefaultTableModel modela;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        panelInicioSesion = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelContrasena = new javax.swing.JPasswordField();
        PanelUsuario = new javax.swing.JScrollPane();
        Cedula = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        BotonIniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TablaVehiculo = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        PanelRegistroUsuariod = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        direccionU = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        telefonoU = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        cedulaU = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        ciudadU = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        correoU = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        nombreU = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        paisU = new javax.swing.JTextPane();
        JLabel = new javax.swing.JLabel();
        FotoCar1 = new javax.swing.JLabel();
        Fotorostro = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        JLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        crearUsuario = new javax.swing.JButton();
        cedulaPDF = new javax.swing.JButton();
        carnetPDF = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        panelTablaUsuario = new javax.swing.JPanel();
        btnGuardarCambios1 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JButton();
        panelRegistroEmpleados = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        PanelNombre3 = new javax.swing.JScrollPane();
        nombreE3 = new javax.swing.JTextPane();
        panelCedula3 = new javax.swing.JScrollPane();
        cedulaE3 = new javax.swing.JTextPane();
        panelContrasena4 = new javax.swing.JScrollPane();
        contrasena3 = new javax.swing.JTextPane();
        botonCrearUsuario3 = new javax.swing.JButton();
        panelCorreo = new javax.swing.JScrollPane();
        correoE = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Combo = new javax.swing.JComboBox<>();
        Subirfoto = new javax.swing.JButton();
        FotoCar = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        panelmodificarUsuariosEmpleados = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CarroMenu = new javax.swing.JPanel();
        sistema = new javax.swing.JComboBox<>();
        Back1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        color = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        placa = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        modelocarro = new javax.swing.JTextPane();
        fotoCAR = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        marcavehiculo = new javax.swing.JScrollPane();
        marca = new javax.swing.JTextPane();
        panelMenuAdministrador = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        registroE1 = new javax.swing.JButton();
        FotoEmpleado = new javax.swing.JLabel();
        usuEmpLista = new javax.swing.JButton();
        Vehiculos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelCargoEmpleado = new javax.swing.JLabel();
        labelNombreEmpleado = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInicioSesion.setBackground(new java.awt.Color(51, 0, 51));
        panelInicioSesion.setPreferredSize(new java.awt.Dimension(1280, 720));
        panelInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(73, 80, 87));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(73, 80, 87));
        jLabel4.setText("Usuario");
        jLabel4.setToolTipText("");
        jLabel4.setAutoscrolls(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 30));

        panelContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelContrasenaActionPerformed(evt);
            }
        });
        jPanel2.add(panelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 390, 60));

        Cedula.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Cedula.setForeground(new java.awt.Color(204, 204, 204));
        Cedula.setText("Coloca tu cedula");
        Cedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CedulaMouseClicked(evt);
            }
        });
        PanelUsuario.setViewportView(Cedula);

        jPanel2.add(PanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 390, 60));

        jLabel6.setBackground(new java.awt.Color(73, 80, 87));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(73, 80, 87));
        jLabel6.setText("Contraseña");
        jLabel6.setToolTipText("");
        jLabel6.setAutoscrolls(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, 30));

        BotonIniciar.setBackground(new java.awt.Color(85, 110, 230));
        BotonIniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonIniciar.setForeground(new java.awt.Color(255, 255, 255));
        BotonIniciar.setText("Iniciar");
        BotonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarActionPerformed(evt);
            }
        });
        jPanel2.add(BotonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 290, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Avatar_Container.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Card_Header.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Card.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 460));

        panelInicioSesion.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 450, 460));

        getContentPane().add(panelInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "color", "Modelo", "Sistema", "Categoria", "Placa","Imagen"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                javax.swing.ImageIcon.class    };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane14.setViewportView(jTable3);

        jButton3.setText("Reservar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TablaVehiculoLayout = new javax.swing.GroupLayout(TablaVehiculo);
        TablaVehiculo.setLayout(TablaVehiculoLayout);
        TablaVehiculoLayout.setHorizontalGroup(
            TablaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaVehiculoLayout.createSequentialGroup()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );
        TablaVehiculoLayout.setVerticalGroup(
            TablaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TablaVehiculoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(TablaVehiculoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(TablaVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelRegistroUsuariod.setMaximumSize(new java.awt.Dimension(1280, 720));
        PanelRegistroUsuariod.setMinimumSize(new java.awt.Dimension(1280, 720));
        PanelRegistroUsuariod.setPreferredSize(new java.awt.Dimension(1280, 720));
        PanelRegistroUsuariod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setViewportView(direccionU);

        PanelRegistroUsuariod.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 223, 66));

        jScrollPane4.setViewportView(telefonoU);

        PanelRegistroUsuariod.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 181, 51));

        jScrollPane6.setViewportView(cedulaU);

        PanelRegistroUsuariod.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 223, 48));

        jScrollPane7.setViewportView(ciudadU);

        PanelRegistroUsuariod.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 181, 48));

        jScrollPane8.setViewportView(correoU);

        PanelRegistroUsuariod.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 181, 45));

        jScrollPane9.setViewportView(nombreU);

        PanelRegistroUsuariod.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 223, 51));

        jScrollPane10.setViewportView(paisU);

        PanelRegistroUsuariod.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 223, 45));
        PanelRegistroUsuariod.add(JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 30, 20));

        FotoCar1.setPreferredSize(new java.awt.Dimension(100, 120));
        PanelRegistroUsuariod.add(FotoCar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        Fotorostro.setText("Subir foto de rostro");
        Fotorostro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FotorostroActionPerformed(evt);
            }
        });
        PanelRegistroUsuariod.add(Fotorostro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        jLabel12.setText("Cedula Del usuario");
        PanelRegistroUsuariod.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel13.setText("Nombre del usuario");
        PanelRegistroUsuariod.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel14.setText("Pais de donde vive el usuario");
        PanelRegistroUsuariod.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jLabel15.setText("Direccion de donde vive el usuario");
        PanelRegistroUsuariod.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jLabel20.setText("Ciudad de residencia del usuario");
        PanelRegistroUsuariod.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jLabel21.setText("Celular del usuario");
        PanelRegistroUsuariod.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        jLabel22.setText("correo del usuario");
        PanelRegistroUsuariod.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));
        PanelRegistroUsuariod.add(JLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, -1));

        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PanelRegistroUsuariod.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, -1, -1));

        crearUsuario.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        crearUsuario.setText("Crear Usuario");
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });
        PanelRegistroUsuariod.add(crearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 256, 70));

        cedulaPDF.setText("Subir pdf de cedula ");
        cedulaPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaPDFActionPerformed(evt);
            }
        });
        PanelRegistroUsuariod.add(cedulaPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        carnetPDF.setText("Subir foto carnet de conducir");
        carnetPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnetPDFActionPerformed(evt);
            }
        });
        PanelRegistroUsuariod.add(carnetPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thumbnail.png"))); // NOI18N
        jLabel23.setText("jLabel23");
        PanelRegistroUsuariod.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(PanelRegistroUsuariod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnGuardarCambios1.setText("Guardar Cambios");
        btnGuardarCambios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambios1ActionPerformed(evt);
            }
        });

        btnEliminar2.setText("Eliminar");
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Pais", "Ciudad", "Direccion", "Celular", "Correo", "Ruta Foto cara", "Ruta cedula PDF", "Ruta carnet PDF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jToggleButton1.setText("Crear Usuario");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaUsuarioLayout = new javax.swing.GroupLayout(panelTablaUsuario);
        panelTablaUsuario.setLayout(panelTablaUsuarioLayout);
        panelTablaUsuarioLayout.setHorizontalGroup(
            panelTablaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaUsuarioLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(panelTablaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnGuardarCambios1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaUsuarioLayout.createSequentialGroup()
                        .addGroup(panelTablaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        panelTablaUsuarioLayout.setVerticalGroup(
            panelTablaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardarCambios1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelTablaUsuarioLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 192, Short.MAX_VALUE))
        );

        getContentPane().add(panelTablaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        panelRegistroEmpleados.setPreferredSize(new java.awt.Dimension(1280, 720));
        panelRegistroEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Component 1.png"))); // NOI18N
        panelRegistroEmpleados.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Component 2.png"))); // NOI18N
        panelRegistroEmpleados.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, -1, -1));

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Try for free.png"))); // NOI18N

        nombreE3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nombreE3.setForeground(new java.awt.Color(204, 204, 204));
        nombreE3.setText("Nombre del empleado sin tildes ");
        nombreE3.setToolTipText("");
        nombreE3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreE3MouseClicked(evt);
            }
        });
        PanelNombre3.setViewportView(nombreE3);

        cedulaE3.setForeground(new java.awt.Color(204, 204, 204));
        cedulaE3.setText("Cedula del empleado");
        cedulaE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedulaE3MouseClicked(evt);
            }
        });
        panelCedula3.setViewportView(cedulaE3);

        contrasena3.setForeground(new java.awt.Color(204, 204, 204));
        contrasena3.setText("Contraseña Minimo 8 caracteres");
        contrasena3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contrasena3MouseClicked(evt);
            }
        });
        panelContrasena4.setViewportView(contrasena3);

        botonCrearUsuario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boton Create account.png"))); // NOI18N
        botonCrearUsuario3.setBorderPainted(false);
        botonCrearUsuario3.setHideActionText(true);
        botonCrearUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearUsuario3ActionPerformed(evt);
            }
        });

        correoE.setForeground(new java.awt.Color(204, 204, 204));
        correoE.setText("Correo del empleado");
        correoE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correoEMouseClicked(evt);
            }
        });
        panelCorreo.setViewportView(correoE);

        jLabel7.setText("Nombre Del empleado");

        jLabel8.setText("Cedula de empleado");

        jLabel9.setText("Cargo del empleado");

        jLabel10.setText("Correo del empleado");

        jLabel11.setText("Contraseña del empleado");

        Combo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniero", "Asesor", "Administrador" }));
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });

        Subirfoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Subirfoto.setText("Subir foto");
        Subirfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubirfotoActionPerformed(evt);
            }
        });

        FotoCar.setPreferredSize(new java.awt.Dimension(100, 120));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(FotoCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Subirfoto))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PanelNombre3, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addComponent(panelCedula3, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addComponent(panelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addComponent(panelContrasena4, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Combo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonCrearUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(panelCedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(panelContrasena4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(FotoCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Subirfoto)))
                .addGap(18, 18, 18)
                .addComponent(botonCrearUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelRegistroEmpleados.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 500, 690));

        jScrollPane5.setViewportView(jTextPane5);

        panelRegistroEmpleados.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 383, 51));

        jButton6.setText("Volver");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelRegistroEmpleados.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 100, 50));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        jLabel19.setToolTipText("");
        panelRegistroEmpleados.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -20, -1, -1));

        getContentPane().add(panelRegistroEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelmodificarUsuariosEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Volver");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panelmodificarUsuariosEmpleados.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 110, 40));

        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        panelmodificarUsuariosEmpleados.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 120, 40));

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        panelmodificarUsuariosEmpleados.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 120, 40));

        jToggleButton2.setText("Crear Empleado");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        panelmodificarUsuariosEmpleados.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 120, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Cargo", "Correo", "Contraseña", "Ruta de foto de perfil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Cedula");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Cargo");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Correo");
        }

        panelmodificarUsuariosEmpleados.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 480));

        getContentPane().add(panelmodificarUsuariosEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        sistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automatico", "Manual" }));
        sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemaActionPerformed(evt);
            }
        });

        Back1.setBackground(java.awt.Color.lightGray);
        Back1.setFont(Back1.getFont().deriveFont(Back1.getFont().getSize()+31f));
        Back1.setText("🔙");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        jLabel24.setText("Marca Del Vehiculo");

        jLabel25.setText("Categoria del vehiculo");

        jLabel26.setText("Color del vehiculo");

        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUV", "Economico", "4x4" }));

        jScrollPane11.setViewportView(color);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Subir Imagen Del Vehiculo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel27.setText("Placa del Vehiculo");

        jLabel28.setText("Modelo del vehiculo");

        jScrollPane12.setViewportView(placa);

        jScrollPane13.setViewportView(modelocarro);

        jLabel29.setText("Tipo De sistema");

        marcavehiculo.setViewportView(marca);

        javax.swing.GroupLayout CarroMenuLayout = new javax.swing.GroupLayout(CarroMenu);
        CarroMenu.setLayout(CarroMenuLayout);
        CarroMenuLayout.setHorizontalGroup(
            CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarroMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335)
                .addComponent(Back1)
                .addGap(19, 19, 19))
            .addGroup(CarroMenuLayout.createSequentialGroup()
                .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarroMenuLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CarroMenuLayout.createSequentialGroup()
                                .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel26)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addGap(25, 25, 25)
                                .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel27))))
                            .addComponent(marcavehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CarroMenuLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(sistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addGap(144, 144, 144)
                .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(fotoCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CarroMenuLayout.setVerticalGroup(
            CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarroMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fotoCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back1))
                .addGap(9, 9, 9))
            .addGroup(CarroMenuLayout.createSequentialGroup()
                .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarroMenuLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marcavehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CarroMenuLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarroMenuLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CarroMenuLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(CarroMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CarroMenuLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CarroMenuLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(CarroMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        panelMenuAdministrador.setPreferredSize(new java.awt.Dimension(1280, 720));
        panelMenuAdministrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setBackground(java.awt.Color.lightGray);
        Back.setFont(Back.getFont().deriveFont(Back.getFont().getSize()+31f));
        Back.setText("🔙");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        panelMenuAdministrador.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 110, 100));

        registroE1.setContentAreaFilled(false);
        registroE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroE1ActionPerformed(evt);
            }
        });
        panelMenuAdministrador.add(registroE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 80, 90));

        FotoEmpleado.setText("21321");
        FotoEmpleado.setPreferredSize(new java.awt.Dimension(100, 120));
        panelMenuAdministrador.add(FotoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        usuEmpLista.setContentAreaFilled(false);
        usuEmpLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuEmpListaActionPerformed(evt);
            }
        });
        panelMenuAdministrador.add(usuEmpLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 80, 90));

        Vehiculos.setContentAreaFilled(false);
        Vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculosActionPerformed(evt);
            }
        });
        panelMenuAdministrador.add(Vehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 80, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/How it works.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        panelMenuAdministrador.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 110, 1440, 380));

        labelCargoEmpleado.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        labelCargoEmpleado.setText("Cargo");
        panelMenuAdministrador.add(labelCargoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        labelNombreEmpleado.setBackground(new java.awt.Color(255, 153, 153));
        labelNombreEmpleado.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        labelNombreEmpleado.setText("Usuario");
        panelMenuAdministrador.add(labelNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        getContentPane().add(panelMenuAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuEmpListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuEmpListaActionPerformed

        if (!"Ingeniero".equals(sesion.getEmpleado().getCargo())){
            System.out.print(sesion.getEmpleado().getRutaFoto());
       JOptionPane.showMessageDialog(this, "Solo Persona con cargo de ingeniero pueden ingresar","Advertencia",JOptionPane.WARNING_MESSAGE);  }
             else {
             String[] opciones = {"Empleados", "Usuarios"};
             int seleccion = JOptionPane.showOptionDialog(this,"¿Qué tabla deseas ver?", "Selecciona una opción",
    JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opciones,
        opciones[0]);
    
    // Según lo que elija, mostrar tabla correspondiente
    if (seleccion == 0) {
        // Mostrar tabla de empleados
    panelInicioSesion.setVisible(false);
    panelMenuAdministrador.setVisible(false);
    panelRegistroEmpleados.setVisible(false);
    panelmodificarUsuariosEmpleados.setVisible(true);
    panelTablaUsuario.setVisible(false);
    PanelRegistroUsuariod.setVisible(false);
            CarroMenu.setVisible(false);




        
    } else if (seleccion == 1) {
        // Mostrar tabla de usuarios
    panelInicioSesion.setVisible(false);
    panelMenuAdministrador.setVisible(false);
    panelRegistroEmpleados.setVisible(false);
    panelmodificarUsuariosEmpleados.setVisible(false); 
    panelTablaUsuario.setVisible(true);
   PanelRegistroUsuariod.setVisible(false);
           CarroMenu.setVisible(false);


         
    }
}
                     
    }//GEN-LAST:event_usuEmpListaActionPerformed

    
    
    private void cargarEmpleadosEnTabla() {
    // Obtén el modelo de la tabla
    model.setRowCount(0); // Limpia la tabla actual

    // Obtén la lista desde el archivo
    Login login = new Login();
    ArrayList<Empleado> empleados = login.listaEmpleado();

    // Agrega cada empleado como una fila
    for (Empleado emp : empleados) {
        model.addRow(new Object[] {
            emp.getCedula(),
            emp.getNombre(),
            emp.getCargo(),
            emp.getCorreo(),
            emp.getContrasena(),
            emp.getRutaFoto()
        });
    }
}
    
 private void cargarVehiculosEntabla() {
    // Obtén el modelo de la tabla
    modela.setRowCount(0); // Limpia la tabla actual

    // Obtén la lista desde el archivo
    Login login = new Login();
    ArrayList<Carro> Carros= login.listaCarro();

    // Agrega cada empleado como una fila
    for (Carro CRO : Carros) {
        System.out.print(CRO.getPlaca());
        
        ImageIcon icono = new ImageIcon(CRO.getPlaca());
        Image imagenEscalada = icono.getImage().getScaledInstance(100, 60, Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(imagenEscalada);
        modela.addRow(new Object[] {
            CRO.getMarca(),
            CRO.getColor(),
            CRO.getModelo(),
            CRO.getCategoria(),
            CRO.getSistema(),
            CRO.getImagen(),
            imagen });
        
    }jTable3.setRowHeight(70);
   

}   
    
    private void cargarUsuarioEnTabla() {
    // Obtén el modelo de la tabla
    modelo.setRowCount(0); // Limpia la tabla actual

    Login login = new Login();
    
    ArrayList<Usuario> usuarios=login.listaUsuario();
    // Agrega cada empleado como una fila
    for (Usuario usu : usuarios) {
        modelo.addRow(new Object[] {
            usu.getCedula(),
            usu.getNombre(),
            usu.getPais(),
            usu.getCiudad(),
            usu.getDireccion(),
            usu.getTelefono(),
            usu.getCorreo(),
            usu.getRutaFoto(),
            usu.getRutaCE(),
            usu.getRutaCA()
        });
    }
}
    
    
    
    
    
    
    
    
    
    private void botonCrearUsuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearUsuario3ActionPerformed
         // TODO add your handling code here:
         
        String nombre = nombreE3.getText().trim();
        String cedula= cedulaE3.getText().trim();   
        String correo=correoE.getText().trim();
        String contrasena=contrasena3.getText().trim();
        String cargo=Combo.getSelectedItem().toString();
        String rutaFoto=ruta;
                
        if (nombre.isEmpty() || cedula.isEmpty() || cargo.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
        }
        
        
         if (contrasena.length() < 8) {
        JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 8 caracteres.");
        return;
         }   
         
        Empleado emp = new Empleado(cedula, nombre,cargo, correo, contrasena,rutaFoto);
         
         if (emp.yaEstaRegistrado(cedula)) {
          JOptionPane.showMessageDialog(this, "la cedula del empleado ha sido registrada anteriormente"); 
         return;
         }
         
         emp.guardarArchivos();

        JOptionPane.showMessageDialog(this, "El empleado ha sido registrado exitosamente.");
        
        
        
    }//GEN-LAST:event_botonCrearUsuario3ActionPerformed

        
    private void nombreE3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreE3MouseClicked
        // TODO add  handling code here:
           if (nombreE3.getText().equals("Nombre del empleado sin tildes ")) { 
                    nombreE3.setText("");
        

           }
    }//GEN-LAST:event_nombreE3MouseClicked

    private void cedulaE3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaE3MouseClicked
        // TODO add your handling code here:
        if (cedulaE3.getText().equals("Cedula del empleado")) {
   
            cedulaE3.setText("");}
       

        
    }//GEN-LAST:event_cedulaE3MouseClicked

    private void correoEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoEMouseClicked
        // TODO add your handling code here:
           if (correoE.getText().equals("Correo del empleado")) {
            correoE.setText("");}
        

        
        
        
    }//GEN-LAST:event_correoEMouseClicked

    private void contrasena3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasena3MouseClicked
        // TODO add your handling code here:
          if (contrasena3.getText().equals("Contraseña Minimo 8 caracteres")) {
            contrasena3.setText("");}
       

    }//GEN-LAST:event_contrasena3MouseClicked

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_ComboActionPerformed






    private void SubirfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirfotoActionPerformed
        
        String cedula=cedulaE3.getText().trim();
        
        if(cedula.isEmpty() || cedula=="Cedula del empleado"){
            JOptionPane.showMessageDialog(this,"Por Favor ingrese la cedula antes de subir la foto");
            return;
        }

        JFileChooser selector =new JFileChooser();
        FileNameExtensionFilter filtrado =new FileNameExtensionFilter("Imágenes JPG y PNG", "jpg", "png");
        selector.setFileFilter(filtrado);
        
        int respuesta=selector.showOpenDialog(this); 
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
            File imagenSeleccionada=selector.getSelectedFile();
           
            try{
                File carpetaFotos=new File("fotosEmpleados");
                if(!carpetaFotos.exists()){
                    carpetaFotos.mkdirs();
                }
                
                String nombreArchivo=imagenSeleccionada.getName();
                String extension=nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
                
                File destino=new File(carpetaFotos,cedula + extension);
                
                ruta="C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\"+carpetaFotos+"\\"+cedula + extension;
                
                Files.copy(imagenSeleccionada.toPath(), destino.toPath(),StandardCopyOption.REPLACE_EXISTING);
                
                
            Image MG=new ImageIcon(destino.getAbsolutePath()).getImage();
            ImageIcon icono=new ImageIcon(MG.getScaledInstance(100, 120, Image.SCALE_SMOOTH));
            FotoCar.setIcon(icono);

            }catch(IOException ex){
                JOptionPane.showMessageDialog(this,"Error al subir la foto: "+ex.getMessage());
            }  
        }
    }//GEN-LAST:event_SubirfotoActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        try(BufferedWriter escritor=new BufferedWriter (new FileWriter("C:\\Users\\lenov\\Downloads\\Empleados.txt",false))){
          for(int i=0;i<this.jTable1.getRowCount();i++){
            String cedula = model.getValueAt(i, 0).toString().trim();
            String nombre = model.getValueAt(i, 1).toString().trim();
            String cargo = model.getValueAt(i, 2).toString().trim();
            String correo = model.getValueAt(i, 3).toString().trim();
            String contrasena = model.getValueAt(i, 4).toString().trim();
            String rutaFoto = model.getValueAt(i, 5).toString().trim();
              
            String linea = cedula + "," + nombre + "," + cargo + "," + correo + "," + contrasena + "," + rutaFoto;
            escritor.write(linea);
            escritor.newLine(); 
              
          }
          JOptionPane.showMessageDialog(this, "Cambios guardados correctamente.");

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar nuevo empleado");
    }

            
            
        
        
        
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

        
    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed

        int fila = jTable1.getSelectedRow();
        
        if (fila != -1) {
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Estás seguro de eliminar este empleado?", "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Elimina la fila del modelo
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.removeRow(fila);

            JOptionPane.showMessageDialog(this, "Empleado eliminado. No olvides guardar los cambios.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Primero selecciona una fila para eliminar.");
    }

        
        
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnGuardarCambios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambios1ActionPerformed
        // TODO add your handling code here:
        try(BufferedWriter escritor=new BufferedWriter (new FileWriter("C:\\Users\\lenov\\Downloads\\Usuarios.txt",false))){
          for(int i=0;i<this.jTable2.getRowCount();i++){
            String cedula = modelo.getValueAt(i, 0).toString().trim();
            String nombre = modelo.getValueAt(i, 1).toString().trim();
            String pais = modelo.getValueAt(i, 2).toString().trim();
            String ciudad = modelo.getValueAt(i, 3).toString().trim();
            String direccion = modelo.getValueAt(i, 4).toString().trim();
            String celular = modelo.getValueAt(i, 5).toString().trim();
            String correo = modelo.getValueAt(i, 6).toString().trim();
              
            String linea = cedula + "," + nombre + "," + pais + "," + ciudad + "," + direccion + "," + celular+","+correo;
            escritor.write(linea);
            escritor.newLine();   
          }
          JOptionPane.showMessageDialog(this, "Cambios guardados correctamente.");

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar nuevo Usuario");
    
    }
        
        
        
        
    }//GEN-LAST:event_btnGuardarCambios1ActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        // TODO add your handling code here:
        int fila = jTable2.getSelectedRow();
        
        if (fila != -1) {
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Estás seguro de eliminar este empleado?", "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Elimina la fila del modelo
            DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
            modelo.removeRow(fila);

            JOptionPane.showMessageDialog(this, "Usuario eliminado. No olvides guardar los cambios.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Primero selecciona una fila para eliminar.");
    }

        
        
        
        
        
        
        
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void FotorostroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FotorostroActionPerformed
        // TODO add your handling code here:
        String cedula=cedulaU.getText().trim();
        
        if(cedula.isEmpty()){
            JOptionPane.showMessageDialog(this,"Por Favor ingrese la cedula antes de subir la foto");
            return;
        }

        JFileChooser selector =new JFileChooser();
        FileNameExtensionFilter filtrado =new FileNameExtensionFilter("Imágenes JPG y PNG", "jpg", "png");
        selector.setFileFilter(filtrado);
        
        int respuesta=selector.showOpenDialog(this); 
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
            File imagenSeleccionada=selector.getSelectedFile();
           
            try{
                File carpetaFotos=new File("fotosEmpleados");
                if(!carpetaFotos.exists()){
                    carpetaFotos.mkdirs();
                }
                
                String nombreArchivo=imagenSeleccionada.getName();
                String extension=nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
                
                File destino=new File(carpetaFotos,cedula + extension);
                
                rutaU="C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\"+carpetaFotos+"\\"+cedula + extension;
                
                Files.copy(imagenSeleccionada.toPath(), destino.toPath(),StandardCopyOption.REPLACE_EXISTING);
                
                
            Image MG=new ImageIcon(destino.getAbsolutePath()).getImage();
            ImageIcon icono=new ImageIcon(MG.getScaledInstance(100, 120, Image.SCALE_SMOOTH));
            FotoCar1.setIcon(icono);

            }catch(IOException ex){
                JOptionPane.showMessageDialog(this,"Error al subir la foto: "+ex.getMessage());
            }  
        }       
    }//GEN-LAST:event_FotorostroActionPerformed

    private void cedulaPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaPDFActionPerformed
    String cedula=cedulaU.getText().trim();
        
        if(cedula.isEmpty()){
            JOptionPane.showMessageDialog(this,"Por Favor ingrese la cedula antes de subir el PDF");
            return;
        }

        JFileChooser selector =new JFileChooser();
        FileNameExtensionFilter filtrado =new FileNameExtensionFilter("Documentos PDF", "pdf");
        selector.setFileFilter(filtrado);
        
        int respuesta=selector.showOpenDialog(this); 
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
            File archivoSeleccionado=selector.getSelectedFile();
           
            try{
                File carpetaDocumentos=new File("DocumentosUsuarios");
                if(!carpetaDocumentos.exists()){
                    carpetaDocumentos.mkdirs();
                    
                }
                
                String nombreArchivo=archivoSeleccionado.getName();
                String extension=nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
                
                File destino=new File(carpetaDocumentos,"cedulaUsuario_"+cedula + extension);
                                
                Files.copy(archivoSeleccionado.toPath(), destino.toPath(),StandardCopyOption.REPLACE_EXISTING);
                JOptionPane.showMessageDialog(this, "✅ PDF subido correctamente.");
                rutaU2="C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\carpetaDocumentos\\cedulaUsuario_"+cedula + extension;
                

            }catch(IOException ex){
                JOptionPane.showMessageDialog(this,"Error al subir el pdf: "+ex.getMessage());
            }  
        }  
        
        
        
        
        
        
        
    }//GEN-LAST:event_cedulaPDFActionPerformed

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        // TODO add your handling code here:
        
        
        
        String nombre =nombreU.getText().trim();
        String cedula=cedulaU.getText().trim();   
        String correo=correoU.getText().trim();
        String pais=paisU.getText().trim();
        String ciudad=ciudadU.getText().trim();
        String direccion=direccionU.getText().trim();
        String telefono=telefonoU.getText().trim();
        String RutaFoto=rutaU;
        String rutaCE=rutaU1;
        String rutaCA=rutaU2;
        System.out.print(rutaCA);
        System.out.print(rutaU2);


        

        if (nombre.isEmpty() || cedula.isEmpty() || pais.isEmpty() || correo.isEmpty() || direccion.isEmpty()||telefono.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
        }
        Usuario usu = new Usuario(cedula,nombre,pais, ciudad, direccion,telefono,correo,RutaFoto,rutaCE,rutaCA);

         if (usu.yaEstaRegistrado(cedula)) {
          JOptionPane.showMessageDialog(this, "la cedula del Usuario ha sido registrada anteriormente"); 
         return;
         }
         
         usu.guardarArchivos();

        JOptionPane.showMessageDialog(this, "El Usuario ha sido registrado exitosamente.");
        
        
        
        

        
        
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void carnetPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnetPDFActionPerformed
        // TODO add your handling code here:
        String cedula=cedulaU.getText().trim();
        
        if(cedula.isEmpty()){
            JOptionPane.showMessageDialog(this,"Por Favor ingrese la cedula antes de subir el PDF");
            return;
        }

        JFileChooser selector =new JFileChooser();
        FileNameExtensionFilter filtrado =new FileNameExtensionFilter("Documentos PDF", "pdf");
        selector.setFileFilter(filtrado);
        
        int respuesta=selector.showOpenDialog(this); 
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
            File archivoSeleccionado=selector.getSelectedFile();
           
            try{
                File carpetaDocumentos=new File("DocumentosUsuarios");
                if(!carpetaDocumentos.exists()){
                    carpetaDocumentos.mkdirs();
                    
                }
                
                String nombreArchivo=archivoSeleccionado.getName();
                String extension=nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
                
                File destino=new File(carpetaDocumentos,"carnetUsuario_"+cedula+extension);
               rutaU1="C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\carpetaDocumentos\\carnetUsuario_"+cedula + extension;                 
                Files.copy(archivoSeleccionado.toPath(), destino.toPath(),StandardCopyOption.REPLACE_EXISTING);
                        JOptionPane.showMessageDialog(this, "✅ PDF subido correctamente.");
            }catch(IOException ex){
                JOptionPane.showMessageDialog(this,"Error al subir el pdf: "+ex.getMessage());
            }  
        }     
    }//GEN-LAST:event_carnetPDFActionPerformed

    private void VehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiculosActionPerformed
      panelInicioSesion.setVisible(false);
    panelMenuAdministrador.setVisible(false);
    panelRegistroEmpleados.setVisible(false);
    panelmodificarUsuariosEmpleados.setVisible(false); 
    panelTablaUsuario.setVisible(false);
   PanelRegistroUsuariod.setVisible(false);
           CarroMenu.setVisible(true);
       

        
        
        
        
        
        
    }//GEN-LAST:event_VehiculosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String placaCar=placa.getText().trim();

        if(placaCar.isEmpty()){
            JOptionPane.showMessageDialog(this,"Por Favor ingrese la placa del vehiculo antes de subir la foto");
            return;
        }

        JFileChooser selector =new JFileChooser();
        FileNameExtensionFilter filtrado =new FileNameExtensionFilter("Imágenes JPG y PNG", "jpg", "png");
        selector.setFileFilter(filtrado);

        int respuesta=selector.showOpenDialog(this);

        if(respuesta == JFileChooser.APPROVE_OPTION){
            File imagenSeleccionada=selector.getSelectedFile();

            try{
                File carpetaFotosVehiculos=new File("carpetaFotosVehiculos");
                if(!carpetaFotosVehiculos.exists()){
                    carpetaFotosVehiculos.mkdirs();
                }

                String nombreArchivo=imagenSeleccionada.getName();
                String extension=nombreArchivo.substring(nombreArchivo.lastIndexOf("."));

                File destino=new File(carpetaFotosVehiculos,placaCar + extension);

                ruta = "C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\"+carpetaFotosVehiculos+"\\"+placaCar + extension;

                Files.copy(imagenSeleccionada.toPath(), destino.toPath(),StandardCopyOption.REPLACE_EXISTING);

                Image MG=new ImageIcon(destino.getAbsolutePath()).getImage();
                ImageIcon icono=new ImageIcon(MG.getScaledInstance(193, 193, Image.SCALE_SMOOTH));
                fotoCAR.setIcon(icono);

            }catch(IOException ex){
                JOptionPane.showMessageDialog(this,"Error al subir la foto: "+ex.getMessage());
            } }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String marcaCar = marca.getText().trim();
        String colorCar= color.getText().trim();
        String modeloCar=modelocarro.getText().trim();
        String Tsistema=sistema.getSelectedItem().toString();
        String categoriaCar=categoria.getSelectedItem().toString();
        String placaCar=placa.getText().trim();
        String ImagenCar=ruta;
        
        
        Carro car=new Carro(marcaCar,colorCar,modeloCar,Tsistema,categoriaCar,ImagenCar,placaCar);
        car.guardarArchivos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sistemaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    panelInicioSesion.setVisible(false);
    panelMenuAdministrador.setVisible(false);
    panelRegistroEmpleados.setVisible(false);
    panelmodificarUsuariosEmpleados.setVisible(false);
    panelTablaUsuario.setVisible(false);
    PanelRegistroUsuariod.setVisible(false);
    CarroMenu.setVisible(false);
    TablaVehiculo.setVisible(false);
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
            ocultarPaneles();
            PanelRegistroUsuariod.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            
                String[] opciones = {"Si", "No"};

    int seleccion = JOptionPane.showOptionDialog(
            this,
            "¿Deseas volver?",
            "volver",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]);

    if (seleccion == 0) {

         ocultarPaneles();
            panelMenuAdministrador.setVisible(true);
    }
        

    }//GEN-LAST:event_jButton4ActionPerformed

    private void registroE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroE1ActionPerformed
               
                panelRegistroEmpleados.setVisible(true);
                                            
    }//GEN-LAST:event_registroE1ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
            
        String[] opciones = {"Si", "No"};

    int seleccion = JOptionPane.showOptionDialog(
            this,
            "¿Deseas cerrar sesión?",
            "Cerrar sesión",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]);

    if (seleccion == 0) {

        // Cerrar sesión
        sesion.cerrarSesion();

        // Limpiar campos
        Cedula.setText("Coloca tu cedula");
        panelContrasena.setText("");

        // Ocultar paneles
        ocultarPaneles();

        // Mostrar login
        panelInicioSesion.setVisible(true);
    }
    }//GEN-LAST:event_BackActionPerformed

    
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
           String[] opciones = {"Si", "No"};

    int seleccion = JOptionPane.showOptionDialog(
            this,
            "¿Deseas volver?",
            "volver",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]);

    if (seleccion == 0) {

               ocultarPaneles();
            if(empleadoActual.getCargo().equals("Ingeniero") || empleadoActual.getCargo().equals("Administrador")){
                panelMenuAdministrador.setVisible(true);}
    }                                          
    }//GEN-LAST:event_jButton6ActionPerformed
    
    
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
     ocultarPaneles();
            if(empleadoActual.getCargo().equals("Ingeniero") ||
               empleadoActual.getCargo().equals("Administrador")){
                panelMenuAdministrador.setVisible(true);}

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
           String[] opciones = {"Si", "No"};

    int seleccion = JOptionPane.showOptionDialog(
            this,
            "¿Deseas volver?",
            "volver",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]);

    if (seleccion == 0) {

               ocultarPaneles();
            if(empleadoActual.getCargo().equals("Ingeniero") || empleadoActual.getCargo().equals("Administrador")){
                panelMenuAdministrador.setVisible(true);}
    }                                          
    }//GEN-LAST:event_jButton7ActionPerformed

    private void BotonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarActionPerformed
        // TODO add your handling code here:
        
        
        
        String cedula = Cedula.getText().trim();
        String contrasena = new String(panelContrasena.getPassword()).trim();

        if (cedula.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa tu cédula y contraseña.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
        }else {
            Login login = new Login();

            ArrayList<Empleado> empleados = login.listaEmpleado();

            if (emp.loginEmpleado(empleados,cedula,contrasena))
            {
                empleadoActual = sesion.getEmpleado();

                labelCargoEmpleado.setFont(new Font("Segoe UI", Font.BOLD, 14));
                labelNombreEmpleado.setFont(new Font("Segoe UI", Font.BOLD, 14));
                labelNombreEmpleado.setForeground(new Color(50, 50, 50));
                labelNombreEmpleado.setForeground(new Color(50, 50, 50));
                labelCargoEmpleado.setForeground(new Color(50, 50, 50));
                labelNombreEmpleado.setText("Usuario: "+sesion.getEmpleado().getNombre());
                labelCargoEmpleado.setText("Cargo: "+sesion.getEmpleado().getCargo());

                String ruta=sesion.getEmpleado().getRutaFoto();

                Image MG=new ImageIcon(ruta).getImage();
                ImageIcon icono=new ImageIcon(MG.getScaledInstance(100, 120, Image.SCALE_SMOOTH));
                FotoEmpleado.setIcon(icono);

                if(emp.cargo(cedula).equals("Ingeniero")||emp.cargo(cedula).equals("Administrador"))
                {
                    panelInicioSesion.setVisible(false);
                    panelMenuAdministrador.setVisible(true);
                    panelRegistroEmpleados.setVisible(false);
                    panelmodificarUsuariosEmpleados.setVisible(false);
                    PanelRegistroUsuariod.setVisible(false);
                    CarroMenu.setVisible(false);

                }
                else if(emp.cargo(cedula).equals("Asesor")){
                    panelInicioSesion.setVisible(false);
                    panelMenuAdministrador.setVisible(false);
                    panelRegistroEmpleados.setVisible(false);
                    panelmodificarUsuariosEmpleados.setVisible(false);
                    PanelRegistroUsuariod.setVisible(false);
                    CarroMenu.setVisible(false);
                    TablaVehiculo.setVisible(true);

                }
            }else {
                JOptionPane.showMessageDialog(this,
                    "Los datos ingresados no son válidos",
                    "Error al iniciar sesión",
                    JOptionPane.ERROR_MESSAGE);

                Cedula.setText("Coloca tu cedula");
                panelContrasena.setText("");
            }

        }
    }//GEN-LAST:event_BotonIniciarActionPerformed

    private void CedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CedulaMouseClicked
        // TODO add your handling code her
        if (Cedula.getText().equals("Coloca tu cedula")) {
            Cedula.setText("");}

    }//GEN-LAST:event_CedulaMouseClicked

    private void panelContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelContrasenaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String[] opciones = {"Si", "No"};

    int seleccion = JOptionPane.showOptionDialog(
            this,
            "¿Deseas volver?",
            "volver",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]);

    if (seleccion == 0) {

       ocultarPaneles();
            if(empleadoActual.getCargo().equals("Ingeniero") ||
            empleadoActual.getCargo().equals("Administrador")){
            panelMenuAdministrador.setVisible(true);
            }else if (empleadoActual.getCargo().equals("Asesor")){
                TablaVehiculo.setVisible(true);}
    }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
           String[] opciones = {"Si", "No"};

    int seleccion = JOptionPane.showOptionDialog(
            this,
            "¿Deseas volver?",
            "volver",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]);

    if (seleccion == 0) {

               ocultarPaneles();
            if(empleadoActual.getCargo().equals("Ingeniero") || empleadoActual.getCargo().equals("Administrador")){
                panelMenuAdministrador.setVisible(true);}
    }                                          
    }//GEN-LAST:event_Back1ActionPerformed

    
    public static void main(String args[]) {
        
        
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principalVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new principalVent().setVisible(true);
        });}
        
        
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Back1;
    private javax.swing.JButton BotonIniciar;
    private javax.swing.JPanel CarroMenu;
    private javax.swing.JTextPane Cedula;
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JLabel FotoCar;
    private javax.swing.JLabel FotoCar1;
    private javax.swing.JLabel FotoEmpleado;
    private javax.swing.JButton Fotorostro;
    private javax.swing.JLabel JLabel;
    private javax.swing.JLabel JLabel8;
    private javax.swing.JScrollPane PanelNombre3;
    private javax.swing.JPanel PanelRegistroUsuariod;
    private javax.swing.JScrollPane PanelUsuario;
    private javax.swing.JButton Subirfoto;
    private javax.swing.JPanel TablaVehiculo;
    private javax.swing.JButton Vehiculos;
    private javax.swing.JButton botonCrearUsuario3;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnGuardarCambios1;
    private javax.swing.JButton carnetPDF;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextPane cedulaE3;
    private javax.swing.JButton cedulaPDF;
    private javax.swing.JTextPane cedulaU;
    private javax.swing.JTextPane ciudadU;
    private javax.swing.JTextPane color;
    private javax.swing.JTextPane contrasena3;
    private javax.swing.JTextPane correoE;
    private javax.swing.JTextPane correoU;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JTextPane direccionU;
    private javax.swing.JLabel fotoCAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel labelCargoEmpleado;
    private javax.swing.JLabel labelNombreEmpleado;
    private javax.swing.JTextPane marca;
    private javax.swing.JScrollPane marcavehiculo;
    private javax.swing.JTextPane modelocarro;
    private javax.swing.JTextPane nombreE3;
    private javax.swing.JTextPane nombreU;
    private javax.swing.JTextPane paisU;
    private javax.swing.JScrollPane panelCedula3;
    private javax.swing.JPasswordField panelContrasena;
    private javax.swing.JScrollPane panelContrasena4;
    private javax.swing.JScrollPane panelCorreo;
    private javax.swing.JPanel panelInicioSesion;
    private javax.swing.JPanel panelMenuAdministrador;
    private javax.swing.JPanel panelRegistroEmpleados;
    private javax.swing.JPanel panelTablaUsuario;
    private javax.swing.JPanel panelmodificarUsuariosEmpleados;
    private javax.swing.JTextPane placa;
    private javax.swing.JButton registroE1;
    private javax.swing.JComboBox<String> sistema;
    private javax.swing.JTextPane telefonoU;
    private javax.swing.JButton usuEmpLista;
    // End of variables declaration//GEN-END:variables
}
