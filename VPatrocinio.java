/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controles.Conexion;
import Controles.JugadorData;
import Modelos.Jugador;
import java.util.ArrayList;

/**
 *
 * @author salva
 */
public class VPatrocinio extends javax.swing.JInternalFrame {
private ArrayList <Jugador> listaJugadores;

    /**
     * Creates new form Patrocini
     */
    public VPatrocinio() {
        initComponents();
        this.cargarJugadores();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbActivo = new javax.swing.JCheckBox();
        jcSponsor = new javax.swing.JComboBox<>();
        jcJugador = new javax.swing.JComboBox<>();
        jcIndumentaria = new javax.swing.JComboBox<>();
        jcModificar = new javax.swing.JButton();
        jbCargar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jtfPatrocinio = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        jLabel1.setText("Patrocinio");

        jLabel2.setText("Sponsor");

        jLabel3.setText("Jugador");

        jLabel6.setText("Indumentaria");

        jLabel4.setText("Activo");

        jcSponsor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nike", "Adidas", "Fila", "Lotto", "Lacoste", "Wilson", "Babolat", "Head", "Asics" }));

        jcJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcJugadorActionPerformed(evt);
            }
        });

        jcIndumentaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zapatillas", "Ropa", "Raqueta" }));

        jcModificar.setText("Modificar");

        jbCargar.setText("Cargar");

        jbLimpiar.setText("Limpiar");

        jbEliminar.setText("Eliminar");

        jbBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jcbActivo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jcIndumentaria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcSponsor, 0, 277, Short.MAX_VALUE)
                                    .addComponent(jcJugador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtfPatrocinio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jbBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jcModificar)
                        .addGap(38, 38, 38)
                        .addComponent(jbCargar)
                        .addGap(35, 35, 35)
                        .addComponent(jbLimpiar)
                        .addGap(35, 35, 35)
                        .addComponent(jbEliminar)))
                .addGap(46, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPatrocinio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcIndumentaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcModificar)
                    .addComponent(jbCargar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbEliminar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void cargarJugadores(){
          Conexion c = new Conexion();
          JugadorData jData = new JugadorData(c);
          ArrayList<Jugador>listaJugadores = (ArrayList)jData.obtenerJugadores();
          for(Jugador jugador : listaJugadores){
              jcJugador.addItem(jugador);
          }
     }
         
    private void jcJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcJugadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcIndumentaria;
    private javax.swing.JComboBox<Jugador> jcJugador;
    private javax.swing.JButton jcModificar;
    private javax.swing.JComboBox<String> jcSponsor;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JTextField jtfPatrocinio;
    // End of variables declaration//GEN-END:variables
}