package com.mycompany.oumaima;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Interface_infirmier extends javax.swing.JFrame {

    /**
     * Creates new form Interface_infirmier
     */
    public Interface_infirmier() {
        initComponents();
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
        BtnMesures_inf = new javax.swing.JButton();
        BtnConsultationInfoPatient = new javax.swing.JButton();
        BtnModificationFicheMed_inf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Page Infirmier ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 22, 360, 80);

        BtnMesures_inf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnMesures_inf.setForeground(new java.awt.Color(0, 153, 153));
        BtnMesures_inf.setText("Effectuer des mesures");
        BtnMesures_inf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(BtnMesures_inf);
        BtnMesures_inf.setBounds(30, 170, 210, 70);

        BtnConsultationInfoPatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnConsultationInfoPatient.setForeground(new java.awt.Color(0, 153, 153));
        BtnConsultationInfoPatient.setText("Consulter Dossier Patient");
        BtnConsultationInfoPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(BtnConsultationInfoPatient);
        BtnConsultationInfoPatient.setBounds(540, 170, 220, 70);

        BtnModificationFicheMed_inf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnModificationFicheMed_inf.setForeground(new java.awt.Color(0, 153, 153));
        BtnModificationFicheMed_inf.setText("Modifier fiche médicale");
        BtnModificationFicheMed_inf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(BtnModificationFicheMed_inf);
        BtnModificationFicheMed_inf.setBounds(271, 170, 230, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Interface_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_infirmier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultationInfoPatient;
    private javax.swing.JButton BtnMesures_inf;
    private javax.swing.JButton BtnModificationFicheMed_inf;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
