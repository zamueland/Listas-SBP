/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.ListaUsuario;
import controlador.Usuario;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.ScrollPane;

/**
 *
 * @author Zamuel
 */
public class VistaUsuario extends javax.swing.JFrame {
    private ListaUsuario listaUsuario;
    
    public void setLocationRelativeto(Component c){
        super.setLocationRelativeTo(c);
    }
    
    public VistaUsuario() {
        this.setTitle("Gestión de Usuarios");
        initComponents();
        listaUsuario = new ListaUsuario();
        panel.setViewportView(new PanelDibujoUsuario(listaUsuario.size(), "gee", listaUsuario));
        setLocationRelativeTo(this);
    }
    
// En realidad es Usuario, no cliente. 
    public void establecerClienteInicio(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de nodo a ingresar")) ;
        Usuario usu = new Usuario(cedula.getText(),apellido.getText(),nombre.getText(),Telefono.getText(),Celular.getText(),Perfil.getSelectedItem().toString(),FechaNacimiento.getText(),CorreoElectronico.getText(),Contraseña.getPassword().toString(),ConfirmarContraseña.getPassword().toString());
        listaUsuario.insertarInicio(usu, valor);
        JOptionPane.showMessageDialog(null,"Se agregó un elemento a la lista");
        cedula.setText(null);
        apellido.setText(null);
        nombre.setText(null);
        Telefono.setText(null);
        Celular.setText(null);
        Perfil.setSelectedItem(null);
        FechaNacimiento.setText(null);
        CorreoElectronico.setText(null);
        Contraseña.setText(null);
        ConfirmarContraseña.setText(null);
        panel.setViewportView(new PanelDibujoUsuario(listaUsuario.size(), "", listaUsuario));
        
        
        //panel.set(new Dibujo());
     }
    //Buscar por la clave del nodo, le pide en que nodo lo quiere ingresar. 
    public void buscar(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave de nodo a buscar")) ;
        if(listaUsuario.buscar(valor)!= null)
        JOptionPane.showMessageDialog(null,listaUsuario.buscar(valor).dato );
        else
            JOptionPane.showMessageDialog(null,"elemento no existe" );
    }
    // Busca por la cédula del usuario 
    
    public void buscarCedula(){
        String cedula =JOptionPane.showInputDialog("Ingrese cedula de nodo a buscar") ;
        if(listaUsuario.buscarDato(cedula) != null)
        JOptionPane.showMessageDialog(null,listaUsuario.buscarDato(cedula).dato);
        else
            JOptionPane.showMessageDialog(null,"elemento no existe" );
    }
    
    
    //Muestra los nodos que ya estan ingresados. 
    public void mostrar(){
        jTextArea1.setText(listaUsuario.print());
        panel.setViewportView(new PanelDibujoUsuario(listaUsuario.size(), "", listaUsuario));
    }
    
    //Eliminar por clave del nodo. 
    public void eliminar(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave de elemento a eliminar:")) ;
        listaUsuario.eliminarNodoClave(valor);
        panel.setViewportView(new PanelDibujoUsuario(listaUsuario.size(), "", listaUsuario));
         JOptionPane.showMessageDialog(null, "Se eliminó el elemento");
    }
    // Este Elimina todos los nodos de la lista, o sea la LISTA. TODO, TODO, TODO. 
    
    public void eliminar2(){
        listaUsuario.eliminarLista();
        
        panel.setViewportView(new PanelDibujoUsuario(listaUsuario.size(), "", listaUsuario));
        JOptionPane.showMessageDialog(null, "Lista Eliminada");
    }
    

    
    //operaciones de las listicas desplegables que hay abajo. 
    
