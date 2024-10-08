/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tap_u1p6_b;

import com.mycompany.tap_u1p6_b.pojos.Tema;

/**
 *
 * @author hfyh
 */
public class PanelTema extends javax.swing.JPanel {

    /**
     * Creates new form PanelTema
     */
    private Tema tema;
    
    public PanelTema() {
        initComponents();
    }
    
    public PanelTema(Tema tema) {
        this.tema = tema;
        String nombreTema = this.tema.getTituloTema();
        initComponents();
        lblTituloTema.setText(nombreTema);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloTema = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloTema.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTituloTema.setText("Nombre de tema");
        add(lblTituloTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 174, 42));

        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setText("Ver subtemas");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 10, -1, -1));

        jButton2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton2.setText("Borrar");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 10, 87, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblTituloTema;
    // End of variables declaration//GEN-END:variables
}
