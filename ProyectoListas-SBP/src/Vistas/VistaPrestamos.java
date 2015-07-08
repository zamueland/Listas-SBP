/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.ListaPrestamos;
import controlador.Prestamos;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.ScrollPane;

/**
 *
 * @author Zamuel
 */
public class VistaPrestamos extends javax.swing.JFrame {
    private ListaPrestamos listaPrestamos;
    
    
    public void setLocationRelativeto(Component c){
        super.setLocationRelativeTo(c);
    }
    
    public VistaPrestamos() {
        this.setTitle("Préstamos");
        initComponents();
        listaPrestamos = new ListaPrestamos();
        panel.setViewportView(new PanelDibujoPrestamos(listaPrestamos.size(), "ge", listaPrestamos));
        setLocationRelativeTo(this);
    }
    

    public void establecerClienteInicio(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de nodo a ingresar")) ;
        Prestamos pre = new Prestamos (CodigoPrestamo.getText(),CodigoLibro.getText(),Cedula.getText(),FechaSalida.getText(),FechaMaximaDevolucion.getText());
        listaPrestamos.insertarInicio(pre, valor);
        JOptionPane.showMessageDialog(null,"Se agregó un elemento a la lista");
        CodigoPrestamo.setText(null);
        CodigoLibro.setText(null);
        Cedula.setText(null);
        FechaSalida.setText(null);
        FechaMaximaDevolucion.setText(null);
        panel.setViewportView(new PanelDibujoPrestamos(listaPrestamos.size(), "", listaPrestamos));
        
     }
    
    public void buscar(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave de nodo a buscar")) ;
        if(listaPrestamos.buscar(valor)!= null)
        JOptionPane.showMessageDialog(null,listaPrestamos.buscar(valor).dato );
        else
            JOptionPane.showMessageDialog(null,"El elemento no existe" );
    }
    
    public void buscarPrestamo(){
        String CodigoPrestamo =JOptionPane.showInputDialog("Ingrese Código del Préstamo a buscar") ;
        if(listaPrestamos.buscarDato(CodigoPrestamo) != null)
        JOptionPane.showMessageDialog(null,listaPrestamos.buscarDato(CodigoPrestamo).dato);
        else
            JOptionPane.showMessageDialog(null," El Elemento no existe" );
    }
    
    
    
    public void mostrar(){
        jTextArea1.setText(listaPrestamos.print());
        panel.setViewportView(new PanelDibujoPrestamos(listaPrestamos.size(), "", listaPrestamos));
    }
    //Eliminar por clave
    public void eliminar(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave de elemento a eliminar:")) ;
        listaPrestamos.eliminarNodoClave(valor);
        panel.setViewportView(new PanelDibujoPrestamos(listaPrestamos.size(), "", listaPrestamos));
         JOptionPane.showMessageDialog(null, "Se eliminó el elemento");
    }
    
    public void eliminar2(){
        listaPrestamos.eliminarLista();
        
        panel.setViewportView(new PanelDibujoPrestamos(listaPrestamos.size(), "", listaPrestamos));
        JOptionPane.showMessageDialog(null, "Lista Eliminada");
    }
    

    
    