    public void operacioneComboBox() {
        //Elimina por la clave del nodo
        if (menuoperaciones.getSelectedItem().equals("Eliminar Elemento")) {
            eliminar();
           
        } 
        //Elimina la lista
        
        if(menuoperaciones.getSelectedItem().equals("Eliminar Lista")){
            eliminar2();
            
        }
        //Elimina el primer nodo
        if (menuoperaciones.getSelectedItem().equals("Eliminar Inicio")) {
            listaUsuario.eliminarInicio();
            panel.setViewportView(new PanelDibujoUsuario(listaUsuario.size(), "", listaUsuario));
           
        }
        //Elimina el ultimo nodo de la lista
        if (menuoperaciones.getSelectedItem().equals("Eliminar Final")) {
            listaUsuario.eliminarFinal();
           panel.setViewportView(new PanelDibujoUsuario(listaUsuario.size(), "", listaUsuario));
        }
        
        //Inserta un elemento, nodo, decir información. 

        if(menuoperaciones.getSelectedItem().equals("Insertar Elemento")){
            establecerClienteInicio();
            
        }
        //Cuenta los nodos de la lista. 
        if(menuoperaciones.getSelectedItem().equals("Contar Elementos")){
            JOptionPane.showMessageDialog(null, "El tamaño de la lista es:" + (listaUsuario.size()));
        }
        //Modifica el elemento del nodo. 
        if(menuoperaciones.getSelectedItem().equals("Modificar Elemento")){
            int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave del elemento"));
            Usuario usu = new Usuario(cedula.getText(),apellido.getText(),nombre.getText(),Telefono.getText(),Celular.getText(),Perfil.getSelectedItem().toString(),FechaNacimiento.getText(),CorreoElectronico.getText(),Contraseña.getPassword().toString(),ConfirmarContraseña.getPassword().toString());
            listaUsuario.modificar(valor, usu);
            panel.setViewportView(new PanelDibujoUsuario(listaUsuario.size(), "", listaUsuario));
        }
        //Busca un elemento del nodo, por su cedula. 
        if(menuoperaciones.getSelectedItem().equals("Buscar por Cédula")){
            
            buscarCedula();
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. Esto es mierdaaaa, código generado. 
     */
    
    //Eventos de los botones. 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedula = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        Perfil = new javax.swing.JComboBox();
        Telefono = new javax.swing.JTextField();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel = new javax.swing.JScrollPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Celular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FechaNacimiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CorreoElectronico = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ConfirmarContraseña = new javax.swing.JPasswordField();
        Contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        cedula.setToolTipText("Dijita tu Cédula ");
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        apellido.setToolTipText("Dijita tu Apellido");
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        nombre.setToolTipText("Dijita tu Nombre ");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        Perfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lector", "Administrador" }));
        Perfil.setToolTipText("Selecciona tu Perfil ");
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });

        Telefono.setToolTipText("Dijita tu Teléfono");
        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
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

        menuoperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Insertar Elemento", "Modificar Elemento", "Buscar por Cédula", "Contar Elementos", "Eliminar Elemento", "Eliminar Inicio", "Eliminar Final", "Eliminar Lista", "" }));
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

        jLabel1.setText("* Cédula:");

        jLabel2.setText("* Apellidos:");

        jLabel3.setText("* Nombres:");

        jLabel4.setText("*Perfil:");

        jLabel5.setText("* Teléfono:");

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setText("Gestión Usuarios");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(202, 37, 37));
        jLabel7.setText("Gráfico:");

        Celular.setToolTipText("Dijita tu Celular");
        Celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelularActionPerformed(evt);
            }
        });

        jLabel8.setText("* Celular:");

        FechaNacimiento.setToolTipText("Dijita tu Fecha de Nacimiento");
        FechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaNacimientoActionPerformed(evt);
            }
        });

        jLabel9.setText("* Fecha de Nacimiento:");

        CorreoElectronico.setToolTipText("Dijita tu Correo Electronico");
        CorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoElectronicoActionPerformed(evt);
            }
        });

        jLabel10.setText("* Correo Electronico:");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Campos marcados con asterisco (*) son obligatorios");

        jLabel12.setText("* Contraseña:");

        jLabel13.setText("* Repite la Contraseña:");

        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cedula, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Perfil, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8)
                                            .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FechaNacimiento)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CorreoElectronico))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 5, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12)))
                                    .addComponent(ConfirmarContraseña)
                                    .addComponent(Contraseña)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(menuoperaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(salir)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuoperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoActionPerformed

    private void menuoperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuoperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuoperacionesActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

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
        
        if (cedula.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa una Cédula");
        }else if (nombre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa un Nombre");
        }else if (Celular.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa un Celular");
        }else if (FechaNacimiento.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa una Fecha de Nacimiento");
        }else if (Contraseña.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa tu Contraseña");
        }else if (Perfil.getSelectedItem().toString().length() == 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un Perfil");
        }else if (apellido.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa un Apellido");
        }else if (Telefono.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa un Telefono");
        }else if (CorreoElectronico.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa un Correo Electrónico");
        }else if (ConfirmarContraseña.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vuelve a Ingresar tu Contraseña");
        }else 
        operacioneComboBox();
    }//GEN-LAST:event_calcularActionPerformed
    
    
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_buscarActionPerformed

    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
        // TODO ad your handling code here:
    }//GEN-LAST:event_PerfilActionPerformed

    private void CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularActionPerformed

    private void FechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaNacimientoActionPerformed

    private void CorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoElectronicoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Celular;
    private javax.swing.JPasswordField ConfirmarContraseña;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField CorreoElectronico;
    private javax.swing.JTextField FechaNacimiento;
    private javax.swing.JComboBox Perfil;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JToggleButton calcular;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox menuoperaciones;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombre;
    private javax.swing.JScrollPane panel;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
