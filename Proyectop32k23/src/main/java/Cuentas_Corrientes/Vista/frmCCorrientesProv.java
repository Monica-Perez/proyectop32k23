/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas_Corrientes.Vista;


//import Seguridad.Vista.*;
import Cuentas_Corrientes.Controlador.clsCCorrientesProv;
import Seguridad.Controlador.clsUsuarioConectado;
import Seguridad.Controlador.clsBitacora;
import Seguridad.Modelo.Conexion;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.Connection;
//import java.sql.ResultSet;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;
//import java.util.Set;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

// REALIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
/**
 *
 * @author visitante
 */
public class frmCCorrientesProv extends javax.swing.JInternalFrame {
    
//int codigoAplicacion=preguntar;

    public void llenadoDeCombos() {
        /*EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        List<Empleado> empleados = empleadoDAO.select();
        cbox_empleado.addItem("Seleccione una opción");
        for (int i = 0; i < empleados.size(); i++) {
            cbox_empleado.addItem(empleados.get(i).getNombreEmpleado());
        } */
    }

public void llenadoDeTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID CCorrientes");
        modelo.addColumn("Tipo de Cuenta");
        modelo.addColumn("ID Tipo Proveedor");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nombre de Proveedor");
        modelo.addColumn("No. Factura");
        modelo.addColumn("Factura");
        modelo.addColumn("Cancelacion");
        modelo.addColumn("Saldo");
        clsCCorrientesProv aplicacion = new clsCCorrientesProv();
        List<clsCCorrientesProv> listaAplicaciones = aplicacion.getListadoCC();
        tablaUsuarios.setModel(modelo);
        String[] dato = new String[9];
        for (int i = 0; i < listaAplicaciones.size(); i++) {
            dato[0] = Integer.toString(listaAplicaciones.get(i).getIdCCorrienteProv());
            dato[1] = listaAplicaciones.get(i).getTipoCCorrienteProv();
            dato[2] = Integer.toString(listaAplicaciones.get(i).getIdTipoCCorrienteProv());
            dato[3] = listaAplicaciones.get(i).getFechaCCorrienteProv();
            dato[4] = listaAplicaciones.get(i).getNombreCCorrienteProv();
            dato[5] = listaAplicaciones.get(i).getNofacturaCCorrienteProv();
            dato[6] = Double.toString(listaAplicaciones.get(i).getFacturaCCorrienteProv());
            dato[7] = Double.toString(listaAplicaciones.get(i).getCancelacionProv());
            dato[8] = Double.toString(listaAplicaciones.get(i).getSaldoCCorrienteProv());
            modelo.addRow(dato);
        }   
    }
    
    int codigoAplicacion= 12;
    public frmCCorrientesProv() {
        initComponents();
        llenadoDeTabla();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2 = new javax.swing.JLabel();
        lbusu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        txtIdtipoC = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtfecha = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        txtbuscado = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        label8 = new javax.swing.JLabel();
        txtnombreC = new javax.swing.JTextField();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        txttotfac = new javax.swing.JTextField();
        txtsaldo = new javax.swing.JTextField();
        label12 = new javax.swing.JLabel();
        txtnofac = new javax.swing.JTextField();
        txttipocuenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cuentas Corrientes Proveedores");
        setToolTipText("");
        setVisible(true);

        tablaUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Vendedor", "ID Empleado", "Correo", "Telefono", "Direccion", "Porcentaje", "Comision"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        txtIdtipoC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtIdtipoC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtIdtipoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdtipoCActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label5.setText("Id proveedor");

        lb.setForeground(new java.awt.Color(204, 204, 204));
        lb.setText(".");

        jButton2.setText("Ayuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label4.setText("ID a buscar");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtfecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtfecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        label1.setText("Cuentas Corrientes Proveedores");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label3.setText("Tipo de Cuenta");

        label6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label6.setText("Fecha");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label8.setText("Nombre de Cuenta");

        txtnombreC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtnombreC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label9.setText("Total Factura");

        label10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label10.setText("Cancelación");

        txttotfac.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txttotfac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txttotfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotfacActionPerformed(evt);
            }
        });

        txtsaldo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtsaldo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label12.setText("No. Factura");

        txtnofac.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtnofac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtnofac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnofacActionPerformed(evt);
            }
        });

        txttipocuenta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txttipocuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txttipocuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipocuentaActionPerformed(evt);
            }
        });

        jButton1.setText("Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(968, 968, 968))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label10)
                            .addComponent(label9)
                            .addComponent(label12)
                            .addComponent(label8)
                            .addComponent(label6)
                            .addComponent(label3)
                            .addComponent(label5))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txttipocuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                    .addComponent(txtIdtipoC)
                                    .addComponent(txtfecha))
                                .addComponent(txttotfac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtsaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnofac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4)
                                .addGap(61, 61, 61)
                                .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(jButton1))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb)
                    .addComponent(label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3)
                        .addGap(12, 12, 12)
                        .addComponent(label5)
                        .addGap(12, 12, 12)
                        .addComponent(label6)
                        .addGap(9, 9, 9)
                        .addComponent(label8)
                        .addGap(7, 7, 7)
                        .addComponent(label12)
                        .addGap(7, 7, 7)
                        .addComponent(label9)
                        .addGap(7, 7, 7)
                        .addComponent(label10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttipocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdtipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtnombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnofac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttotfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // REAIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
         try {
            if ((new File("src\\main\\java\\seguridad\\ayuda\\cc_proveedoresayuda.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\seguridad\\ayuda\\cc_proveedoresayuda.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        llenadoDeTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        // REALIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
        int registrosBorrados=0;
        clsCCorrientesProv transaccion = new clsCCorrientesProv();
        transaccion.setIdCCorrienteProv(Integer.parseInt(txtbuscado.getText()));
        registrosBorrados=transaccion.setBorrarCC(transaccion);
        JOptionPane.showMessageDialog(null, "Registro Borrado\n","Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"DEL");
        llenadoDeTabla();
        limpiarTextos();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // REALIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
        clsCCorrientesProv transaccion = new clsCCorrientesProv();
        transaccion.setTipoCCorrienteProv(txttipocuenta.getText());
        transaccion.setIdTipoCCorrienteProv(Integer.parseInt(txtIdtipoC.getText()));
        transaccion.setFechaCCorrienteProv(txtfecha.getText());
        transaccion.setNombreCCorrienteProv(txtnombreC.getText());
        transaccion.setNofacturaCCorrienteProv(txtnofac.getText());
        double TotalEnFactura = Double.parseDouble(txttotfac.getText());
        transaccion.setFacturaCCorrienteProv(TotalEnFactura);
        double TotalSaldo = Double.parseDouble(txtsaldo.getText());
        transaccion.setCancelacionProv(TotalSaldo);
        transaccion.setSaldoCCorrienteProv(TotalSaldo-TotalEnFactura);
        transaccion.setIngresarCC(transaccion);
        JOptionPane.showMessageDialog(null, "Registro Ingresado\n", "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "INS");
        llenadoDeTabla();
        limpiarTextos();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        // REALIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
        clsCCorrientesProv transaccion = new clsCCorrientesProv();
        //aplicacion.setNombreAplicacion(txtbuscado.getText());
        transaccion.setIdTipoCCorrienteProv(Integer.parseInt(txtbuscado.getText()));
        transaccion = transaccion.getBuscarInformacionCCProvPorId(transaccion);
        System.out.println("Cuenta Corriente retornada:" + transaccion);
        txttipocuenta.setText(transaccion.getTipoCCorrienteProv());
        txtIdtipoC.setText(String.valueOf(transaccion.getIdTipoCCorrienteProv()));
        txtfecha.setText(transaccion.getFechaCCorrienteProv());
        txtnombreC.setText(transaccion.getNombreCCorrienteProv());
        txtnofac.setText(transaccion.getNofacturaCCorrienteProv());
        txttotfac.setText(String.valueOf(transaccion.getFacturaCCorrienteProv()));
        txtsaldo.setText(String.valueOf(transaccion.getCancelacionProv()));
        txtdeuda.setText(String.valueOf(transaccion.getSaldoCCorrienteProv()));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //TODO add your handling code here:
        // REALIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
        clsCCorrientesProv transaccion = new clsCCorrientesProv();
        transaccion.setIdCCorrienteProv(Integer.parseInt(txtbuscado.getText()));
        transaccion.setTipoCCorrienteProv(txttipocuenta.getText());
        transaccion.setIdTipoCCorrienteProv(Integer.parseInt(txtIdtipoC.getText()));
        transaccion.setFechaCCorrienteProv(txtfecha.getText());
        transaccion.setNombreCCorrienteProv(txtnombreC.getText());
        transaccion.setNofacturaCCorrienteProv(txtnofac.getText());
        transaccion.setFacturaCCorrienteProv(Double.parseDouble(txttotfac.getText()));
        transaccion.setCancelacionProv(Double.parseDouble(txtsaldo.getText()));
        transaccion.setSaldoCCorrienteProv(Double.parseDouble(txtdeuda.getText()));
        transaccion.setModificarCC(transaccion);
        JOptionPane.showMessageDialog(null, "Registro Modificado\n", "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "UPD");
        llenadoDeTabla();
        limpiarTextos();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTextos();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txttotfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotfacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotfacActionPerformed

    private void txtnofacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnofacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnofacActionPerformed

    private void txtIdtipoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdtipoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdtipoCActionPerformed

    private void txttipocuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipocuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipocuentaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // REALIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
        Connection conn = null;        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            conn = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/seguridad/reportes/ReporteProveedores.jrxml");
	    print = JasperFillManager.fillReport(report, p, conn);
            JasperViewer view = new JasperViewer(print, false);
	    view.setTitle("Reporte CC Proveedores");
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void limpiarTextos()
    {
        // REALIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
        txttipocuenta.setText("");
        txtIdtipoC.setText("");
        txtfecha.setText("");
        txtnombreC.setText("");
        txtnofac.setText("");
        txttotfac.setText("");
        txtsaldo.setText("");
        txtdeuda.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbusu;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtIdtipoC;
    private javax.swing.JTextField txtbuscado;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnofac;
    private javax.swing.JTextField txtnombreC;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txttipocuenta;
    private javax.swing.JTextField txttotfac;
    // End of variables declaration//GEN-END:variables
}
