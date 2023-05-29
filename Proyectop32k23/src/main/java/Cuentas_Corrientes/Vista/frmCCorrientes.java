/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas_Corrientes.Vista;


import Cuentas_Corrientes.Controlador.clsCCorrientes;
import Seguridad.Controlador.clsUsuarioConectado;
import Seguridad.Controlador.clsBitacora;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import Seguridad.Modelo.Conexion;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

//REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840

/**
 *
 * @author visitante
 */
public class frmCCorrientes extends javax.swing.JInternalFrame {
    
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
        modelo.addColumn("ID Tipo Cuenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nombre de Cuenta");
        modelo.addColumn("No. Factura");
        modelo.addColumn("Total Factura");
        modelo.addColumn("Saldo");
        modelo.addColumn("Deuda");
        clsCCorrientes aplicacion = new clsCCorrientes();
        List<clsCCorrientes> listaAplicaciones = aplicacion.getListadoCC();
        tablaUsuarios.setModel(modelo);
        String[] dato = new String[9];
        for (int i = 0; i < listaAplicaciones.size(); i++) {
            dato[0] = Integer.toString(listaAplicaciones.get(i).getIdCCorriente());
            dato[1] = listaAplicaciones.get(i).getTipoCCorriente();
            dato[2] = Integer.toString(listaAplicaciones.get(i).getIdTipoCCorriente());
            dato[3] = listaAplicaciones.get(i).getFechaCCorriente();
            dato[4] = listaAplicaciones.get(i).getNombreCCorriente();
            dato[5] = listaAplicaciones.get(i).getNoFacturaCCorriente();
            dato[6] = listaAplicaciones.get(i).getFacturaCCorriente();
            dato[7] = listaAplicaciones.get(i).getSaldoCCorriente();
            dato[8] = listaAplicaciones.get(i).getDeudaCCorriente();
            modelo.addRow(dato);
        }   
    }
    
    int codigoAplicacion= 12;
    public frmCCorrientes() {
        initComponents();
        llenadoDeTabla();
        llenadoDeCombos();
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
        txtTipoC = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        label8 = new javax.swing.JLabel();
        txtnombreC = new javax.swing.JTextField();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        txttotfac = new javax.swing.JTextField();
        txtsaldo = new javax.swing.JTextField();
        label11 = new javax.swing.JLabel();
        txtdeuda = new javax.swing.JTextField();
        label12 = new javax.swing.JLabel();
        txtnofac = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cuentas Corrientes Clientes");
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

        label5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label5.setText("Id Tipo Cuenta");

        jButton2.setText("Ayuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
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
        label1.setText("Cuentas Corrientes Clientes");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label3.setText("Tipo de Cuenta");

        txtTipoC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTipoC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label6.setText("Fecha");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label8.setText("Nombre de Cuenta");

        txtnombreC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtnombreC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label9.setText("Total Factura");

        label10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label10.setText("Saldo");

        txttotfac.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txttotfac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txttotfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotfacActionPerformed(evt);
            }
        });

        txtsaldo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtsaldo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label11.setText("Deuda");

        txtdeuda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtdeuda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label12.setText("No. Factura");

        txtnofac.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtnofac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtnofac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnofacActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(label1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(57, 57, 57)
                                .addComponent(txtTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label11)
                                    .addGap(107, 107, 107)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txttotfac)
                                        .addComponent(txtsaldo)
                                        .addComponent(txtdeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(label5)
                                .addComponent(label6)
                                .addComponent(label8)
                                .addComponent(label12)
                                .addComponent(label9)
                                .addComponent(label10)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(146, 146, 146)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnofac)
                                            .addComponent(txtfecha)
                                            .addComponent(txtnombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtIdtipoC, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(label4)
                        .addGap(36, 36, 36)
                        .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(276, 276, 276))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(txtTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(txtIdtipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnofac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttotfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdeuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(jButton2))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840
        try {
            if ((new File("src\\main\\java\\seguridad\\ayuda\\cc_clientesayuda.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\seguridad\\ayuda\\cc_clientesayuda.chm");
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
        //REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840
        int registrosBorrados=0;
        clsCCorrientes transaccion = new clsCCorrientes();
        transaccion.setIdCCorriente(Integer.parseInt(txtbuscado.getText()));
        registrosBorrados=transaccion.setBorrarCC(transaccion);
        JOptionPane.showMessageDialog(null, "Registro Borrado\n","Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"DEL");
        llenadoDeTabla();
        limpiarTextos();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840
        clsCCorrientes transaccion = new clsCCorrientes();
        transaccion.setTipoCCorriente(txtTipoC.getText());
        transaccion.setIdTipoCCorriente(Integer.parseInt(txtIdtipoC.getText()));
        transaccion.setFechaCCorriente(txtfecha.getText());
        transaccion.setNombreCCorriente(txtnombreC.getText());
        transaccion.setNoFacturaCCorriente(txtnofac.getText());
        transaccion.setFacturaCCorriente(txttotfac.getText());
        transaccion.setSaldoCCorriente(txtsaldo.getText());
        transaccion.setDeudaCCorriente(txtdeuda.getText());
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
        //REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840
        clsCCorrientes transaccion = new clsCCorrientes();
        //aplicacion.setNombreAplicacion(txtbuscado.getText());
        transaccion.setIdCCorriente(Integer.parseInt(txtbuscado.getText()));
        transaccion = transaccion.getBuscarInformacionCCPorId(transaccion);
        System.out.println("Cuenta Corriente retornada:" + transaccion);
        txtTipoC.setText(transaccion.getTipoCCorriente());
        txtIdtipoC.setText(String.valueOf(transaccion.getIdTipoCCorriente()));
        txtfecha.setText(transaccion.getFechaCCorriente());
        txtnombreC.setText(transaccion.getNombreCCorriente());
        txtnofac.setText(transaccion.getNoFacturaCCorriente());
        txttotfac.setText(transaccion.getFechaCCorriente());
        txtsaldo.setText(transaccion.getSaldoCCorriente());
        txtdeuda.setText(transaccion.getDeudaCCorriente());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //TODO add your handling code here:
        //REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840
        clsCCorrientes transaccion = new clsCCorrientes();
        transaccion.setIdCCorriente(Integer.parseInt(txtbuscado.getText()));
        transaccion.setTipoCCorriente(txtTipoC.getText());
        transaccion.setIdTipoCCorriente(Integer.parseInt(txtIdtipoC.getText()));
        transaccion.setFechaCCorriente(txtfecha.getText());
        transaccion.setNombreCCorriente(txtnombreC.getText());
        transaccion.setNoFacturaCCorriente(txtnofac.getText());
        transaccion.setFacturaCCorriente(txttotfac.getText());
        transaccion.setSaldoCCorriente(txtsaldo.getText());
        transaccion.setDeudaCCorriente(txtdeuda.getText());
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840
        Connection conn = null;        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            conn = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/seguridad/reportes/ReporteClientes.jrxml");
	    print = JasperFillManager.fillReport(report, p, conn);
            JasperViewer view = new JasperViewer(print, false);
	    view.setTitle("Reporte CC Clientes");
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void limpiarTextos()
    {
        //REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840
        txtTipoC.setText("");
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
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbusu;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtIdtipoC;
    private javax.swing.JTextField txtTipoC;
    private javax.swing.JTextField txtbuscado;
    private javax.swing.JTextField txtdeuda;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnofac;
    private javax.swing.JTextField txtnombreC;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txttotfac;
    // End of variables declaration//GEN-END:variables
}
