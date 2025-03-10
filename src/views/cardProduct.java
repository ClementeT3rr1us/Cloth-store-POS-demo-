/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Clemente
 */
public class cardProduct extends javax.swing.JPanel {

    /**
     * Creates new form cardProduct
     */
    public cardProduct(String name, String code, String quant, String price) {
        initComponents();
        
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        cardContent.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        lblPeoductName.setText(name);
        lblCode.setText("código: "+code);
        lblQuant.setText("Disponivel: "+quant);
        lblPrice.setText("código: "+price+"kzs");
        
        ImageIcon img = new ImageIcon("src/imgs/cloth_4.jpg");
        img.setImage(img.getImage().getScaledInstance(150, 150, 1));
        lblProductPhoto.setIcon(img);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardContent = new views.DashboardCard();
        lblProductPhoto = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        lblQuant = new javax.swing.JLabel();
        lblPeoductName = new javax.swing.JLabel();

        lblProductPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(153, 153, 153));
        lblPrice.setText("15.000 kxs");

        lblCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCode.setForeground(new java.awt.Color(204, 204, 204));
        lblCode.setText("código: 43632832");

        lblQuant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuant.setForeground(new java.awt.Color(204, 204, 204));
        lblQuant.setText("Disponivel: 204");

        lblPeoductName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPeoductName.setForeground(new java.awt.Color(153, 153, 153));
        lblPeoductName.setText("Nome do produto");

        javax.swing.GroupLayout cardContentLayout = new javax.swing.GroupLayout(cardContent);
        cardContent.setLayout(cardContentLayout);
        cardContentLayout.setHorizontalGroup(
            cardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCode)
                    .addComponent(lblQuant)
                    .addComponent(lblPeoductName))
                .addContainerGap())
        );
        cardContentLayout.setVerticalGroup(
            cardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardContentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblProductPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeoductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardContent, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardContent, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.DashboardCard cardContent;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblPeoductName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductPhoto;
    private javax.swing.JLabel lblQuant;
    // End of variables declaration//GEN-END:variables
}
