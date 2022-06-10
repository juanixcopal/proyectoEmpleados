package guiPrograma_Empleados;

public class guiSistema_empleados_menu extends javax.swing.JFrame {

    /**
     * Crea nuevo formulario guiSistema_empleados_menu
     */
    public guiSistema_empleados_menu() {
        initComponents();
        // esto para centrar en la pantalla la aplicación 
       this.setLocationRelativeTo(null);
       setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        labelBackgroundTitle1 = new org.edisoncor.gui.label.LabelBackgroundTitle();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        btnPlanilla = new org.edisoncor.gui.button.ButtonTask();
        btnRecibo = new org.edisoncor.gui.button.ButtonTask();
        btnPlanilla1 = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.png"))); // NOI18N

        labelHeader1.setBackground(new java.awt.Color(255, 255, 255));
        labelHeader1.setText("SISTEMA DE REPORTE DE EMPLEADOS");
        labelHeader1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelHeader1.setFont(new java.awt.Font("Engravers MT", 1, 28)); // NOI18N

        btnPlanilla.setBackground(new java.awt.Color(51, 51, 51));
        btnPlanilla.setText("PLANILLA");
        btnPlanilla.setDescription("Formulario ");
        btnPlanilla.setFont(new java.awt.Font("Franklin Gothic Heavy", 3, 48)); // NOI18N
        btnPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanillaActionPerformed(evt);
            }
        });

        btnRecibo.setText("RECIBO");
        btnRecibo.setDescription("Formulario");
        btnRecibo.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 48)); // NOI18N
        btnRecibo.setPreferredSize(new java.awt.Dimension(274, 64));
        btnRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciboActionPerformed(evt);
            }
        });

        btnPlanilla1.setBackground(new java.awt.Color(51, 51, 51));
        btnPlanilla1.setText("SALIR");
        btnPlanilla1.setDescription("Sistema");
        btnPlanilla1.setFont(new java.awt.Font("Franklin Gothic Heavy", 3, 18)); // NOI18N
        btnPlanilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanilla1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btnPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204)
                        .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addComponent(btnPlanilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlanilla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
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

    private void btnPlanillaActionPerformed(java.awt.event.ActionEvent evt) {
        // agregar el código de manejo aquí
        this.setVisible(false);
        guiPlanilla p = new guiPlanilla();
        p.setVisible(true);
    }

    private void btnReciboActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
         guiRecibo r = new guiRecibo();
         r.setVisible(true);
    }

    private void btnPlanilla1ActionPerformed(java.awt.event.ActionEvent evt) {
        // agregar el código de manejo aquí
        dispose();
    }

    /**
     * los argumentos de la línea de comando
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiSistema_empleados_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiSistema_empleados_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiSistema_empleados_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiSistema_empleados_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiSistema_empleados_menu().setVisible(true);
            }
        });
    }

    // Declaración de variables - no modificar
    private org.edisoncor.gui.button.ButtonTask btnPlanilla;
    private org.edisoncor.gui.button.ButtonTask btnPlanilla1;
    private org.edisoncor.gui.button.ButtonTask btnRecibo;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private org.edisoncor.gui.label.LabelBackgroundTitle labelBackgroundTitle1;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    // Fin de declaración de variables
}
