/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contratos;

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
public class Contratos extends javax.swing.JFrame {
    conexion db=new conexion();
    TryParse tp=new TryParse();
    /**
     * Creates new form Contratos
     */
    public Contratos() {
        initComponents();
        botonesradio();
        db.mostrarcontratos(tabla);
        db.mostrarcontratoscliente(tabla2);
    }
        @Override
            public Image getIconImage() {
                Image retValue = Toolkit.getDefaultToolkit().
                        getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));


                return retValue;
        }
    private void botonesradio(){
        ButtonGroup gp =new ButtonGroup();
    gp.add(r2);
    gp.add(r3);
    gp.add(r4);
    gp.add(r5);
    gp.add(r6);
    gp.add(r1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        crear = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        folio = new javax.swing.JTextField();
        fecha_comienzo = new javax.swing.JTextField();
        fecha_termino = new javax.swing.JTextField();
        patente_auto = new javax.swing.JTextField();
        cod_sucursal = new javax.swing.JTextField();
        rut = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        editar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        folio1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        entrada = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        logo1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        eliminar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        folio2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        logo2 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();
        ver = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contrato 100% legal");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Folio: ");
        crear.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Fecha comienzo:");
        crear.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Fecha termino:");
        crear.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Patente auto:");
        crear.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Cod sucursal:");
        crear.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Rut cliente:");
        crear.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 70, 20));
        crear.add(folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, -1));
        crear.add(fecha_comienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 100, -1));
        crear.add(fecha_termino, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 100, -1));
        crear.add(patente_auto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 100, -1));
        crear.add(cod_sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 100, -1));
        crear.add(rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 100, -1));

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        crear.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        crear.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 190, 80));

        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        crear.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("crear", crear);

        editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Folio: ");
        editar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, 20));
        editar.add(folio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 100, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("nuevo valor:");
        editar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 80, 20));
        editar.add(entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 100, -1));

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        editar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        r2.setForeground(new java.awt.Color(240, 240, 240));
        r2.setText("rut cliente");
        editar.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        r3.setForeground(new java.awt.Color(240, 240, 240));
        r3.setText("fecha comienzo");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        editar.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        r4.setForeground(new java.awt.Color(240, 240, 240));
        r4.setText("fecha termino");
        editar.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        r5.setForeground(new java.awt.Color(240, 240, 240));
        r5.setText("patente auto");
        editar.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        r6.setForeground(new java.awt.Color(240, 240, 240));
        r6.setText("codigo sucursal");
        editar.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        r1.setForeground(new java.awt.Color(240, 240, 240));
        r1.setText("Folio");
        editar.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        editar.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 190, 80));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        editar.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("editar", editar);

        eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Folio: ");
        eliminar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, 20));
        eliminar.add(folio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 100, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        eliminar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        eliminar.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 190, 80));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        eliminar.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("elimnar", eliminar);

        ver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "folio", "n_cliente", "f_comienzo", "f_termino", "p_auto", "sucursal"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        ver.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 430));

        jTabbedPane1.addTab("ver todo", ver);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "folio", "nombre cliente"
            }
        ));
        jScrollPane2.setViewportView(tabla2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        jTabbedPane1.addTab("ver cliente/ contrato", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(tp.TryInt(folio.getText())==true || tp.TryInt(cod_sucursal.getText())==true){
                db.insertarcontrato(Integer.valueOf(folio.getText()), rut.getText(), fecha_comienzo.getText(), fecha_termino.getText(), patente_auto.getText(), Integer.valueOf(cod_sucursal.getText()));
        }else {
            JOptionPane.showMessageDialog (null, "los siguientes campos tienen que ser tipo numerico:\n"
                    + "*folio\n*codigo sucursal", "Modifique campo", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (r1.isSelected()==true){
            db.editarcontrato(entrada.getText(), Integer.valueOf(folio1.getText()), 1);
        }
        if (r2.isSelected()==true){
            db.editarcontrato(entrada.getText(), Integer.valueOf(folio1.getText()), 2);
        }
        if (r3.isSelected()==true){
            db.editarcontrato(entrada.getText(), Integer.valueOf(folio1.getText()), 3);
        }
        if (r4.isSelected()==true){
            db.editarcontrato(entrada.getText(), Integer.valueOf(folio1.getText()), 4);
        }
        if (r5.isSelected()==true){
            db.editarcontrato(entrada.getText(), Integer.valueOf(folio1.getText()), 5);
        }
        if (r6.isSelected()==true){
            db.editarcontrato(entrada.getText(), Integer.valueOf(folio1.getText()), 6);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(tp.TryInt(folio2.getText())==true){
            db.eliminarcontrato(Integer.valueOf(folio2.getText()));
        }else{
            JOptionPane.showMessageDialog (null, "El folio es un campo numerico", "Modifique campo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Contratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cod_sucursal;
    private javax.swing.JPanel crear;
    private javax.swing.JPanel editar;
    private javax.swing.JPanel eliminar;
    private javax.swing.JTextField entrada;
    private javax.swing.JTextField fecha_comienzo;
    private javax.swing.JTextField fecha_termino;
    private javax.swing.JTextField folio;
    private javax.swing.JTextField folio1;
    private javax.swing.JTextField folio2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JTextField patente_auto;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JTextField rut;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JPanel ver;
    // End of variables declaration//GEN-END:variables
}
