package guiPrograma_Empleados;
import trabajo_Herencia_proyecto.Empleado_Recibo;

public class guiRecibo extends javax.swing.JFrame {

	/**
     * Crea nuevo formulario guiPlanilla
     */
    public guiRecibo() {
        initComponents();
        this.setLocationRelativeTo(null); // para centrar dentro de la panatalla la aplicacion;
        // para maximizar la ventana al momento de abrirse
            setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        buttonAeroRound1 = new org.edisoncor.gui.button.ButtonAeroRound();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        txtName = new org.edisoncor.gui.textField.TextField();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        txtApellidos = new org.edisoncor.gui.textField.TextField();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        txtDni = new org.edisoncor.gui.textField.TextField();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        txtDireccion = new org.edisoncor.gui.textField.TextField();
        txtEdad = new org.edisoncor.gui.textField.TextField();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        txtAnosExperiencias = new org.edisoncor.gui.textField.TextField();
        labelMetric8 = new org.edisoncor.gui.label.LabelMetric();
        txtHorasTraba = new org.edisoncor.gui.textField.TextField();
        labelMetric9 = new org.edisoncor.gui.label.LabelMetric();
        txtPagoHora = new org.edisoncor.gui.textField.TextField();
        txtRuc = new org.edisoncor.gui.textField.TextField();
        labelMetric11 = new org.edisoncor.gui.label.LabelMetric();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReporte = new javax.swing.JTextArea();
        btnSalir = new org.edisoncor.gui.button.ButtonAction();
        comboBoxeEstudios = new org.edisoncor.gui.comboBox.ComboBoxRound();
        btnLimpiar = new org.edisoncor.gui.button.ButtonAction();
        btnVolverMenu = new org.edisoncor.gui.button.ButtonAction();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N

        labelHeader1.setText("EMPLEADO RECIBO:");
        labelHeader1.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N

        buttonAeroRound1.setBackground(new java.awt.Color(51, 0, 51));
        buttonAeroRound1.setText("PROCESAR");
        buttonAeroRound1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        buttonAeroRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroRound1ActionPerformed(evt);
            }
        });

        labelMetric1.setText("Nombres: ");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        labelMetric2.setText("Apellidos: ");
        labelMetric2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        labelMetric3.setText("DNI:");
        labelMetric3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelMetric4.setText("Direcci�n:");
        labelMetric4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        labelMetric5.setText("Edad:");
        labelMetric5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        labelMetric6.setText("Estudios:");
        labelMetric6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        labelMetric7.setText("A�os de Experiencias: ");
        labelMetric7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        labelMetric8.setText("Horas Trabajadas:");
        labelMetric8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        labelMetric9.setText("Pago por hora:");
        labelMetric9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        labelMetric11.setText("RUC:");
        labelMetric11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        txtReporte.setBackground(new java.awt.Color(204, 255, 255));
        txtReporte.setColumns(20);
        txtReporte.setRows(5);
        jScrollPane1.setViewportView(txtReporte);

        btnSalir.setBackground(new java.awt.Color(102, 0, 102));
        btnSalir.setText("SALIR");
        btnSalir.setColorDeSombra(new java.awt.Color(102, 0, 102));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        comboBoxeEstudios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Universitario", "Tecnico" }));
        comboBoxeEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxeEstudiosActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(102, 0, 102));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setColorDeSombra(new java.awt.Color(102, 0, 102));
        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolverMenu.setBackground(new java.awt.Color(102, 0, 102));
        btnVolverMenu.setText("VOLVER MENU");
        btnVolverMenu.setColorDeSombra(new java.awt.Color(102, 0, 102));
        btnVolverMenu.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        labelCustom1.setText("HORA ESPA�A");
        labelCustom1.setFont(new java.awt.Font("Californian FB", 1, 22)); // NOI18N

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxeEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(168, 168, 168)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPagoHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHorasTraba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAnosExperiencias, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel2Layout.createSequentialGroup()
                        .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel2Layout.createSequentialGroup()
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))))
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAeroRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolverMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxeEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnosExperiencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHorasTraba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPagoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAeroRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
        // agregar el c�digo de manejo aqu�
        dispose();
    }

    private void buttonAeroRound1ActionPerformed(java.awt.event.ActionEvent evt) {
     Empleado_Recibo e = new Empleado_Recibo(txtName.getText(),txtApellidos.getText(),txtDni.getText(),txtDireccion.getText(), 
                         Integer.parseInt(txtEdad.getText()),comboBoxeEstudios.getSelectedItem().toString()
                         , Integer.parseInt(txtAnosExperiencias.getText()),Integer.parseInt(txtHorasTraba.getText())
                         ,Integer.parseInt(txtPagoHora.getText()) ,txtRuc.getText());
    
     txtReporte.append(e.imprimirBoletaPago());
     
     
    
    }

    private void comboBoxeEstudiosActionPerformed(java.awt.event.ActionEvent evt) {
        // agregar el c�digo de manejo aqu�
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        // agregar el c�digo de manejo aqu�
     this.txtName.setText(" ");
     this.txtApellidos.setText(" ");
     this.txtAnosExperiencias.setText(" ");
     this.txtDireccion.setText(" ");
     this.txtDni.setText(" ");
     this.txtEdad.setText(" ");
     this.txtHorasTraba.setText(" ");
     this.txtPagoHora.setText(" ");
     this.txtReporte.setText(" ");
     this.txtRuc.setText(" ");
    }

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // agregar el c�digo de manejo aqu�
        this.setVisible(false); // para que se pueda ir 
        guiSistema_empleados_menu m = new guiSistema_empleados_menu();
        m.setVisible(true); // para que se pueda venir 
    }
  // crear m�todos dentro del programa sin usar algunos botones 
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        // agregar el c�digo de manejo aqu�
        controlEditable();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiRecibo().setVisible(true);
            }
        });
    }

    // Declaraci�n de variables - no modificar
    private org.edisoncor.gui.button.ButtonAction btnLimpiar;
    private org.edisoncor.gui.button.ButtonAction btnSalir;
    private org.edisoncor.gui.button.ButtonAction btnVolverMenu;
    private org.edisoncor.gui.button.ButtonAeroRound buttonAeroRound1;
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private org.edisoncor.gui.comboBox.ComboBoxRound comboBoxeEstudios;
    private javax.swing.JScrollPane jScrollPane1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric11;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private org.edisoncor.gui.label.LabelMetric labelMetric8;
    private org.edisoncor.gui.label.LabelMetric labelMetric9;
    private org.edisoncor.gui.textField.TextField txtApellidos;
    private org.edisoncor.gui.textField.TextField txtAnosExperiencias;
    private org.edisoncor.gui.textField.TextField txtDireccion;
    private org.edisoncor.gui.textField.TextField txtDni;
    private org.edisoncor.gui.textField.TextField txtEdad;
    private org.edisoncor.gui.textField.TextField txtHorasTraba;
    private org.edisoncor.gui.textField.TextField txtName;
    private org.edisoncor.gui.textField.TextField txtPagoHora;
    private javax.swing.JTextArea txtReporte;
    private org.edisoncor.gui.textField.TextField txtRuc;
    // Fin de declaraci�n de variables

    private void controlEditable() {
     this.txtName.setEditable(true);
     this.txtApellidos.setEditable(true);
     this.txtAnosExperiencias.setEditable(true);
     this.txtDireccion.setEditable(true);
     this.txtDni.setEditable(true);
     this.txtEdad.setEditable(true);
     this.txtHorasTraba.setEditable(true);
     this.txtPagoHora.setEditable(true);
     this.txtReporte.setEditable(false);
     this.txtRuc.setEditable(true);
    }
}