    public void operacioneComboBox() {
        if (menuoperaciones.getSelectedItem().equals("Eliminar Elemento")) {
            eliminar();
           
        } 
        if(menuoperaciones.getSelectedItem().equals("Eliminar Lista")){
            eliminar2();
            
        }
        
        if (menuoperaciones.getSelectedItem().equals("Eliminar Inicio")) {
            listaPrestamos.eliminarInicio();
            panel.setViewportView(new PanelDibujoPrestamos(listaPrestamos.size(), "", listaPrestamos));
           
        }
        if (menuoperaciones.getSelectedItem().equals("Eliminar Final")) {
            listaPrestamos.eliminarFinal();
           panel.setViewportView(new PanelDibujoPrestamos(listaPrestamos.size(), "", listaPrestamos));
        }

        if(menuoperaciones.getSelectedItem().equals("Insertar Elemento")){
            establecerClienteInicio();
            
        }
        
        if(menuoperaciones.getSelectedItem().equals("Contar Elementos")){
            JOptionPane.showMessageDialog(null, "El tamaño de la lista es:" + (listaPrestamos.size()));
        }
        
        if(menuoperaciones.getSelectedItem().equals("Modificar Elemento")){
            int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave del elemento a modificar"));
            Prestamos pre = new Prestamos (CodigoPrestamo.getText(),CodigoLibro.getText(),Cedula.getText(),FechaSalida.getText(),FechaMaximaDevolucion.getText());
            listaPrestamos.modificar(valor, pre);
            panel.setViewportView(new PanelDibujoPrestamos(listaPrestamos.size(), "", listaPrestamos));
        }
        
        if(menuoperaciones.getSelectedItem().equals("Buscar por Código del Préstamo")){
            
            buscarPrestamo();
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CodigoPrestamo = new javax.swing.JTextField();
        Cedula = new javax.swing.JTextField();
        CodigoLibro = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        mostrar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        menuoperaciones = new javax.swing.JComboBox();
        calcular = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel = new javax.swing.JScrollPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FechaSalida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FechaMaximaDevolucion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CodigoPrestamo.setToolTipText("Dijita el Código del Préstamo");
        CodigoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoPrestamoActionPerformed(evt);
            }
        });

        Cedula.setToolTipText("Dijita la Cédula del Lector");
        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });

        CodigoLibro.setToolTipText("Dijita el Código del Libro");
        CodigoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoLibroActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.setToolTipText("Busca por clave de el nodo");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        mostrar.setText("Mostrar");
        mostrar.setToolTipText("Muestra los nodos Ingresados");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        jButton6.setText("Limpiar");
        jButton6.setToolTipText("Limpia la tabla de Nodos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.setToolTipText("Sale del Sistema");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        menuoperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Insertar Elemento", "Modificar Elemento", "Buscar por Código del Préstamo", "Contar Elementos", "Eliminar Elemento", "Eliminar Inicio", "Eliminar Final", "Eliminar Lista", " " }));
        menuoperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuoperacionesActionPerformed(evt);
            }
        });

        calcular.setText("Aceptar");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel1.setText("* Código del Préstamo:");

        jLabel2.setText("* Cédula:");

        jLabel3.setText("* Código del Libro:");

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setText("Préstamos");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(202, 37, 37));
        jLabel7.setText("Grafico:");

        FechaSalida.setToolTipText("Día/Mes/Año");
        FechaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaSalidaActionPerformed(evt);
            }
        });

        jLabel8.setText("* Fecha de Salida:");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Campos marcados con asterisco (*) son obligatorios");

        FechaMaximaDevolucion.setToolTipText("Día/Mes/Año");
        FechaMaximaDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaMaximaDevolucionActionPerformed(evt);
            }
        });

        jLabel9.setText("* Fecha Máxima de Devolución:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(menuoperaciones, 0, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(CodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(FechaMaximaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(36, 36, 36)
                                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel6)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaMaximaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buscar)
                        .addGap(58, 58, 58)
                        .addComponent(mostrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(salir))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuoperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoPrestamoActionPerformed

    private void menuoperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuoperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuoperacionesActionPerformed

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_mostrarActionPerformed

   //limpiar
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        
        if (CodigoPrestamo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa el Código del Préstamo");
        } else if (FechaSalida.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa la Fecha de Salida");
        } else if (Cedula.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa tu Cédula");
        } else if (CodigoLibro.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa el Código del Libro");
        } else if (FechaMaximaDevolucion.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa la Fecha Máxima de Devolución");
        } else {
            operacioneComboBox();
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_buscarActionPerformed

    private void FechaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaSalidaActionPerformed

    private void CodigoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoLibroActionPerformed

    private void FechaMaximaDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaMaximaDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaMaximaDevolucionActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrestamos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField CodigoLibro;
    private javax.swing.JTextField CodigoPrestamo;
    private javax.swing.JTextField FechaMaximaDevolucion;
    private javax.swing.JTextField FechaSalida;
    private javax.swing.JButton buscar;
    private javax.swing.JToggleButton calcular;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox menuoperaciones;
    private javax.swing.JButton mostrar;
    private javax.swing.JScrollPane panel;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
