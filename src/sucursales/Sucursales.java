/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursales;

import conexion.conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import tryparse.TryParse;

/**
 *
 * @author Sebastian
 */
public class Sucursales extends javax.swing.JFrame {
    conexion db=new conexion();
    TryParse tp=new TryParse();
    /**
     * Creates new form Sucursales
     */
    public Sucursales() {
        initComponents();
        db.mostrarsucursal(tabla);
        radioBoton();
    }
        @Override
            public Image getIconImage() {
                Image retValue = Toolkit.getDefaultToolkit().
                        getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));


                return retValue;
        }
    private void radioBoton(){
        checkCodigo.setSelected(true);
        checkNombre.setSelected(true);
        checkTelefono.setSelected(true);
        checkDireccion.setSelected(true);
        checkCodigo.setEnabled(false);
        ButtonGroup bt=new ButtonGroup();
        bt.add(r1);
        bt.add(r3);
        bt.add(r4);
        bt.add(r2);
        r1.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JTabbedPane();
        crear = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        checkTelefono = new javax.swing.JCheckBox();
        checkDireccion = new javax.swing.JCheckBox();
        checkCodigo = new javax.swing.JCheckBox();
        checkNombre = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        borrar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        codigo1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        logo1 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();
        editar = new javax.swing.JPanel();
        codigo2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        entrada = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        ver = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        entrada2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sucursales sin baños");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Codigo sucursal:");
        crear.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        crear.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 80, 30));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        crear.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Nombre sucursal:");
        crear.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        crear.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Direccion:");
        crear.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        crear.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("telefono:");
        crear.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));
        crear.add(checkTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));
        crear.add(checkDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        crear.add(checkCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        crear.add(checkNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        crear.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        crear.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 190, 80));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        crear.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pane.addTab("agregar", crear);

        borrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Codigo sucursal:");
        borrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        codigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo1ActionPerformed(evt);
            }
        });
        borrar.add(codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 80, 30));

        jButton2.setText("eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        borrar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        borrar.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 190, 80));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        borrar.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pane.addTab("borrar", borrar);

        editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo2ActionPerformed(evt);
            }
        });
        editar.add(codigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("codigo:");
        editar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 20));

        r1.setForeground(new java.awt.Color(240, 240, 240));
        r1.setText("codigo");
        editar.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        r2.setForeground(new java.awt.Color(240, 240, 240));
        r2.setText("nombre");
        editar.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        r3.setForeground(new java.awt.Color(240, 240, 240));
        r3.setText("direccion");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        editar.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        r4.setForeground(new java.awt.Color(240, 240, 240));
        r4.setText("numero");
        editar.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jButton3.setText("editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        editar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));
        editar.add(entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 100, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("nuevo valor:");
        editar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 20));

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        editar.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 190, 80));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        editar.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pane.addTab("editar", editar);

        ver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "codigo", "nombre", "direccion", "telefono"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        ver.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, 410));

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ver.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 90, 30));
        ver.add(entrada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 120, 30));

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ver.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        ver.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pane.addTab("ver", ver);

        getContentPane().add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String nombre1="",telefono1="",direccion1="";
        if(tp.TryInt(codigo.getText())==true && tp.TryInt(telefono.getText())==true){
            int codigo1=Integer.valueOf(codigo.getText());
            if (checkNombre.isSelected()==true){
            nombre1=nombre.getText();
            }
            if(checkTelefono.isSelected()==true){
            telefono1=telefono.getText();
            }
            if (checkDireccion.isSelected()==true){
            direccion1=direccion.getText();
            }
            db.insertarsucursal(codigo1, nombre1, direccion1, Integer.valueOf(telefono1));
        }else{
        JOptionPane.showMessageDialog (null, "Uno se los siguientes datos tiene que ser tipo numerico:"
                + "\n*codigo\n*telefono", "Modifique campo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void codigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(tp.TryInt(codigo1.getText())==true){
            db.eliminarsucursal(Integer.valueOf(codigo1.getText()));
        }else {
            JOptionPane.showMessageDialog (null, "El codigo debe ser numerico", "Modifique campo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(tp.TryInt(codigo2.getText())==true){
            if (r1.isSelected()==true){
                db.editarsucursal(entrada.getText(), Integer.valueOf(codigo2.getText()), 1);
            }
            if (r2.isSelected()==true){
                db.editarsucursal(entrada.getText(), Integer.valueOf(codigo2.getText()), 2);
            }
            if (r3.isSelected()==true){
                db.editarsucursal(entrada.getText(), Integer.valueOf(codigo2.getText()), 3);
            }
            if (r4.isSelected()==true){
                db.editarsucursal(entrada.getText(), Integer.valueOf(codigo2.getText()), 4);
            }
        }else {
        JOptionPane.showMessageDialog (null, "El codigo tiene que ser numerico", "Modifique campo", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void codigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i <= 99; i++) {
            tabla.setValueAt(" ",i,0);
            tabla.setValueAt(" ",i,1);
            tabla.setValueAt(" ",i,2);
            tabla.setValueAt(" ",i,3);
        }
        db.buscarsucursal(tabla, entrada2.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i <= 99; i++) {
            tabla.setValueAt(" ",i,0);
            tabla.setValueAt(" ",i,1);
            tabla.setValueAt(" ",i,2);
            tabla.setValueAt(" ",i,3);
        }
        db.mostrarsucursal(tabla);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sucursales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borrar;
    private javax.swing.JCheckBox checkCodigo;
    private javax.swing.JCheckBox checkDireccion;
    private javax.swing.JCheckBox checkNombre;
    private javax.swing.JCheckBox checkTelefono;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField codigo1;
    private javax.swing.JTextField codigo2;
    private javax.swing.JPanel crear;
    private javax.swing.JTextField direccion;
    private javax.swing.JPanel editar;
    private javax.swing.JTextField entrada;
    private javax.swing.JTextField entrada2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTabbedPane pane;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    private javax.swing.JPanel ver;
    // End of variables declaration//GEN-END:variables
}
