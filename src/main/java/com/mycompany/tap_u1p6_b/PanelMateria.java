/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tap_u1p6_b;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.tap_u1p6_b.pojos.Materia;
import com.mycompany.tap_u1p6_b.pojos.Subtema;
import com.mycompany.tap_u1p6_b.pojos.Tema;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author hfyh
 */
public class PanelMateria extends javax.swing.JPanel {

    /**
     * Creates new form PanelMateria
     */
    private Materia materia;
    private String nombreMateria;
    private ArrayList<Tema> temas = new ArrayList<>();
    private JPanel panelTemas;
    
    
    public PanelMateria() {
        initComponents();
    }
    public PanelMateria(Materia materia, JPanel panelTemas) {
        this.panelTemas = panelTemas;
        this.temas = materia.getTemas();
        this.materia = materia;
        this.nombreMateria = this.materia.getNombreMateria();
        initComponents();
        lblMateria.setText(this.nombreMateria);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMateria = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMateria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMateria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria.setText("Nombre de la materia");
        add(lblMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 191, 42));

        btnVer.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 10, -1, -1));

        btnPDF.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnPDF.setText("PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        // TODO add your handling code here:
        Document documento = new Document();
        
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Escritorio/"+this.nombreMateria+".pdf"));
            documento.open();
            Image imagenSep = Image.getInstance("src\\main\\java\\Images\\logoSep.png");
            imagenSep.scaleToFit(100, 50);
            Image imagenTecnm = Image.getInstance("src\\main\\java\\Images\\logoTecnm.png");
            imagenTecnm.scaleToFit(60, 50);
            Image imagenITM = Image.getInstance("src\\main\\java\\Images\\logoITM.png");
            imagenITM.scaleToFit(60, 50);
            
            PdfPTable tablaImagenes = new PdfPTable(3);
            PdfPCell img1 = new PdfPCell(imagenITM);
            PdfPCell img2 = new PdfPCell(imagenSep);
            PdfPCell img3 = new PdfPCell(imagenTecnm);
            
            img1.setBorder(PdfPCell.NO_BORDER);
            img2.setBorder(PdfPCell.NO_BORDER);
            img3.setBorder(PdfPCell.NO_BORDER);
            
            tablaImagenes.addCell(img1);
            tablaImagenes.addCell(img2);
            tablaImagenes.addCell(img3);
            
            documento.add(tablaImagenes);
            
            Paragraph titulo1 = new Paragraph("\n1. Datos generales de la asignatura\n\n", 
                    FontFactory.getFont(FontFactory.HELVETICA, 14));
            titulo1.setAlignment(Element.ALIGN_LEFT); 
            documento.add(titulo1);
            PdfPTable tablaTitulo = new PdfPTable(2);
            tablaTitulo.addCell("Materia: "+this.nombreMateria);
            tablaTitulo.addCell("Objetivo: \n"+this.materia.getObjectivoMateria()+"\n");
            documento.add(tablaTitulo);
            
            Paragraph titulo2 = new Paragraph("\n2. Temario\n\n", 
                    FontFactory.getFont(FontFactory.HELVETICA, 14));
            titulo2.setAlignment(Element.ALIGN_LEFT); 
            documento.add(titulo2);
            PdfPTable tablaCuerpo = new PdfPTable(3);
            tablaCuerpo.addCell("No. ");
            tablaCuerpo.addCell("Tema ");
            tablaCuerpo.addCell("Subtemas ");
            for (int i = 0; i < temas.size(); i++) {
                Tema t = temas.get(i);
                tablaCuerpo.addCell(String.valueOf(i+1));
                tablaCuerpo.addCell(t.getTituloTema());
                tablaCuerpo.addCell(obtenerSubtemas(t, i));
            }
            documento.add(tablaCuerpo);
            documento.close();
            System.out.println("PDF Creado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        generarPaneles();
    }//GEN-LAST:event_btnVerActionPerformed

    private void generarPaneles(){
        panelTemas.setLayout(new BoxLayout(panelTemas, BoxLayout.Y_AXIS));
        this.panelTemas.removeAll();
        for (Tema t : temas) {
            PanelTema panel = new PanelTema(t);
            panelTemas.add(panel);
        }
        panelTemas.revalidate();
        panelTemas.repaint();
        panelTemas.updateUI();
    }
    
    private String obtenerSubtemas(Tema t, int index){
        String subtemasFormateados ="";
        ArrayList<Subtema> listaSubtemas = new ArrayList<>();
        listaSubtemas = t.getSubtemas();
        for (int i = 0; i < listaSubtemas.size(); i++) {
            Subtema sub = listaSubtemas.get(i);
            String tituloSubtema = sub.getTituloSubtema();
            subtemasFormateados+=(index+1)+"."+(i+1)+" "+tituloSubtema+"\n";
        }
        
        return subtemasFormateados;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel lblMateria;
    // End of variables declaration//GEN-END:variables
}
