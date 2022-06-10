package guiPrograma_Empleados;
import javax.swing.JOptionPane;
import trabajo_Herencia_proyecto.Logging;

public class Usuarios extends javax.swing.JFrame {

    /**
     * Crea nuevo formulario Usuarios
     */
    public Usuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        labelTask1 = new org.edisoncor.gui.label.LabelTask();
        txtUsuario = new org.edisoncor.gui.textField.TextFieldRound();
        labelTask2 = new org.edisoncor.gui.label.LabelTask();
        txtPassword = new org.edisoncor.gui.passwordField.PasswordFieldRoundBackground();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N
        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.jpg"))); // NOI18N

        labelTask1.setForeground(new java.awt.Color(255, 255, 255));
        labelTask1.setText("USUARIO:");
        labelTask1.setDescription("-----------------");
        labelTask1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        labelTask1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        labelTask2.setForeground(new java.awt.Color(255, 255, 255));
        labelTask2.setText("PASSWORD:");
        labelTask2.setDescription("Ingresar");
        labelTask2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        labelTask2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtPassword.setDescripcion("ingrese el codigo");

        buttonAction1.setText("INICIAR");
        buttonAction1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });

        buttonAction2.setText("SALIR");
        buttonAction2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        buttonAction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(labelTask2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelTask2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Llame a la clase Registro1
       Logging l = new Logging();
       //El método trim () en la cadena java verifica este valor de descodificación antes y después de la cadena,
       //si existe, elimina los espacios en blanco y devuelve la cadena omitida.
       String mens = l.logging_usuario(txtUsuario.getText().trim(), txtPassword.getText());
       
       if (mens.equals("Invalido"))
           JOptionPane.showMessageDialog(null, mens);
       else 
       {
           // mostrar el mensaje de los hombres;
           JOptionPane.showMessageDialog(null, mens);
           //   si no es "Invalido", abre el menú principal 
           new guiSistema_empleados_menu().setVisible(true); 
           dispose();
       }
    }

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
        // agregar el código de manejo aquí:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {
        // agregar el código de manejo aquí:
        dispose();
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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Declaración de variables - no modificar
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private org.edisoncor.gui.label.LabelTask labelTask1;
    private org.edisoncor.gui.label.LabelTask labelTask2;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundBackground txtPassword;
    private org.edisoncor.gui.textField.TextFieldRound txtUsuario;
    // Fin de la declaración de variables
}
