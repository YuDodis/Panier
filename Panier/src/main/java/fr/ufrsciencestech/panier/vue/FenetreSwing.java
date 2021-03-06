/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.vue;

import fr.ufrsciencestech.panier.controller.ControllerButton;
import fr.ufrsciencestech.panier.modele.*;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author ar948052
 */
public class FenetreSwing extends javax.swing.JFrame implements Observer{

    private Panier panier;
    
    /**
     * Creates new form fenetre
     * @param p
     */
    public FenetreSwing(Panier p) {
        initComponents();
        panier = p;
        ControllerButton cb = new ControllerButton(panier,"");
        jButtonPlus.addActionListener(cb);
        jButtonMoins.addActionListener(cb);
        
        this.setVisible(true);
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
        jButtonPlus = new javax.swing.JButton();
        jButtonMoins = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jButtonPlus.setText("+");
        jButtonPlus.setName("plus"); // NOI18N

        jButtonMoins.setText("-");
        jButtonMoins.setName("moins"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButtonPlus)))
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jButtonMoins)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPlus)
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jButtonMoins)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMoins;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {        
        Panier p = (Panier)o;
        this.jLabel1.setText(p.getCapacite()+"");
    }
}
